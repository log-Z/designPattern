package structure.bridePattern;

import structure.bridePattern.color.Color;
import structure.bridePattern.color.Green;
import structure.bridePattern.color.Red;
import structure.bridePattern.shape.Circle;
import structure.bridePattern.shape.Polygon;
import structure.bridePattern.shape.Shape;

/**
 * 设计模式 - 桥接
 *
 * 意图：    将抽象部分与其实现部分分离，使它们都可以独立地变化
 * 使用案例：图形类与颜色类，窗口类与窗口风格类等
 * 备注：    实质是把部分继承关系转化为关联关系，使部分抽象（即共有）成员独立成类
 */
public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape polygon = new Polygon();
        Color red = new Red();
        Color green = new Green();

        circle.setColor(red);
        circle.draw();

        circle.setColor(green);
        circle.draw();

        polygon.setColor(red);
        polygon.draw();

        polygon.setColor(green);
        polygon.draw();
    }

}
