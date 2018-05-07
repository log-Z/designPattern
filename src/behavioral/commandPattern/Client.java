package behavioral.commandPattern;

import java.awt.Color;

/**
 * 设计模式 - 命令
 *
 * 意图：    将一个请求（即命令）封装为一个对象，从而使得可以用不同的请求对客户进行参数化；
 *           对请求排队或记录请求日志，以及支持可撤销的操作。
 *           触发者 <>--> 命令对象 --> 接收者。
 * 使用案例：可重复使用的命令，以及不希望触发者知道的接收者。
 * 备注：    撤销功能是可选的。
 */
public class Client {

    public static void main(String[] args) {
        // 不同颜色的灯
        var redLight = new Light(Color.red);
        var greenLight = new Light(Color.green);
        // 实例化命令
        var openRedLight = new TurnOnCommand(redLight);
        var downRedLight = new TurnOffCommand(redLight);
        var openGreenLight = new TurnOnCommand(greenLight);
        var downGreenLight = new TurnOffCommand(greenLight);
        // 实例化开关
        var mySwitch = new Switch();

        // 传递指令
        mySwitch.onAction(openRedLight);
        mySwitch.onAction(openGreenLight);
        mySwitch.onAction(downRedLight);
        mySwitch.onAction(downGreenLight);
        // 回滚
        mySwitch.lollBack(openRedLight);
    }

}
