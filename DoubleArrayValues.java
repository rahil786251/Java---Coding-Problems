/*The given Java program performs the following tasks:

Declares an integer array a[] = {11, 22, 33};
Passes the array to the function fx(a);, which doubles each element in the array.
Prints the modified array*/

public class Sorting {
	public static void main(String[] args) {
		int a[] = {11, 22, 33};
		fx(a);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
	}

	static int[] fx(int a[]) {
		for (int i = 0; i < a.length; i++)
			a[i] = a[i] * 2;
		return a;
	}
}
