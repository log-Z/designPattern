package structure.flyweightPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ComputerFlyweightFactory {

    private final static ComputerFlyweightFactory INSTANCE = new ComputerFlyweightFactory();
    private Map<String, ComputerFlyweight> fsMap = new HashMap<>();

    private ComputerFlyweightFactory() {
    }

    public static ComputerFlyweightFactory getInstance() {
        return INSTANCE;
    }

    public ComputerFlyweight getGPUFlyweight(String model, String version) {
        final String key = getKey(model, version);
        ComputerFlyweight flyweight = fsMap.get(key);

        if (flyweight == null) {
            flyweight = new GPUFlyweight(model, version);
            fsMap.put(key, flyweight);
        }
        return flyweight;
    }

    public ComputerFlyweight getMotherboardFlyweight(String model) {
        final String key = getKey(model, null);
        ComputerFlyweight flyweight = fsMap.get(key);

        if (flyweight == null) {
            flyweight = new MotherboardFlyweight(model);
            fsMap.put(key, flyweight);
        }
        return flyweight;
    }

    private String getKey(String model, String version) {
        return model + " " + version;
    }

}
