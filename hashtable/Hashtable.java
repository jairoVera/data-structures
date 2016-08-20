public interface Hashtable<K, V> {

    public int put(K inKey, V inValue);

    /** @return the value corresponding to the key if the key is in the hashtable,
                or returns null if they key is null or if the key is not in
                the hashtable*/
    public V get(K inKey);
    public V remove(K inKey);

    public boolean containsKey(K inKey);
    public boolean containsValue(V inValue);

    public void clear();
}