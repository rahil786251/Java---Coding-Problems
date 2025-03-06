//The given Java program calculates a numerical value based on two integer arrays (a[] and b[]) using a specific formula inside a loop.



public class Deal_36 {
	static int findValue (int n, int a [], int b []) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			c=c+a[i]*4;
			c=c+b[i]*2;
		}
		return c;
	}
	public static void main(String[] args) {
		int res=findValue(3,new int[] {4,4,1},new int[] {2,0,2});
		System.out.println(res);
	}

}
