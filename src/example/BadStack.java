package example;

public class BadStack<E> extends LinkedList<E> {
    public void push(E data) {
        addFirst(data);
    }

    public E pop() {
        return removeFirst();
    }
}
