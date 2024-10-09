package example;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    private Node<E> head = null;
    private int count = 0;

    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        count++;
    }

    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        E data = head.data;
        head = head.next;
        count--;
        return data;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<E> it = head;
        while (it != null) {
            sb.append(String.format("%s", it.data));
            it = it.next;
            if (it != null) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}

