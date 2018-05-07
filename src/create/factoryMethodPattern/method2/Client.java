package create.factoryMethodPattern.method2;

/**
 * 设计模式 - 工厂方法（变种一）
 *
 * 意图：    扩展构造方法，消除歧义，以接收更多类型一样的信息。
 * 使用案例：接收“同是数值”但“单位不同”的构造参数。（例如：不同的分辨率单位）
 * 备注：    与单例模式类似。
 *           产品类的构造方法为私有，因此该类不能再扩展。
 */
public class Client {

    public static void main(String[] args) {
        // Image image0 = new Image();  // ERROR
        Image image1 = Image.createImageByPixel(50, 30);
        Image image2 = Image.createImageByPoint(50, 30);
        System.out.println("image1: width = " + image1.width + ", height = " + image1.height);
        System.out.println("image2: width = " + image2.width + ", height = " + image2.height);
    }

}
