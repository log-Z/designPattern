package behavioral.iteratorPattern;

public interface Aggregate<T> {

    Iterator createIterator();

    T get(int i);

    int size();

}
