public interface Hashtable<K, V> {

    /** Adds key-value pair to the hashtable if the key-value pair
        is unique.
        @return updated number of pairs in the hashtable
    */
    public int put(K inKey, V inValue);

    public V   get(K key);
    public K   remove(K inKey);

    public boolean containsKey(K inKey);
    public boolean containsValue(V inValue);

    public void clear();
}