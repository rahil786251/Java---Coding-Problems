//This program demonstrates the interface concept in Java by implementing a simple calculator that performs addition and subtraction.



interface calc{
	int add(int x,int y);
	int sub(int x,int y);
	
}

class check implements calc{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}
	
}

public class Interface_demo {
	public static void main(String[] args) {
		calc c1=new check();
		
		System.out.println(c1.add(25, 25));
		System.out.println(c1.sub(25, 25));
		


	}

}
