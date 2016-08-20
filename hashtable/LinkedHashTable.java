import java.lang.StringBuilder;

public class LinkedHashTable<K, V> implements Hashtable<K, V> {

    private HashtableEntry<K, V>[] hashtable = null;
    private int numberPairs = 0;
    private double loadFactor  = 0;

    private static final int DEFAULT_SIZE = 101;
    private static final double MAX_LOAD_FACTOR = 0.5;


    public LinkedHashTable() {
        hashtable = new HashtableEntry[DEFAULT_SIZE];
    }

    public LinkedHashTable(int inMinSize) {
        hashtable = new HashtableEntry[getNextPrime(inMinSize)];
    }

    /** Adds the key-value pair into the hashtable. If the key is already
        in the hashtable, then the value is updated.
        @return updated number of pairs in the hashtable */
    public int put(K inKey, V inValue) {

        if (inKey == null || inValue == null) {
            return numberPairs;
        }

        int index = getHashIndex(inKey);

        // Case 1: Bucket is empty
        if (hashtable[index] == null) {
            hashtable[index] = new HashtableEntry<K, V>(inKey, inValue);
            numberPairs++;
        }
        // Case 2: Bucket is non-empty
        else {
            HashtableEntry<K, V> entry = getEntry(index, inKey);

            if (entry != null) {
                entry.setValue(inValue);
            }
            else {
                HashtableEntry<K, V> newEntry = new HashtableEntry<K, V>(inKey, inValue);
                newEntry.setNextEntry(hashtable[index]);
                hashtable[index] = newEntry;
                numberPairs++;
            }
        }

        loadFactor = (double)numberPairs / hashtable.length;

        if (loadFactor >= MAX_LOAD_FACTOR) {
            rehash();
        }

        return numberPairs;
    }

    public V get(K inKey) {

        if (inKey == null) {
            return null;
        }

        int index = getHashIndex(inKey);

        // Case 1: Bucket is empty
        if (hashtable[index] == null) {
            return null;
        }
        // Case 2: Bucket is non-empty
        else {
            HashtableEntry<K, V> entry = getEntry(index, inKey);
            return (entry == null) ? null : entry.getValue();
        }
    }

    public V remove(K inKey) {

        if (inKey == null) {
            return null;
        }

        int index = getHashIndex(inKey);

        // Case 1: Bucket is empty
        if (hashtable[index] == null) {
            return null;
        }
        // Case 2: Bucket is not empty
        else {

            // Check first entry
            HashtableEntry<K, V> current = hashtable[index];
            if (current.getKey().equals(inKey)) {
                hashtable[index] = current.getNextEntry();
                loadFactor = (double)--numberPairs / hashtable.length;
                return current.getValue();
            }

            // Case 2b: Entry is in deep list
            HashtableEntry<K, V> next = current.getNextEntry();

            while (next != null) {
                if (next.getKey().equals(inKey)) {

                    V oldData = next.getValue();
                    current.setNextEntry(next.getNextEntry());
                    loadFactor = (double)--numberPairs / hashtable.length;
                    return oldData;
                }

                current = current.getNextEntry();
                next    = current.getNextEntry();
            }

            return null;
        }
    }

    public boolean containsKey(K inKey) {
        return false;
    }

    public boolean containsValue(V inValue) {
        return false;
    }

    public void clear() {

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number of pairs: ")
          .append(numberPairs)
          .append("\nLoadfactor: ")
          .append(loadFactor)
          .append("\n");

        for (HashtableEntry<K, V> entry: hashtable) {
            while (entry != null) {

                sb.append(entry.getKey().toString())
                  .append(": ")
                  .append(entry.getValue().toString())
                  .append("\n");

                entry = entry.getNextEntry();
            }
        }

        return sb.toString();
    }

    private void rehash() {

    }

    private HashtableEntry<K, V> getEntry(int index, K inKey) {

        HashtableEntry<K, V> current = hashtable[index];

        while (current != null && !current.getKey().equals(inKey)) {
            current = current.getNextEntry();
        }

        return current;
    }

    private int getHashIndex(K inKey) {
        int index = inKey.hashCode() % hashtable.length;
        return (index < 0) ? (index + hashtable.length) : index;
    }

    private int getNextPrime(int inSize) {

        while (true) {
            if (isPrime(inSize)) {
                return inSize;
            }
            else {
                inSize++;
            }
        }
    }

    private boolean isPrime(int num) {

        if ((num > 2) && (num % 2 == 0)) {
            return false;
        }

        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    private class HashtableEntry<K, V> {

        private K key   = null;
        private V value = null;
        private HashtableEntry<K, V> nextEntry = null;

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
}