public class queues {
    // Queue implementation with basic operations: enqueue, dequeue, etc.
    public Node first;  // Reference to the first element.
    public Node last;   // Reference to the last element.
    public int length;  // Tracks the queue's length.

    class Node {
        // Represents each element in the queue.
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    queues(int value) {
        // Initializes the queue with a single node.
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printqueue() {
        // Prints all values in the queue.
        if (length == 0) {
            System.out.println("no elements");
        } else {
            Node temp = first;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public void enqueue(int value) {
        // Adds a new node with the given value to the end.
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        // Removes and returns the first node.
        if (length == 0) return null;

        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void getfirst() {
        // Prints the value of the first node.
        System.out.println("first is " + first.value);
    }

    public void getlast() {
        // Prints the value of the last node.
        System.out.println("last is " + last.value);
    }

    public void length() {
        // Prints the current length of the queue.
        System.out.println("the length is " + length);
    }

    public static void main(String[] args) {
        // Test the queue implementation.
        queues myQueues = new queues(5);
        myQueues.enqueue(4);
        myQueues.enqueue(3);
        // myQueues.dequeue();
        myQueues.printqueue();
        myQueues.getfirst();
        myQueues.getlast();
        myQueues.length();
    }
}

