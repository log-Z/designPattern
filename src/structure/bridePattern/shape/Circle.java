package structure.bridePattern.shape;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("圆：颜色 = " + color.getColor());
    }

}
