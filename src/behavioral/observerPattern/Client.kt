package behavioral.observerPattern

/**
 * 设计模式 - 观察者
 *
 * 意图：    定义对象间的一种一对多的依赖关系，当一个对象的状态发送改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 使用案例：事件监听器的典型的观察者。
 * 备注：    观察者可以有多个回调方法。
 */
fun main(args: Array<String>) {
    val tv = TextView()
    val listener1 = OnTextViewChangeListener()
    val listener2 = OnTextViewChangeListener()

    tv.setValue("初始值")

    tv.addOnChangeListener(listener1)
    tv.addOnChangeListener(listener2)
    tv.setValue("新的值")

    tv.removeOnChangeListener(listener1)
    tv.setValue("最后的值")
}