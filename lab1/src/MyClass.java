import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// ctrl + shift + 7 ile comment
//		String a = "Hello";
//		
//		String b = "World!";
//		
//		int c = 10;
//		
//		String e = a+b;
//		
//		e = e.substring(0,5);
//		
//		if( a == e) {
//			System.out.println("same");
//		} else {
//			System.out.println("diff");
//		}
//		
//		if( a.equals(e)) {
//			System.out.println("same");
//		} else {
//			System.out.println("diff");
//		}
//		
//		System.out.println( a + (c + 5) + b);
		
		//System.out.println("Hello" + "World!");
		
		//System.out.printf("%s %s\n","Hello", "World!");

		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		
		int b = s.nextInt();
		
		s.next();
		
		String c = s.next();
		
		System.out.println(a + b + c);
	}

}
