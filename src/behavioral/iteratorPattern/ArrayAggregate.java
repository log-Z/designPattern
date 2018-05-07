package behavioral.iteratorPattern;

public class ArrayAggregate<T> implements Aggregate<T> {

    private T[] array;

    ArrayAggregate(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator createIterator() {
        return new ReverseIterator<>(this);
    }

    @Override
    public T get(int i) {
        return array[i];
    }

    @Override
    public int size() {
        return array.length;
    }

}
