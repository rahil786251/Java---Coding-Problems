//This Java program demonstrates abstraction and polymorphism using abstract classes.



abstract class Animal{
	abstract void  makeSound();
}
class cat extends Animal{
	void makeSound() {
	System.out.println("meow");
		
	}
	
}
class dog extends Animal{
	void makeSound() {
		System.out.println("bow");
	}
}

public class Abs_demo {
	public static void main(String[] args) {
		Animal a=new cat();
		a.makeSound();
		Animal a1 =new dog();
		a1.makeSound();
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof cat);
		System.out.println(a1 instanceof dog);
		
	}

}
