public class LinkedList2 {
    Node head;                                //Node is basically used for assigning as pointer
    Node tail;
    int length;

    class Node {                              
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    LinkedList2(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printlist(){                     //this is a method to print the whole linkedlist
        Node temp = head;
        System.out.println("the linkedlist is : ");
        while(temp!=null){
            System.out.print(temp.value);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println( );
    }
    public void append(int value){              //this is the append programme to append the list and add ore values in it
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
        tail.next= newNode;
        tail= newNode;
        }
        length++;
    }
    public Node removeLast() {
        if (length == 0) return null;
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
    public void  prepend(int value){
        Node newNode = new Node(value);
            if (length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        while(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    
    public void gethead(){
        System.out.println("head is : "+head.value);
    }
    public void gettail(){
        System.out.println("tail is : "+ tail.value);
    }
    public void getlength(){
        System.out.println("length is : "+length);
    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
    
    public static void main(String[] args) {
        LinkedList2 myLinkedList = new LinkedList2(5);
       
        
        myLinkedList.append(6);
        myLinkedList.append(2);
        myLinkedList.prepend(8);
        myLinkedList.gethead();
        myLinkedList.gettail();
        myLinkedList.getlength();
        //System.out.println(myLinkedList.get(2).value);
        //myLinkedList.set(1,9);
        myLinkedList.reverse();
        myLinkedList.printlist();
        
       // System.out.println(myLinkedList.removeLast().value);
       // System.out.println(myLinkedList.removeLast().value);
       // System.out.println(myLinkedList.removeLast().value);
       // System.out.println(myLinkedList.removeLast());

    }
}
