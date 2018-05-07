package structure.compositePattern;

import structure.compositePattern.cal.Number;
import structure.compositePattern.cal.Sum;

/**
 * 设计模式 - 组合
 *
 * 意图：    将对象组合成树形结构以表示“部分——整体”的层次结构，组合模式使用户对单个对象和组合对象的使用具有一致性。
 * 使用案例：需要把叶子类和组合类当作同一个类时，即把大家都当作是组合的基类。
 * 备注：    叶子类和组合类都需要有较多的相似点。
 *           组合模式是高透明性，且低安全性的。（对象可以调用不属于它的方法，但这些方法都会直接throws Exception）
 */
public class Client {

    public static void main(String[] args) {
        Number num1 = new Number(1);
        Number num2 = new Number(2);
        Number num3 = new Number(3);
        Number num4 = new Number(4);
        Number num5 = new Number(5);

        Sum sum1 = new Sum();
        sum1.addComponent(num2);
        sum1.addComponent(num4);

        Sum sum2 = new Sum();
        sum2.addComponent(num1);
        sum2.addComponent(num3);
        sum2.addComponent(sum1);

        Sum sum3 = new Sum();
        sum3.addComponent(num5);
        sum3.addComponent(sum2);

        System.out.println("sum1.value = " + sum1.getValue());
        System.out.println("sum2.value = " + sum2.getValue());
        System.out.println("sum3.value = " + sum3.getValue());
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println();

        sum3.removeComponent(num5);
        System.out.println("sum3.value = " + sum3.getValue());
        System.out.println("sum3 = " + sum3);
    }

}
