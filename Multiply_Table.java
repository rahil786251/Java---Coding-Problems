//This Java program prints the multiplication table of a given number up to 10 times.


public class multiplyN {
	static void printTable (int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
	public static void main(String[] args) {
		printTable(20);
	}

}
