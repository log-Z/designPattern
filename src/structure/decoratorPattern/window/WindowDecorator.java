package structure.decoratorPattern.window;

abstract class WindowDecorator implements Window {

    Window decoratorWindow;

    WindowDecorator(Window window) {
        decoratorWindow = window;
    }

}
