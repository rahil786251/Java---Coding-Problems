//This Java program is working with arrays, printing default values, assigning new values, and printing them again

public class ArrayExample {
    public static void main(String[] args) {
        int arr[] = new int[4];

        // Printing default values (all should be 0)
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // Assigning values
        arr[0] = 1000;
        arr[1] = 10003;
        arr[2] = 1005;
        arr[3] = 1009;

        // Printing updated values
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // Fix: Check before accessing an invalid index
        int index = 4;
        if (index >= arr.length) {
            System.out.println("Index " + index + " is out of bounds!");
        } else {
            System.out.println(arr[index]); 
        }
    }
}
