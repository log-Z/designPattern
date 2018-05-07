package structure.bridePattern.shape;

public class Polygon extends Shape {

    @Override
    public void draw() {
        System.out.println("多边形：颜色 = " + color.getColor());
    }

}
