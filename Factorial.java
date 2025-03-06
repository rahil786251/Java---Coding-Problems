//This Java program calculates the factorial of a number using a method
public class Factorial {
	static int fact(int n) {
	int ans=1;
	for(int i=1;i<=n;i++)
		ans=ans*i;
	return ans;}
public static void main(String[] args) {
	int res= fact(6);
	
	System.out.println(res);
}
	
	
}
