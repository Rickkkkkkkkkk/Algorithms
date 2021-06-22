package chap1.queue;

import java.util.Iterator;

public class QueueLink<T> implements Queue<T> {

    private Node first;

    private Node last;

    private int size;

    @Override
    public void enqueue(T item) {
        size++;
        Node l = last;
        last = new Node(item);
        if (first == null) {
            first = last;
        } else {
            l.next = last;
        }
    }

    @Override
    public T dequeue() {
        if (first == null) return null;

        Node node = first;
        first = first.next;
        if (isEmpty()) last = null;
        size--;
        return node.item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class Node {
        T item;

        Node next;

        public Node(T item) {
            this.item = item;
        }
    }

    private class QueueIterator implements Iterator<T> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            Node node = current;
            current = current.next;
            return node.item;
        }
    }
}
