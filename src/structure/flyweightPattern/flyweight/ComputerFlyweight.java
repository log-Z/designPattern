package structure.flyweightPattern.flyweight;

public interface ComputerFlyweight {

    boolean match(String model, String version);

    void add(ComputerFlyweight flyweight);

}
