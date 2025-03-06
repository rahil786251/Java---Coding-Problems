//This program prints the first n odd numbers.



public class oddSeries {
	static void printOdd(int n) {
		for(int i=1;i<=n+n;i++) {
			if(i%2!=0) 
				System.out.println(i);
			}
	}
				
	public static void main(String[] args) {
		 printOdd(2);
		
	}

}
