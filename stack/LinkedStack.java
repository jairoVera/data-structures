public class LinkedStack<T> implements Stack<T> {

    private Node<T> top = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int push(T entry) {

        if (entry == null) {
            return -1;
        }

        Node<T> newTop = new Node<T>(entry);

        if (size > 0) {
            newTop.setNextNode(top);
        }

        top = newTop;

        return ++size;
    }

    public T peek() {
        return (size > 0) ? top.getData() : null;
    }

    public T pop() {
        T topData = peek();

        if (topData != null) {
            top = top.getNextNode();
            size--;
        }

        return topData;
    }

    public int contains(T entry) {

        if (size == 0 || entry == null) {
            return -1;
        }

        Node<T> current = top;
        int index = 0;

        while (current != null) {
            if (current.getData().equals(entry)) {
                return index;
            }

            current = current.getNextNode();
            index++;
        }

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