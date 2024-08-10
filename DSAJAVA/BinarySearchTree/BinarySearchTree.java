public class BinarySearchTree {
    Node root;

    // I use this Node class to represent each node in my binary search tree
    class Node {
        Node left;
        Node right;
        int value;
        public Node(int value) {
            this.value = value;
        }
    }

    // I use this method to add new elements to my binary search tree
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // I use this method to check if a specific value exists in my binary search tree
    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            }
            else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true; // I found the value!
            }
        }
        return false; // I couldn't find the value
    }

    // This is where I test my binary search tree implementation
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

/*
    // This was an alternative main method I used for testing
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("root = " + bst.root);
    }
*/
