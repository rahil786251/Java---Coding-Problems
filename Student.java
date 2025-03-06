//This Java program defines a class Student, initializes instance variables using a constructor, and prints the details of a student.

public class Student {
	int vtno;
	String name;
public Student() {
	this.vtno=21948;
	this.name="Basha";
}
public static void main(String[] args) {
	Student e1=new Student();
	System.out.println(e1.vtno +" " +  e1.name); 
	
}

}
