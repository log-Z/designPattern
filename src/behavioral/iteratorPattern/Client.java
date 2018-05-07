package behavioral.iteratorPattern;

/**
 * 设计模式 - 迭代器
 *
 * 意图：    提供一种访问一个聚合对象的各个元素，且不需要暴露该对象的内部表示。
 * 使用案例：适用于所有集合类。
 * 备注：    可以在迭代器中添加foreach方法，以简化用户代码。
 */
public class Client {

    public static void main(String[] args) {
        var array = new Integer[] {1, 2, 3, 4, 5, 6, 7};
        var arrayAggregate = new ArrayAggregate<>(array);
        var iterator = arrayAggregate.createIterator();

        while (!iterator.isDone()) {
            var value = iterator.currentItem();
            System.out.println(value);

            iterator.next();
        }

        iterator.first();
        var value = iterator.currentItem();
        System.out.println(value);
    }

}
