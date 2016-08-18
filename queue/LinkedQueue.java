import java.lang.StringBuilder;

public class LinkedQueue<T> implements Queue<T> {

    Node<T> front = null;
    Node<T> back  = null;
    int size = 0;

    public int getSize() {
        return size;
    }

    public int enqueue(T entry) {

        // Check for null entry
        if (entry == null) {
            return -1;
        }

        Node<T> node = new Node<T>(entry);

        // Case 1: Empty queue
        if (size == 0) {
            front = back = node;
        }
        // Case 2: Non-empty queue
        else {
            back.setNextNode(node);
            back = node;
        }

        return ++size;
    }

    public T dequeue() {

        T frontData = null;

        // Case 1: Empty queue
        if (size == 0) {
            return null;
        }
        // Case 2: Non-empty queue
        else {
            frontData = front.getData();

            // Case 2a: Non-empty queue of size 1
            if (size == 1) {
                front = back = null;
            }
            // Case 2b: Non-empty queue of size 2+
            else {
                front = front.getNextNode();
            }

            size--;
            return frontData;
        }
    }

    public T peekFront() {
        return (front != null) ? front.getData() : null;
    }

    public int contains(T entry) {

        if (entry == null || size == 0) {
            return -1;
        }

        Node<T> current = front;
        int index = 0;

        while (current != null) {

            if (current.getData().equals(entry)) {
                return index;
            }
            else {
                current = current.getNextNode();
                index++;
            }
        }

        return -1;
    }

    public int clear() {
        front = back = null;
        size = 0;
        return 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node<T> current  = front;

        while (current != null) {
            sb.append(current.getData());
            current = current.getNextNode();

            if (current != null) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}