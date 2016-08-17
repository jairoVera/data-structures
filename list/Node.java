public class Node<T> {

    T data = null;
    Node<T> prevNode = null;
    Node<T> nextNode = null;

    public Node() {}

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> prevNode, Node<T> nextNode) {
        this.data     = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}