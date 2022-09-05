package LinkedList;

public class LinkedList<T> {

    private Node<T> head;
    private int length;
    public LinkedList(Node<T> head) {
        this.head = head;
        this.length = 0;
    }

    public LinkedList(T value) {
        this(new Node<T>(value, null));
    }

    public T getIndex(int index) {
        Node<T> pointer = head;
        if (index == 0) {
            return pointer.getValue();
        }
        for (int i = 0; i < index; i++) {
            if (pointer.getNext() == null) {
                throw new IndexOutOfBoundsException();
            }
            pointer = pointer.getNext();
        }
        return pointer.getValue();
    }

    public void addIndex(T value, int index) {
        Node<T> pointer = head;
        if (index == 0) {
            head = new Node<T>(value, head);
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            if (pointer.getNext() == null) {
                throw new IndexOutOfBoundsException();
            }
            pointer = pointer.getNext();
        }

        Node<T> node = new Node<T>(value, pointer.getNext());
        pointer.setNext(node);
    }

    public void removeIndex(int index) {
        Node<T> pointer = head;
        if (index == 0) {
            head = head.getNext();
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            if (pointer.getNext() == null) {
                throw new IndexOutOfBoundsException();
            }
            pointer = pointer.getNext();
        }
        pointer.setNext(pointer.getNext().getNext());
    }
}
