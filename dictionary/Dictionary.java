
/**
*   An interface for a dictionary with distinct search keys.
*   @author Jairo Vera
*/
public interface Dictionary<K, V> {

    /* Adds a key-value pair into the dictionary. If the key is already
       in the dictionary, then the corresponding value is replaced.
       @return Updated dictionary size */
    public int add(K inKey, V inValue);

    /* Removes a key-value pair.
       @return Removed value or null if no such key exists */
    public V remove(K inKey);

    /* Retrives the corresponding value.
       @return Corresponding value or null if no such key exists */
    public V retrieve(K inKey);

    /* Determines if a key exists in the dictionary
       @return true if key is in the dictionary,
               false otherwise */
    public boolean containsKey(K inKey);

    /* Determines if a value exists in the dictionary
       @return true if value is in the dictionary,
               false otherwise */
    public boolean containsValue(V inValue);

    /* @return number of key-value pairs */
    public int getSize();

    /* @return true if there are 0 key-value pairs
               false otherwise */
    public boolean isEmpty();

    /* Empties the dictionary */
    public void clear();
}