package structure.adapterPattern.interfaceAdapter;

/**
 * 设计模式 - 适配器（接口适配器，或缺省适配器）
 *
 * 意图：    实现接口的所有方法，使用时以适配器替代该接口，从而简化代码
 * 使用案例：包含回调方法的接口（如，监听器）
 *           src      ->  Listener类
 *           adapter  ->  Adapter类
 *           dst      ->  Adapter类
 * 备注：    使用接口来指定来源（实现）
 *           适配器需要是抽象类，防止直接被实例化
 */
public class Client {

    public static void main(String[] args) {
        // 使用适配器
        // 可以只重写我关心的事件方法
        TouchListener tL1 = new TouchAdapter() {
            @Override
            public void onClick() {
                super.onClick();
            }
        };
        TouchListener tL2 = new TouchAdapter() {
            @Override
            public void onLongClick() {
                super.onLongClick();
            }
        };

        // 不使用适配器
        // 所有事件方法都需要重写
        TouchListener tL3 = new TouchListener() {
            @Override
            public void onClick() {

            }

            @Override
            public void onLongClick() {

            }
        };
    }

}
