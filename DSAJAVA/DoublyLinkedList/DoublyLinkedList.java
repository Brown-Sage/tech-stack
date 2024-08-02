public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }
    DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList(){
        if(head==null){
            System.out.println("dll is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    public Node removelast(){
        if(length==0) return null;
        Node temp = tail;
        if(length==1){
            head = null;
            tail = null;
        }
        else{
            tail=temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail= newNode;
            tail.next = null;
            head.prev = null;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if(length==0) return null;
        else if(length==1){
            head = null;
            tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
        return head;
    }
    public Node get(int index){
        Node temp = head;
        if(length==0) return null;
        else if(length==1){
            System.out.println(head.value);
        }else {
            for(int i=0; i<index;i++){
                temp = temp.next;
            }
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
    public boolean insert(int index , int value){
        if(index==0){
            prepend(value);
            return true;
        }else if(index==length){
            append(value);
            return true;
        }else{
            Node newNode = new Node(value);
            Node temp = get(index-1);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return false;
    }
    public Node remove(int index){
        Node temp ;
        if(index==0) return removeFirst();
        if(index==length-1) return removelast();
        else{
            temp = head;
            
        Node prev = get(index-1);
        temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;            
        }
        return temp;
    }
    public void gethead(){
        System.out.println("the head is "+head.value);
    }
    public void gettail(){
        System.out.println("the tail is "+tail.value);
    }
    public void length(){
        System.out.println("the length is "+length);
    }
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