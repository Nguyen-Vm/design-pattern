package org.linker._08_factory_method;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class SimpleFactory {

    public static LeiFeng createLeiFeng(String type) {
        LeiFeng leiFeng = null;
        switch (type) {
            case "学雷锋的大学生":
                leiFeng = new Undergraduate();
                break;
            case "社区志愿者":
                leiFeng = new Volunteer();
                break;
        }
        return leiFeng;
    }
}
