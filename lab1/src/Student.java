import java.util.Scanner;

public class Student {
	
	String name;
	String surname;
	long id;
	
	public Student() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		name = s.nextLine();
		System.out.print("Enter Surname: ");
		surname = s.nextLine();
		System.out.print("Enter ID: ");
		id = s.nextLong();
		
	}
	
	public void display() {
		
		System.out.println("Name of the student: " + name);
		System.out.println("Surname of the student: " + surname);
		System.out.println("ID of the student: " + id);
		
	}
	
}
