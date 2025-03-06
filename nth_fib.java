//This program calculates the n-th Fibonacci number using an iterative approach.



public class Space_c1 {
	static int isFib(int n) {
		int a=1,b=1,c=1;
		n=n-2;
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println(isFib(1));
		System.out.println(isFib(2));
		System.out.println(isFib(3));
		System.out.println(isFib(4));

		
//TC=o(n)
//SC=o(1)

	}
	

}
