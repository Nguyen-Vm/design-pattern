package org.linker._14_observer;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Client {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer zhangsan = new User("张三");
        Observer lisi = new User("李四");
        Observer wangwu = new User("王五");

        server.registerObserver(zhangsan);
        server.registerObserver(lisi);
        server.registerObserver(wangwu);

        server.setInformation("PHP是世界上最好的语言！");

        System.out.println("--------------------------------");
        server.removeObserver(zhangsan);
        server.setInformation("JAVA是世界上最好的语言！");


    }
}
