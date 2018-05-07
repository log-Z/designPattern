package create.factoryMethodPattern.method1;

import create.factoryMethodPattern.method1.button.Button;
import create.factoryMethodPattern.method1.factory.ButtonFactory;
import create.factoryMethodPattern.method1.factory.MacButtonFactory;
import create.factoryMethodPattern.method1.factory.WinButtonFactory;

/**
 * 设计模式 - 工厂方法（一般）
 *
 * 意图：     定义一个用于构建对象的抽象类，让子类决定实例化哪个类。
 *            使一个（抽象）类的实例化过程推迟到其子类。
 * 使用案例： 不同样式的按钮。
 *            工厂类    ->  按钮工厂
 *            产品基类  ->  按钮
 *            产品类    ->  各种样式的按钮（例如，Windows样式和Mac样式）
 * 备注：     获取到的产品对象的类型并不是具体的。
 */
public class Client {

    public static void main(String[] args) {
        ButtonFactory winButFactory = new WinButtonFactory();
        Button winBut = winButFactory.createButton();
        System.out.println("winBut = " + winBut);

        ButtonFactory macButFactory = new MacButtonFactory();
        Button macBut = macButFactory.createButton();
        System.out.println("macBut = " + macBut);
    }

}
