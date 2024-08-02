public class LinkedList1 {
    Node head;
    Node tail;
    int length;

    class Node {       
        String value;
        Node next;
        Node prev;
        Node(String value){
            this.value = value;
        }
    }
    LinkedList1(String value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(String value){                //code for add an element at last index/position
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
    public void printlist(){                      // code for print all the elements of the linkedlist
       Node temp = head;
       while(temp!=null){
        System.out.print(temp.value+" ");
        temp = temp.next;
       }
       System.out.println();
    }
    public Node removeLast() {                    // code for remove the last element of the linkedlist
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
    public void prepend(String value){             //code for prepend(adding a value at biginning)
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
    public Node removeFirst(){                //code for remove the first element
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
    public Node get(int index){              // code for see the value of an element on given element
        if(index<0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        
        return temp;
    }
    public boolean set(int index, String value){      // code for change/modify the value of temp/element
        Node temp = get(index);
        while(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index , String value){  // code for set an element between a list
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
    public Node remove(int index){                           // code for removing an element from a linkedlist
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
    public void reverse(){                       // code to reverse the Linkedlist
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
    public void gethead(){
        System.out.println("head is : "+head.value);
    }
    public void getTail() {
        System.out.println("tail is : "+tail.value); 
    }
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
        //System.out.println(myLinkedLi st1.removeLast().value);
        //System.out.println(myLinkedList1.removeLast());

    }
}
