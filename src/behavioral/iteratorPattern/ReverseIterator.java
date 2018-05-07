package behavioral.iteratorPattern;

public class ReverseIterator<T> implements Iterator<T> {

    private final Aggregate<T> aggregate;
    private int index;

    ReverseIterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
        first();
    }

    @Override
    public void first() {
        index = aggregate.size() - 1;
    }

    @Override
    public void next() {
        --index;
    }

    @Override
    public boolean isDone() {
        return index < 0;
    }

    @Override
    public T currentItem() {
        return aggregate.get(index);
    }

}
