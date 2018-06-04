package org.linker.strategy;

import org.linker.strategy.region.CalPrice;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RWM
 * @date 2018/6/1
 */
public class CalPriceFactory {

    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance {
        private static CalPriceFactory instance = new CalPriceFactory();
    }

    private CalPriceFactory() {
        init();
    }

    private static List<Class<? extends CalPrice>> calPriceList;// 策略列表
    private static final String CAL_PRICE_PACKAGE = "org.linker.strategy.region";// 扫描策略的包名
    private ClassLoader classLoader = getClass().getClassLoader();



    // 根据客户的总金额产生相应的策略
    public CalPrice createCalPrice(Player player) {
        // 在策略列表查找策略
        for (Class<? extends CalPrice> clazz : calPriceList) {
            PriceRegion validRegion = handleAnnotation(clazz);
            if (player.getTotalAmount() >= validRegion.min() && player.getTotalAmount() < validRegion.max()) {
                try {
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("策略获得失败");
                }
            }
        }
        throw new RuntimeException("策略获得失败");
    }

    // 处理注解，我们传入一个策略类，返回它的注解
    private PriceRegion handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (Annotation annotation : annotations) {
            if (annotation instanceof PriceRegion) {
                return (PriceRegion) annotation;
            }
        }
        return null;
    }

    // 在工厂初始化时要初始化策略列表
    private void init() {
        calPriceList = new ArrayList<>();
        File[] resources = getResources();
        Class<CalPrice> calPriceClazz;
        try {
            calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("未找到策略接口");
        }
        for (File resource : resources) {
            try {
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resource.getName().replace(".class", ""));
                // 判断是否是CalPrice的实现类并且不是CalPrice它本身，满足的话加入到策略列表
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    // 获取扫描的包下面所有的class文件
    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(pathname -> pathname.getName().endsWith(".class"));
        } catch (Exception e) {
            throw new RuntimeException("未找到策略资源");
        }
    }


}
