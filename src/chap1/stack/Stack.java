package chap1.stack;

public interface Stack<T> extends Iterable<T> {

    void push(T item);

    T pop();

    int size();

    boolean isEmpty();
}
