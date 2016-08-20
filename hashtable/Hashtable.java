public interface Hashtable<K, V> {

    public int put(K inKey, V inValue);
    public V get(K inKey);
    public V remove(K inKey);

    public boolean containsKey(K inKey);
    public boolean containsValue(V inValue);

    public void clear();
}