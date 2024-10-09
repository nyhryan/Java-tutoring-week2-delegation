package example;

public class GoodStack<E> {
    private final LinkedList<E> list = new LinkedList<>();

    public void push(E data) {
        list.addFirst(data);
    }

    public E pop() {
        return list.removeFirst();
    }
}
