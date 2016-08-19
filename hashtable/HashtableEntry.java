public class HashtableEntry<K, V> {

    private K key   = null;
    private V value = null;
    private HashtableEntry nextEntry = null;

    public HashtableEntry() {}

    public HashtableEntry(K inKey, V inValue) {
        key   = inKey;
        value = inValue;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K inKey) {
        key = inKey;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V inValue) {
        value = inValue;
    }

    public HashtableEntry<K, V> getNextEntry() {
        return nextEntry;
    }

    public void setNextEntry(HashtableEntry<K, V> inNextEntry) {
        nextEntry = inNextEntry;
    }
}