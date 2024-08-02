public class BinarySearchTree {
    Node root;
    class Node{
        Node left;
        Node right;
        int value;
        public Node(int value){
            this.value = value;
        }
    }
    public boolean insert(int value){                //to add the  elements in the binary tree
        Node newNode = new Node(value);
        if(root==null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;;
            }else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    public boolean contains(int value){      //to check if the element is in the binary tree or not
        if(root==null) return false;
        Node temp = root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }
            else if(value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        BinarySearchTree mybst = new BinarySearchTree();
        mybst.insert(10);
        mybst.insert(12);
        mybst.insert(9);
        mybst.insert(14);
        mybst.insert(12);
        mybst.insert(11);
        mybst.insert(8);
        System.out.println(mybst.contains(12));
    }
}
    /*     public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("root = "+bst.root);
    }
}*/
