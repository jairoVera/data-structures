public interface Stack<T> {

    public int getSize();
    public boolean isEmpty();

    public int push(T entry);
    public T   peek();
    public T   pop();

    public int search(T entry);
}