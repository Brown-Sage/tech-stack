public class DoublyLinkedList1 {
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
    DoublyLinkedList1(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if (length==0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    public void printlist(){
        if(length==1){
            System.out.println(head.value);
        }else{
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
    public Node removelast(){
        Node temp = tail;
        if(length==0) return null;
        else if(length==1){
            head = null;
        }else {          
            tail = temp.prev;
            tail.next = null;
            temp = null;
        }
        return temp;
    }
    public static void main(String[] args) {
        DoublyLinkedList1 mydll = new DoublyLinkedList1(0);
        mydll.append(1);
        mydll.append(2);
        mydll.removelast();
        mydll.printlist();
    }
}
