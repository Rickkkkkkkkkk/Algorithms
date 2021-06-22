package chap1.stack;

import java.util.Iterator;

public class StackArray<T> implements Stack<T>{

    private int top;

    private T[] items;

    public StackArray() {
        items = (T[])new Object[10];
    }

    public StackArray(int capacity) {
        items = (T[])new Object[capacity];
    }

    @Override
    public void push(T item) {
        if (top == items.length) {
            resize(items.length * 2);
        }

        items[top++] = item;
    }

    @Override
    public T pop() {
        if (top == 0) return null;

        T item = items[top - 1];
        items[--top] = null;

        if (top < items.length / 4) resize(items.length / 2);

        return item;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    private void resize(int capacity) {
        T[] newItems = (T[]) new Object[capacity];
        for (int i = 0; i < top; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {

        private int current = top;

        @Override
        public boolean hasNext() {
            return current > 0;
        }

        @Override
        public T next() {
            return items[--current];
        }
    }
}
