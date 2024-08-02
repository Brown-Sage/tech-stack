public class Stack {
    public Node top;
    public int height;

    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value  = value;
        }
    }
    Stack(int value){
        Node newNode = new Node(value);
            top = newNode;
            height = 1;
    }
    public void printstack(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public void pop(){
        if(height==0){
            System.out.println("stack is already empty");
        }else{
            Node temp = top;
            top = top.next;
            temp.next = null;
        }
        height--;
    }
    public void gettop(){
        System.out.println("top is "+top.value);
    }
    public void getheight(){
        System.out.println("the height is "+height);
    }
    public static void main(String[] args) {
        Stack newStack = new Stack(3);
        newStack.push(2);
        newStack.push(1);
        newStack.push(4);
        newStack.pop();                          // pop is removing 1 (top)
        newStack.printstack();
        newStack.gettop();
        newStack.getheight();
    }
}

