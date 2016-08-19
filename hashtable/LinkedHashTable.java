public class LinkedHashTable<K, V> implements Hashtable<K, V> {

    private HashtableEntry<K, V>[] hashtable = null;
    private int numberPairs = 0;
    private int loadFactor  = 0;

    private static final int DEFAULT_SIZE = 101;
    private static final double MAX_LOAD_FACTOR = 0.5;


    public LinkedHashTable() {
        hashtable = new HashtableEntry[DEFAULT_SIZE];
    }

    public LinkedHashTable(int inMinSize) {
        hashtable = new HashtableEntry[getNextPrime(inMinSize)];
    }

    public int put(K inKey, V inValue) {

        // Check for null key/value
        if (inKey == null || inValue == null) {
            return numberPairs;
        }

        // Get hash index
        int index = inKey.hashCode() % hashtable.length;

        if (index < 0) {
            index += hashtable.length;
        }

        // Case 1: Bucket is empty
        if (hashtable[index] == null) {
            hashtable[index] = new HashtableEntry<K, V>(inKey, inValue);
            numberPairs++;
        }
        // Case 2: Bucket is non-empty
        else {
            HashtableEntry<K, V> current = hashtable[index];

            while (current != null) {

                if (current.getKey().equals(inKey)) {
                    current.setValue(inValue);
                    break;
                }

                current = current.getNextEntry();
            }

            HashtableEntry<K, V> newEntry = new HashtableEntry<K, V>(inKey, inValue);
            newEntry.setNextEntry(hashtable[index]);
            hashtable[index] = newEntry;
            numberPairs++;
        }

        loadFactor = numberPairs / hashtable.length;

        if (loadFactor < MAX_LOAD_FACTOR) {
            rehash();
        }

        return numberPairs;
    }

    public V get(K key) {
        return null;
    }

    public K remove(K inKey) {
        return null;
    }

    public boolean containsKey(K inKey) {
        return false;
    }

    public boolean containsValue(V inValue) {
        return false;
    }

    public void clear() {

    }

    private void rehash() {

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