package structure.decoratorPattern.window;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        System.out.print("SimpleWindow");
    }

}
