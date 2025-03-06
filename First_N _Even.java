//This Java program prints the first n even numbers.


public class evenSeries {
	static void printEven(int n) {
		for(int i=1;i<=n+n;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printEven(5);
	}

}
