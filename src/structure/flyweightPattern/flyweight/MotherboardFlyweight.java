package structure.flyweightPattern.flyweight;

public class MotherboardFlyweight implements ComputerFlyweight {

    public static final String MODEL_1 = "motherboard model 1";
    public static final String MODEL_2 = "motherboard model 2";
    private final String model;

    MotherboardFlyweight(String model) {
        this.model = model;
    }

    @Override
    public boolean match(String model, String version) {
        return this.model.equals(model);
    }

    @Override
    public void add(ComputerFlyweight flyweight) {
        throw new UnsupportedOperationException("MotherboardFlyweight对象不允许包含子元素");
    }

}
