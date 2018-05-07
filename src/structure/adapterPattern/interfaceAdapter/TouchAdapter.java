package structure.adapterPattern.interfaceAdapter;

// 需要是抽象方法，防止直接被实例化
public abstract class TouchAdapter implements TouchListener {

    @Override
    public void onClick() {
    }

    @Override
    public void onLongClick() {
    }

}
