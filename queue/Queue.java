public interface Queue<T> {

    public int getSize();
    public boolean isEmpty();

    public int enqueue(T entry);
    public int dequeue();

    public int contains(T entry);
}