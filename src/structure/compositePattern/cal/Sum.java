package structure.compositePattern.cal;

import java.util.ArrayList;

public class Sum extends Component {

    private ArrayList<Component> components = new ArrayList<>();

    @Override
    public double getValue() {
        double value = 0;
        for (Component components : components) {
            value += components.getValue();
        }
        return value;
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        int index = components.indexOf(component);
        components.remove(index);
    }

    @Override
    public String toString() {
        final String sep = ", ";  // 分隔符
        StringBuilder sb = new StringBuilder("Sum(");
        for (Component components : components) {
            sb.append(components.toString());
            sb.append(sep);
        }
        sb.delete(sb.length() - sep.length(), sb.length());  // 删除末尾分隔符
        sb.append(")");
        return sb.toString();
    }
}
