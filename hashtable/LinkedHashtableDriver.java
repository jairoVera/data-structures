public class LinkedHashtableDriver {

    public static void main(String[] args) {
        // Create hashtable and test if it is empty
        Hashtable<String, String> hashtable = new LinkedHashTable<String, String>();
        System.out.println("Hashtable created. Is it empty?: " + hashtable.isEmpty());

        // Test put
        System.out.println("\nTEST PUT");
        System.out.println("put: new size is: " + hashtable.put("Jairo", "Tacos"));
        System.out.println("put: new size is: " + hashtable.put("Fer", "Pizza"));
        System.out.println("put: new size is: " + hashtable.put("Cesar", "Spaghetti"));
        System.out.println("put: new size is: " + hashtable.put("Rina", "Pupusas"));
        System.out.println(hashtable);
    }
}