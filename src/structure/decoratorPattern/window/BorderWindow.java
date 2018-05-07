package structure.decoratorPattern.window;

public class BorderWindow extends WindowDecorator {

    public BorderWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        decoratorWindow.draw();
        System.out.print(" + Border");
    }

}
