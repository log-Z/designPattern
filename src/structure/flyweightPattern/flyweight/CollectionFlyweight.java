package structure.flyweightPattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CollectionFlyweight implements ComputerFlyweight {

    private List<ComputerFlyweight> flyweights = new ArrayList<>();

    @Override
    public boolean match(String model, String version) {
        for (ComputerFlyweight flyweight : flyweights) {
            if (flyweight.match(model, version)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(ComputerFlyweight flyweight) {
        if (flyweight instanceof CollectionFlyweight) {
            for (ComputerFlyweight cf : ((CollectionFlyweight) flyweight).flyweights) {
                if (!flyweights.contains(cf)) {
                    flyweights.add(cf);
                }
            }
        } else {
            if (!flyweights.contains(flyweight)) {
                flyweights.add(flyweight);
            }
        }
    }

}
