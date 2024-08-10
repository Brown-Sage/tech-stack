public class Stack {
    public Node top;    // Reference to the top element in the stack
    public int height;  // Tracks the height (number of elements) in the stack

    // Node class to represent each element in the stack
    class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }

    // Constructor to initialize the stack with the first element
    Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // Method to print all elements in the stack
    public void printstack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Method to add a new element to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    // Method to remove the top element from the stack
    public void pop() {
        if (height == 0) {
            System.out.println("stack is already empty");
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
        }
    }

    // Method to get the value of the top element
    public void gettop() {
        System.out.println("top is " + top.value);
    }

    // Method to get the current height of the stack
    public void getheight() {
        System.out.println("the height is " + height);
    }

    public static void main(String[] args) {
        // Testing the stack implementation
        Stack newStack = new Stack(3);
        newStack.push(2);
        newStack.push(1);
        newStack.push(4);
        newStack.pop();  // Pop removes the top element (4)
        newStack.printstack();
        newStack.gettop();
        newStack.getheight();
    }
}

