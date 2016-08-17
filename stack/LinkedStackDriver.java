public class LinkedStackDriver {

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        System.out.println("Stack created!");
        System.out.println("Is stack empty? " + stack.isEmpty() + "\n");


        // Test push
        System.out.println("TEST PUSH");
        System.out.println("After push 0, size ==  " + stack.push(0));
        System.out.println("After push 1, size ==  " + stack.push(1));
        System.out.println("After push null, size ==  " + stack.push(null));
        System.out.println("After push 2, size ==  " + stack.push(2));
        System.out.println("Is stack empty? " + stack.isEmpty() + "\n");

        // Test peek
        System.out.println("\nTEST PEEK");
        System.out.println("Current top: " + stack.peek());
        System.out.println("After push 3, size ==  " + stack.push(3));
        System.out.println("Current top: " + stack.peek());

        // Test pop
        System.out.println("\nTEST POP");
        System.out.println("pop " + stack.pop() + " and new size == " + stack.getSize());
        System.out.println("pop " + stack.pop() + " and new size == " + stack.getSize());
        System.out.println("pop " + stack.pop() + " and new size == " + stack.getSize());
        System.out.println("pop " + stack.pop() + " and new size == " + stack.getSize());
        System.out.println((stack.pop() == null ? "NULL" : "?") + " and new size == " + stack.getSize());
        System.out.println((stack.pop() == null ? "NULL" : "?") + " and new size == " + stack.getSize());

        // Test peek and pop on Empty stack
        System.out.println("\nTEST POP/PEEK on empty stack");
        System.out.println("Peek on empty stack: " + stack.peek());
        System.out.println("Pop on empty stack: " + stack.pop());
        System.out.println("Is stack still empty? " + stack.isEmpty());

        // Test contains
        System.out.println("\nTEST CONTAINS");
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.push(9001);
        System.out.println("Index of 0 == " + stack.contains(0));
        System.out.println("Index of 1 == " + stack.contains(1));
        System.out.println("Index of 2 == " + stack.contains(2));
        System.out.println("Index of 3 == " + stack.contains(3));
        System.out.println("Index of 4 == " + stack.contains(4));
        System.out.println("Index of 5 == " + stack.contains(5));
        System.out.println("Index of 9001 == " + stack.contains(9001));
        System.out.println("Index of 90011 == " + stack.contains(90011));

        // Test prit
        stack.print();
    }
}