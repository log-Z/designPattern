package structure.flyweightPattern;

import structure.flyweightPattern.flyweight.GPUFlyweight;
import structure.flyweightPattern.flyweight.MotherboardFlyweight;

public class Computer {

    private GPUFlyweight gpu;
    private MotherboardFlyweight motherboard;

    Computer(GPUFlyweight gpu, MotherboardFlyweight motherboard) {
        this.gpu = gpu;
        this.motherboard = motherboard;
    }

    boolean contain(String model, String version) {
        return gpu.match(model, version) || motherboard.match(model, version);
    }

}
