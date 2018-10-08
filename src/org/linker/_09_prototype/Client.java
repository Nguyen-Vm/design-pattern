package org.linker._09_prototype;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Client {

    /**
     * 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
     * 原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不需知道任何创建的细节。
     *
     *
     * 实现对象克隆的一般步骤(浅克隆)：
     * 1.被复制的类需要实现Cloneable接口；
     * 2.重写clone方法，访问修饰符设为public。方法中调用super.clone()方法得到需要的复制对象。
     *
     *
     * 浅克隆：被复制对象的所有变量都含有与原来对象相同的值，而引用类型变量都仍然指向原来的对象。
     * 所有类都实现对象克隆，浅克隆实现深克隆。
     *
     * 深克隆：除了对象本身被复制外，对象所包含的所有成员变量也将复制。
     * 如果克隆类的引用类型多层嵌套引用类型，方便起见，可以考虑对象的序列化实现深克隆。
     */
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonInfo("男", 23);
        a.setWorkExperience("2000-2018", "XX公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2017-2020", "YY公司");

        Resume c = (Resume) a.clone();
        c.setPersonInfo("女", 28);

        a.display();
        b.display();
        c.display();
    }
}
