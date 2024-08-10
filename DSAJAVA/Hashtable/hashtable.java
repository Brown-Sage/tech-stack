/**
 * hashtable
 */
public class hashtable {
    int size = 7;
    Node[] datamap;
    class Node{
        String key;
        int value;
        Node next;
        Node(String key,int value){
            this.key = key;
            this.value = value;
        }
    }
    hashtable(){
        datamap = new Node[size];
    }
    void printtable(){
        for(int a = 0;a<datamap.length;a++){
            System.out.println(a+":");
            Node temp = datamap[a];
            while(temp!=null){
                System.out.println(" {"+temp.key+" = "+temp.value +" }");
            }
        }
    }
    public static void main(String[] args) {
        hashtable h = new hashtable();
        h.printtable();
    }
}

//this is not properly dont so this code may have flaw or possibility to not work at all
