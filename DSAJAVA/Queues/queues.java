    public class queues{
    public Node first;
    public Node last;
    public int length;

    class Node{
        Node next;
        int value;
        Node(int value){
            this.value = value;
        }
    }
    queues(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length= 1;
    }
    public void printqueue(){
        if(length==0){
            System.out.println("no elements");
        }else{
            Node temp = first;
            while(temp!=null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node dequeue(){
        if(length==0) return null;
        Node temp = first;
        if(length==1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public void getfirst(){
        System.out.println("first is "+first.value);
    }
    public void getlast(){
        System.out.println("last is "+last.value);
    }
    public void length(){
        System.out.println("the length is "+length);
    }
    public static void main(String[] args) {
        queues myQueues = new queues(5);
        myQueues.enqueue(4);
        myQueues.enqueue(3);
        //myQueues.dequeue();
        myQueues.printqueue();
        myQueues.getfirst();
        myQueues.getlast();
        myQueues.length();
    }
}
