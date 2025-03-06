//This program calculates the sum of the digits of a given number (n = 12345).



public class sumof_Digits {
	public static void main(String[] args) {
		int n=12345;
		int ans=0;
		while(n>0) {
			int r=n%10;
			n=n/10;
			ans=ans+r;
			
		}
		System.out.println(ans);
	}

}
