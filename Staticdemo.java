//This program demonstrates the use of static and non-static methods & variables in Java.



public class StaticDemo {
	static int i=0;
	static void gdmrng() {
		System.out.println("gdmrng");
		System.out.println(i);
		i++;
		
	}
	void hi() {
		System.out.println("hi");
		System.out.println(i);
	}
public static void main(String[] args) {
	System.out.println(i);
	i++;
	gdmrng();
	StaticDemo obj=new StaticDemo();
	obj.hi();
}

}
