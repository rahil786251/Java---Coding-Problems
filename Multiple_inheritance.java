//This program demonstrates Multiple Inheritance using Interfaces in Java. Since Java does not support multiple inheritance with classes, interfaces provide an alternative way to achieve it.



interface CSE{
	void x();
	void course();
	void name();
}
interface Name{
	void x();
	void name();
}
class Student implements CSE,Name{

	@Override
	public void name() {
		System.out.println("basha");
		
	}

	@Override
	public void x() {
		System.out.println("one x");
		
	}

	@Override
	public void course() {
		System.out.println("java");
		
	}
	
}

public class Mul_Interface {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.x();
		s1.name();
	}

}
