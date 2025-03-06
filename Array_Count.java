//The program attempts to count the occurrences of each number in an integer array.

import java.util.Arrays;

public class Arr_count {
    static void printCount(int a[]) {
        int n = a.length;
        int i = 0;
        
        while (i < n) {
            int x = a[i]; // Current element
            int fc = 1;   // Frequency count (at least 1 occurrence)

            while (i + 1 < n && a[i + 1] == x) { 
                fc++;
                i++;
            }
            
            System.out.println(x + " occurs " + fc + " times.");
            i++; // Move to next new element
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 2, 9, 10, 7, 4, 8, 3};
        Arrays.sort(a); // Sort the array for counting adjacent duplicates
        printCount(a);
    }
}
