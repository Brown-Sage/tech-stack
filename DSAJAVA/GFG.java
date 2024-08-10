import java.io.*;
import java.math.*;
import java.util.*;

class GFG {
    // Recursive function to solve the Tower of Hanoi puzzle
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        // Base case: if no disks left to move
        if (n == 0) {
            return;
        }
        
        // Move n-1 disks from source to auxiliary rod
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        
        // Move the nth disk from source to destination rod
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        
        // Move n-1 disks from auxiliary to destination rod
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
 
    // Driver code
    public static void main(String args[]) {
        int n = 3; // Number of disks
 
        // A, B and C are names of rods
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
