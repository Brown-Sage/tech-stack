import java.util.HashSet;
import java.util.Iterator;

class hashsett { // Class name should ideally be PascalCase (e.g., HashSetExample)
    static HashSet<Integer> hs = new HashSet<>(); // Static HashSet to store integers

    static int search(int value) { // Static method to search for a value
        if (hs.contains(value)) { // Check if the HashSet contains the given value
            System.out.println(value + " is present in the hashset"); // Print if the value is found
            return 1; // Return 1 to indicate the value is present
        } else { // If the value is not found
            System.out.println(value + " is not present in the hashset"); // Print if the value is not found
            return 0; // Return 0 to indicate the value is not present
        }
    }

    public static void main(String[] args) { // Main method where the program starts
        hs.add(2); // Add elements to the HashSet
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        hs.remove(3); // Remove the element 3 from the HashSet

        System.out.println("size of the set is " + hs.size()); // Print the current size of the HashSet

        search(3); // Search for the element 3 (which was removed)

        System.out.println(hs); // Print the contents of the HashSet (order is not guaranteed)

        Iterator it = hs.iterator(); // Create an Iterator to traverse the HashSet
        while (it.hasNext()) { // Loop as long as the Iterator has more elements
            System.out.println(it.next()); // Print the next element from the Iterator
        }
    }
}