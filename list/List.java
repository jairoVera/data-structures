public interface List<T> {

    public int getSize();
    public boolean isEmpty();
    public boolean contains(T entry);
    public void addToBeginning(T entry);
    public void addToEnd(T entry);
    public boolean addAtIndex(int index, T entry);
    public void clear();
    public T getHead();
    public T getTail();
    public T getAtIndex(int index);
    public T replaceAtIndex(int index, T entry);
    public T removeAtIndex(int index);
}