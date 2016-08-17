public class LinkedStackDriver {

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();

        // Test push
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.print();
    }
}