package create.builderPattern;

import create.builderPattern.builder.LaoyouRiceNoodlesBuilder;
import create.builderPattern.builder.LuosifenBuilder;

/**
 * 设计模式 - 生成器
 *
 * 意图：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 使用案例：以服务员为中间人的生产过程。  （例如，餐厅）
 *           导向器类      ->  服务员
 *           基类生成器类  ->  厨师大类  （例如，粉面厨师）
 *           产品生成器类  ->  具体厨师  （例如，老友粉厨师和螺蛳粉厨师）
 *           产品类        ->  食品      （例如，老友粉和螺蛳粉）
 * 备注：所有产品的类型相同，但属性值不同，而且只是大类，并不是具体类型。
 */
public class Client {

    public static void main(String[] args) {
        // 建立产品生成器
        LaoyouRiceNoodlesBuilder laoyouRiceNoodlesBuilder = new LaoyouRiceNoodlesBuilder();
        LuosifenBuilder luosifenBuilder = new LuosifenBuilder();
        // 建立导向器
        Waiter waiter = new Waiter();
        // 产品（所有产品的类型相同）
        Noodles noodles;

        // 把产品生成器绑定到导向器
        waiter.setNoodlesBuilder(laoyouRiceNoodlesBuilder);
        // 构建产品（通过导向器）
        if (waiter.constructNoodles()) {
            // 取出产品（通过导向器）
            noodles = waiter.getNoodles();
            print(noodles);
        }

        waiter.setNoodlesBuilder(luosifenBuilder);
        if (waiter.constructNoodles()) {
            noodles = waiter.getNoodles();
            print(noodles);
        }
    }

    private static void print(Noodles noodles) {
        System.out.println("noodlesName: " + noodles.name);
        System.out.println("noodleShape: " + noodles.noodleShape);
        System.out.println("noodleWidth: " + noodles.noodleWidth);
        System.out.println("ingredients: " + noodles.ingredients);
        System.out.println();
    }

}
