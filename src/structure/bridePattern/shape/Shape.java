package structure.bridePattern.shape;

import structure.bridePattern.color.Color;

public abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
