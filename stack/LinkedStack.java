public class LinkedStack<T> implements Stack<T> {

    Node<T> top = null;
    int size = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int push(T entry) {

        Node<T> newTop = new Node<T>(entry);

        if (size > 0) {
            newTop.setNextNode(top);
        }

        top = newTop;

        return ++size;
    }

    public T peek() {
        return null;
    }

    public T pop() {
        return null;
    }

    public int search(T entry) {
        return -1;
    }

    public void print() {
        Node<T> current = top;

        while (current != null) {
            System.out.print(current.getData());
            current = current.getNextNode();

            if (current != null) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}