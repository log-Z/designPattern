package structure.decoratorPattern;

import structure.decoratorPattern.window.BorderWindow;
import structure.decoratorPattern.window.SimpleWindow;
import structure.decoratorPattern.window.TitleBarWindow;
import structure.decoratorPattern.window.Window;

/**
 * 设计模式 - 装饰
 *
 * 意图：    动态地给一个对象添加一些额外的职责。就增加功能而言，装饰模式比生成子类更加灵活。
 * 使用案例：Java I/O Stream（节点流和处理流）
 * 备注：    此模式以很兼容方式的增加功能，可以很灵活的得到各种功能的组合。
 *           基本类和装饰类都必须实现同一个接口。
 */
public class Client {

    public static void main(String[] args) {
        Window sw = new SimpleWindow();
        show(sw);

        Window bw1 = new BorderWindow(sw);
        show(bw1);

        Window tbw1 = new TitleBarWindow(sw);
        show(tbw1);

        Window bw2 = new BorderWindow(tbw1);
        show(bw2);

        Window tbw2 = new TitleBarWindow(bw1);
        show(tbw2);
    }

    private static void show(Window window) {
        System.out.print("view: ");
        window.draw();
        System.out.println();
    }

}
