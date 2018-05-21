package behavioral.observerPattern

interface View {

    fun setValue(value: String)

    fun getValue() : String

    fun addOnChangeListener(listener: OnChangeListener)

    fun removeOnChangeListener(listener: OnChangeListener)

}