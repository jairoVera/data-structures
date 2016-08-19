public interface Hashtable<K, V> {

    /** Adds the key-value pair into the hashtable. If the key is already
        in the hashtable, then the value is updated.
        @return updated number of pairs in the hashtable
    */
    public int put(K inKey, V inValue);

    public V get(K inKey);
    public K remove(K inKey);

    public boolean containsKey(K inKey);
    public boolean containsValue(V inValue);

    public void clear();
}