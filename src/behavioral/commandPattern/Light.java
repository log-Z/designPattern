package behavioral.commandPattern;

import java.awt.Color;

class Light {

    private final Color color;

    Light(Color c) {
        color = c;
    }

    void turnOn() {
        System.out.println("[" + color.getRGB() + "] 灯点亮了");
    }

    void turnOff() {
        System.out.println("[" + color.getRGB() + "] 灯熄灭了");
    }

}
