public class LinkedList1 {
    Node head;
    Node tail;
    int length;

    // Node class definition
    class Node {       
        String value;
        Node next;
        Node prev;
        Node(String value){
            this.value = value;
        }
    }

    // Constructor for LinkedList1
    LinkedList1(String value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Method to add an element at the last index/position
    public void append(String value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Method to print all the elements of the linkedlist
    public void printlist(){
       Node temp = head;
       while(temp!=null){
        System.out.print(temp.value+" ");
        temp = temp.next;
       }
       System.out.println();
    }

    // Method to remove the last element of the linkedlist
    public Node removeLast() {
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    // Method for prepending (adding a value at beginning)
    public void prepend(String value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;        
    }

    // Method to remove the first element
    public Node removeFirst(){
        if(length == 0){
            return null;
        }else{
            head = head.next;
        }
        length--;
        if(length==0){
            tail = null;
        }
        return head;
    }

    // Method to get the value of an element at a given index
    public Node get(int index){
        if(index<0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        
        return temp;
    }

    // Method to change/modify the value of a node at a given index
    public boolean set(int index, String value){
        Node temp = get(index);
        while(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    // Method to insert an element at a specific index
    public boolean insert(int index , String value){
        if(index<0 || index>length){
            return false;
        }
        else if(index == 0){
            prepend(value);
            return true;
        }
        else if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    // Method for removing an element from a specific index in the linkedlist
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        else if(index == 0) return removeFirst();
        else if(index ==length-1) return removeLast();
        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    // Method to reverse the Linkedlist
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    // Method to get the head of the list
    public void gethead(){
        System.out.println("head is : "+head.value);
    }

    // Method to get the tail of the list
    public void getTail() {
        System.out.println("tail is : "+tail.value); 
    }

    // Method to get the length of the list
    public void length(){
        System.out.println("length of the Linkedlist is : "+length);
    }   

    public static void main(String[] args) {
        LinkedList1 myLinkedList1 = new LinkedList1("wew");
        myLinkedList1.append("one");
        myLinkedList1.append("two");
        myLinkedList1.append("three");
        myLinkedList1.prepend("zero");
        //myLinkedList1.removeFirst();
        //myLinkedList1.removeLast();           // for removing the last element from Linkedlist
        
        myLinkedList1.gethead();
        myLinkedList1.getTail();
        myLinkedList1.length();
        //System.out.println(myLinkedList1.get(3).value);
        //myLinkedList1.removeRandom(2);
        myLinkedList1.set(1,"eleven");
        //myLinkedList1.insert(2,5);
        myLinkedList1.remove(1);

        //myLinkedList1.reverse();
        myLinkedList1.printlist();
        //System.out.println("the value is "+myLinkedList1.get(2).value);
        

        //System.out.println(myLinkedList1.removeLast().value);       THIS CAN BE USED IF WE WANT TO RETURN null ALSO
        //System.out.println(myLinkedList1.removeLast().value);
        //System.out.println(myLinkedList1.removeLast().value);
        //System.out.println(myLinkedList1.removeLast());
    }
}
