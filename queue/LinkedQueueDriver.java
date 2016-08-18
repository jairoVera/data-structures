public class LinkedQueueDriver {

    public static void main(String[] args) {

        // Create queue
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue created: " + queue);

        // Test isEmpty and size
        System.out.println("\nTEST EMPTY & SIZE");
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size " + queue.getSize());

        // Test PeekFront
        System.out.println("\nTEST PEEK");
        System.out.println("Front: " + queue.peekFront());


        // Test Dequeue
        System.out.println("\nTEST DEQUEUE");
        System.out.println("Dequeue " + queue.dequeue() + " and size == " + queue.getSize());
        System.out.println("Front: " + queue.peekFront());
        System.out.println("Dequeue " + queue.dequeue() + " and size == " + queue.getSize());
        System.out.println("Front: " + queue.peekFront());
        System.out.println("Dequeue " + queue.dequeue() + " and size == " + queue.getSize());
        System.out.println("Front: " + queue.peekFront());
        System.out.println("Dequeue " + queue.dequeue() + " and size == " + queue.getSize());
        System.out.println("Front: " + queue.peekFront());
        System.out.println("Dequeue " + queue.dequeue() + " and size == " + queue.getSize());
        System.out.println("Front: " + queue.peekFront());
        System.out.println("Dequeue " + queue.dequeue() + " and size == " + queue.getSize());

        // Final tests
        System.out.println("\nFINAL TESTS");
        queue.enqueue(null);
        System.out.println("Size: " + queue.getSize());

        queue.enqueue(78);
        queue.enqueue(-9);
        queue.enqueue(890);
        queue.enqueue(0);
        queue.enqueue(10000);

        System.out.println("Index of 890: " + queue.contains(890));
        System.out.println("Index of 8190: " + queue.contains(8190));
    }
}