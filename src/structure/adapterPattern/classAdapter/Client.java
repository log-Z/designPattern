package structure.adapterPattern.classAdapter;

/**
 * 设计模式 - 适配器（类适配器）
 *
 * 意图：    使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * 使用案例：对象适配器不能满足使用时
 *           src      ->  DCPower类
 *           adapter  ->  PowerAdapter类
 *           dst      ->  ACPower接口
 * 备注：    使用父类来指定来源（继承）
 */
public class Client {

    public static void main(String[] args) {
        ACPower ac = new PowerAdapter();
        ac.outputAC5V(11);
    }

}
