package structure.facadePattern;

/**
 * 设计模式 - 外观
 *
 * 意图：    为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 使用案例：设计几套常用的处理方案（即黑箱子，如电脑），使用户不用从头构建，同时用户也不必关系其内部结构和实现。
 * 备注：    如需更高级的功能，则需要用户自定义处理方案。
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }

}
