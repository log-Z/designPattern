package create.abstractFactoryPattern;

import create.abstractFactoryPattern.Factory.LenovoFactory;
import create.abstractFactoryPattern.Factory.XiaomiFactory;
import create.abstractFactoryPattern.Product.computer.Computer;
import create.abstractFactoryPattern.Product.phone.Phone;

/**
 * 设计模式 - 抽象工厂
 *
 * 意图：    提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
 * 使用案例：某些品牌的一系列产品都相关的生产过程。（例如，小米和联想的电子产品都有电脑和手机）
 *           抽象工厂类  ->  产品大类  （例如，数码产品）
 *           工厂类      ->  品牌      （例如，小米和联想）
 *           工厂类方法  ->  产品类别  （例如，电脑和手机）
 *           抽象产品类  ->  产品类别
 *           产品类      ->  品牌
 * 备注：    工厂与产品的结构分层顺序是相反的。
 */
public class Client {

    public static void main(String[] args) {
        // 先获取工厂对象
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        LenovoFactory lenovoFactory = new LenovoFactory();
        // 再通过工厂建立产品对象，但是得到产品对象的类型不是具体的。
        Computer computer1 = lenovoFactory.createComputer();
        Computer computer2 = xiaomiFactory.createComputer();
        Phone phone1 = lenovoFactory.createPhone();
        Phone phone2 = xiaomiFactory.createPhone();

        System.out.println("computer1 = " + computer1);
        System.out.println("computer2 = " + computer2);
        System.out.println("phone1 = " + phone1);
        System.out.println("phone2 = " + phone2);
    }

}
