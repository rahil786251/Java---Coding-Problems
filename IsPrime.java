//This Java program checks whether a given number n is a prime number.

public class isprime {
	  boolean  isPrime( int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++) 
			
			if(n%i==0) 
				return false;
			
			return true;

		
	  }
public static void main(String[] args) {
	isprime obj=new isprime();
	boolean ans=obj.isPrime(10);
	System.out.println(ans);
	
	
}
		


}
