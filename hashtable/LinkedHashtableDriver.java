public class LinkedHashtableDriver {

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new LinkedHashTable<String, String>();

        hashtable.put("Jairo Vera", "832-226-2002");
        hashtable.put("Fer Vera", "832-491-3634");
        hashtable.put("Antonio Vera", "281-438-3294");
        hashtable.put("Maria Vera", "281-630-0186");

        System.out.println(hashtable);
        System.out.println("----------------------");

        System.out.println("Jairo Vera: " + hashtable.get("Jairo Vera"));
        System.out.println("Fer Vera: " + hashtable.get("Fer Vera"));
        System.out.println("Antonio Vera: " + hashtable.get("Antonio Vera"));
        System.out.println("Maria Vera: " + hashtable.get("Maria Vera"));
        System.out.println("Purple Guy: " + hashtable.get("Purple Guy"));
        System.out.println("----------------------");

        hashtable.remove("Jairo Vera");
        System.out.println(hashtable);
        hashtable.remove("Fer Vera");
        System.out.println(hashtable);
        hashtable.remove("Antonio Vera");
        System.out.println(hashtable);
        hashtable.remove("Maria Vera");
        System.out.println(hashtable);
        hashtable.remove("Maria Vera");
        System.out.println(hashtable);

        hashtable.put("Freddy Fazbear", "123-456-7890");
        System.out.println(hashtable);
    }
}