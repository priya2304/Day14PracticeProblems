import java.util.LinkedList;

public class Stack {
    /** created object of LinkedList class **/
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    /** add element to the stack. **/
    public void push(Integer data) {
        linkedList.addFirst(data);
    }

    /** Peak method **/
    public void peak() {
        System.out.println("\n" + linkedList.peek());
    }

    /** Adding pop method till stack is empty.**/
    public void pop() {
        while(linkedList.size() != 0) {
            linkedList.pop();
        }
    }

    /** print method to print stack elements. **/
    public void printStack() {
        System.out.println("\n" + linkedList.toString());
    }


    /*** Main method. ***/
    public static void main(String[] args) {
        /** Displayed welcome message **/
        System.out.println("----------WELCOME TO STACK-----------\n");

        Stack stack = new Stack();
        stack.push(70);               // 70 is adding first
        stack.push(30);				  // 30 is adding second
        stack.push(56);				  // 56 is adding last
        stack.printStack();
        stack.peak();                 // calling peek method to fetch the first element.
        stack.pop();               // since stack is a LIFO, it will delete last element i.e., 56.
        stack.printStack();
    }
}


