package behavioral.observerPattern

class OnTextViewChangeListener: OnChangeListener{

    override fun onChange(v: View) {
        println("[$this] $v on change: ${v.getValue()}")
    }

}