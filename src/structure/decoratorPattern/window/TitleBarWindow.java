package structure.decoratorPattern.window;

public class TitleBarWindow extends WindowDecorator {

    public TitleBarWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        decoratorWindow.draw();
        System.out.print(" + Title");
    }

}
