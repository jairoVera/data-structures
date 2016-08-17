public class LinkedList<T> implements List<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public int getSize(){
        return size;
    }

    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    public boolean contains(T entry) {
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().equals(entry)) {
                return true;
            }

            currentNode = currentNode.getNextNode();
        }

        return false;
    }

    public void addToBeginning(T entry) {
        Node<T> newNode = new Node<T>(entry);

        if (size == 0) {
            head = tail = newNode;
        }
        else {
            newNode.setNextNode(head);
            head.setPrevNode(newNode);
            head = newNode;
        }

        size++;
    }

    public void addToEnd(T entry) {
        Node<T> newNode = new Node<T>(entry);

        if (size == 0) {
            head = tail = newNode;
        }
        else {
            newNode.setPrevNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }

        size++;
    }

    public boolean addAtIndex(int index, T entry) {

        if (size > 0) {
            Node<T> nodeAtIndex = getNode(index);

            if (nodeAtIndex != null) {

                if (nodeAtIndex == head) {
                    addToBeginning(entry);
                    return true;
                }
                else if (nodeAtIndex == tail) {
                    addToEnd(entry);
                    return true;
                }
                else {
                    Node<T> newNode = new Node<T>(entry);
                    Node<T> prevNode = nodeAtIndex.getPrevNode();

                    prevNode.setNextNode(newNode);
                    newNode.setPrevNode(prevNode);
                    newNode.setNextNode(nodeAtIndex);
                    nodeAtIndex.setPrevNode(newNode);

                    size++;
                    return true;
                }
            }

            return false;
        }

        return false;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public T getHead() {
        return (head != null) ? head.getData() : null;
    }

    public T getTail() {
        return (tail != null) ? tail.getData() : null;
    }

    public T getAtIndex(int index) {
        Node<T> nodeAtIndex = getNode(index);
        return (nodeAtIndex != null) ? nodeAtIndex.getData() : null;
    }

    public T replaceAtIndex(int index, T entry) {
        Node<T> nodeAtIndex = getNode(index);

        if (nodeAtIndex == null) {
            return null;
        }
        else {
            T oldData = nodeAtIndex.getData();
            nodeAtIndex.setData(entry);
            return oldData;
        }
    }

    public T removeAtIndex(int index) {

        if (size > 0) {
            Node<T> nodeAtIndex = getNode(index);

            if (nodeAtIndex != null) {
                if (size == 1) {
                    T oldData = head.getData();
                    clear();
                    return oldData;
                }
                else if (head == nodeAtIndex) {
                    T oldData = head.getData();

                    Node<T> newHead = head.getNextNode();
                    newHead.setPrevNode(null);
                    head = newHead;

                    size--;
                    return oldData;
                }
                else if (tail == nodeAtIndex) {
                    T oldData = tail.getData();

                    Node<T> newTail = tail.getPrevNode();
                    newTail.setNextNode(null);
                    tail = newTail;

                    size--;
                    return oldData;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public void print() {
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.getData() + ", ");
            current = current.getNextNode();
        }

        System.out.println();
    }

    private Node<T> getNode(int index) {

        // Out of bounds check
        if (index < 0 || index >= size) {
            return null;
        }

        Node<T> currentNode = head;

        for (int i = 0; i < size; i++) {
            if (i == index) {
                return currentNode;
            }

            currentNode = currentNode.getNextNode();
        }

        return null;
    }
}