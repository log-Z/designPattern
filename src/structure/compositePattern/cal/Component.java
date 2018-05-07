package structure.compositePattern.cal;

public abstract class Component {

    public abstract double getValue();

    public void addComponent(Component component) {
        // 抛出异常，子类需要重写此方法之后才可用
        throw new UnsupportedOperationException("此对象不是容器，不可添加元素！");
    }

    public void removeComponent(Component component) {
        throw new UnsupportedOperationException("此对象不是容器，不可移除元素！");
    }

}
