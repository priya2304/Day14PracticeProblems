import java.util.LinkedList;

public class Queue {
    /** created object of LinkedList class **/
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    /** Adding enqueue method **/
    public void enqueue(Integer data) {
        linkedList.addLast(data);
    }

    /** adding dequeue method. **/
    public void dequeue() {
        linkedList.removeFirst();
    }

    /** Printing queue method. **/
    public void printQueue() {
        System.out.println("\n" + linkedList.toString());
    }

    /*** Main method. ***/
    public static void main(String[] args) {
        /** Displayed welcome message **/
        System.out.println("------------WELCOME TO QUEUE------------\n");

        Queue queue = new Queue();
        queue.enqueue(56); // adding 56 first
        queue.enqueue(30); // adding 30 second
        queue.enqueue(70); // adding 70 last
        queue.printQueue();
        queue.dequeue(); // Since queue is follows FIFO . so first element will be deleted first.
        queue.printQueue();
    }
}
