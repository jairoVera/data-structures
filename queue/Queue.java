public interface Queue<T> {

    public int getSize();
    public int enqueue(T entry);
    public T   dequeue();
    public T   peekFront();
    public int contains(T entry);
    public int clear();
    public boolean isEmpty();
    public String  toString();
}