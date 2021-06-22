package chap1.stack;

import java.util.Iterator;

public class StackLink<T> implements Stack<T> {

    private Node first;

    private int size;

    public void push(T item) {
        first = new Node(item, first);
        size++;
    }

    public T pop() {
        if (first == null) return null;

        Node node = first;
        first = first.next;

        size--;

        return node.item;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            Node item = current;
            current = current.next;
            return item.item;
        }
    }


    private class Node {
        private T item;

        private Node next;

        public Node (T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
