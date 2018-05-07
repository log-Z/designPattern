package structure.compositePattern.cal;

public class Number extends Component {

    private double mValue;

    public Number(double value) {
        mValue = value;
    }

    @Override
    public double getValue() {
        return mValue;
    }

    @Override
    public String toString() {
        return String.valueOf(mValue);
    }

}
