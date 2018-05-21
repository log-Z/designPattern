package behavioral.observerPattern

class TextView: View {

    private lateinit var value: String
    private val onChangeListenerSet = HashSet<OnChangeListener>()

    override fun getValue(): String {
        return value
    }

    override fun setValue(value: String) {
        this.value = value
        onChangeListenerSet.forEach { it.onChange(this) }
    }

    override fun addOnChangeListener(listener: OnChangeListener) {
        onChangeListenerSet.add(listener)
    }

    override fun removeOnChangeListener(listener: OnChangeListener) {
        onChangeListenerSet.remove(listener)
    }

}