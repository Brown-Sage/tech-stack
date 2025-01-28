import java.util.HashSet;
import java.util.Iterator;
//                                  HASHSET DOES NOT HAVE ANY PERTICULAR ORDER OF STORING ELEMENTS
class hashsett { 
    static HashSet<String> hs = new HashSet<>(); // Static HashSet to store integers

    static int search(String value) { // Static method to search for a value
        if (hs.contains(value)) { // Check if the HashSet contains the given value
            System.out.println(value + " is present in the hashset"); 
            return 1; // Return 1 to indicate the value is present
        } else { 
            System.out.println(value + " is not present in the hashset"); 
            return 0; // Return 0 to indicate the value is not present
        }
    }

    public static void main(String[] args) { 
        hs.add("ad"); // Add elements to the HashSet
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");

        hs.remove("e"); // Remove the element 3 from the HashSet

        System.out.println("size of the set is " + hs.size()); // Print the current size of the HashSet

        search("f"); // Search for the element 3 (which was removed)

        System.out.println(hs); // Print the contents of the HashSet (order is not guaranteed)

        Iterator it = hs.iterator(); // Create an Iterator to traverse the HashSet
        while (it.hasNext()) { // Loop as long as the Iterator has more elements
            System.out.println(it.next()); // Print the next element from the Iterator  
        }
    }
}