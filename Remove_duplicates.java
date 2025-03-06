//This Java program removes duplicates from an unsorted array and prints the unique elements.



public class remove_Duplicates {
	public static int rD(int[]arr) {
		        if (arr.length == 0 || arr.length == 1) {
		            return arr.length;
		        } Arrays.sort(arr);
		        int unique = 0;
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] != arr[unique]) {
		                unique++;
		                arr[unique] = arr[i];
		            }
		        }   
		        return unique + 1;
	
		    }
		    public static void main(String[] args) {
		        int[] arr = {4, 2, 2, 3, 1, 4, 5, 1};
		        
		        int newarr = rD(arr);
		        for (int i = 0; i< newarr; i++) {
		            System.out.print(arr[i]);
		        }
		    
		
	}}


