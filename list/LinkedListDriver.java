public class LinkedListDriver {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Test add
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        printList(list);

        list.addToBeginning(0);
        list.addToBeginning(-1);
        printList(list);

        list.addAtIndex(2, 900);
        printList(list);

        list.addAtIndex(5, 88);
        printList(list);

        // Test clear
        list.clear();
        System.out.println(list.isEmpty());

        // Test Remove
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);
        printList(list);

        list.removeAtIndex(0);
        printList(list);
        list.removeAtIndex(0);
        printList(list);
        list.removeAtIndex(2);
        printList(list);
        list.removeAtIndex(0);
        printList(list);
        list.removeAtIndex(1);
        printList(list);

        list.addToBeginning(-100);
        list.addToEnd(100);
        printList(list);

        System.out.println(list.getHead());
        System.out.println(list.getTail());

        // Test Replace
        list.replaceAtIndex(0, -90);
        list.replaceAtIndex(1, 0);
        list.replaceAtIndex(2, 90);
        printList(list);

        System.out.println(list.contains(9001));
    }

    public static void printList(LinkedList<Integer> list) {
        list.print();
        System.out.println(list.getSize());
    }
}