public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int length;

    // I use this Node class to represent each node in my doubly linked list
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    // I use this constructor to initialize my doubly linked list with a single node
    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // I use this method to print all the elements in my list
    public void printList() {
        if (head == null) {
            System.out.println("dll is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // I use this method to add a new node to the end of my list
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    // I use this method to remove the last node from my list
    public Node removelast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    // I use this method to add a new node to the beginning of my list
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            tail.next = null;
            head.prev = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // I use this method to remove the first node from my list
    public Node removeFirst() {
        if (length == 0) return null;
        else if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return head;
    }

    // I use this method to get a node at a specific index in my list
    public Node get(int index) {
        Node temp = head;
        if (length == 0) return null;
        else if (length == 1) {
            System.out.println(head.value);
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }

    // I use this method to set the value of a node at a specific index
    public boolean set(int index, int value) {
        Node temp = get(index);
        while (temp != null) {   
            temp.value = value;
            return true;
        }
        return false;
    }

    // I use this method to insert a new node at a specific index
    public boolean insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return false;
    }

    // I use this method to remove a node at a specific index
    public Node remove(int index) {
        Node temp;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removelast();
        else {
            temp = head;
            Node prev = get(index - 1);
            temp = prev.next;
            prev.next = temp.next;
            temp.next = null;
            length--;            
        }
        return temp;
    }

    // I use these methods to get the head, tail, and length of my list
    public void gethead() {
        System.out.println("the head is " + head.value);
    }

    public void gettail() {
        System.out.println("the tail is " + tail.value);
    }

    public void length() {
        System.out.println("the length is " + length);
    }

    // This is where I test my doubly linked list implementation
    public static void main(String[] args) {
        DoublyLinkedList mydll = new DoublyLinkedList(3);
        mydll.append(4);
        mydll.append(5);
        //mydll.removelast();
        mydll.prepend(1);
        //mydll.removeFirst();
        mydll.set(3, 8);
        //mydll.insert(1,9);
        //mydll.remove(1);
        //mydll.reverse();
        mydll.printList();
        mydll.length();
        mydll.gethead();
        mydll.gettail();
    }
}
