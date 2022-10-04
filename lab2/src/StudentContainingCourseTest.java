import java.util.Scanner;

public class StudentContainingCourseTest {

	/**by what right do you, good men, judge
	 * you are in the contempt of man
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		
		StudentContainingCourse[] student = new StudentContainingCourse[10];
		int i = 0;
//		StudentContainingCourse s1 = null;
//		StudentContainingCourse s2 = null;
//		StudentContainingCourse s3 = null;
		
		while ( 1 == 1) {
//			System.out.println("1. Enter Student1");
//			System.out.println("2. Enter Student2");
//			System.out.println("3. Enter Student3");
//			System.out.println("4. Display All");
//			System.out.println("5. Exit");
			
			
			//long num = input.nextLong();
			//input.nextLine();
//			String choice = input.nextLine();
//			if ( choice.equals("1") ) {
//				s1 = new StudentContainingCourse();
//			}
//			else if ( choice.equals("2") ) {
//				s2 = new StudentContainingCourse();
//			}
//			else if ( choice.equals("3") ) {
//				s3 = new StudentContainingCourse();
//			}
//			else if ( choice.equals("4") ) {
//				if(s1 != null)
//					s1.displayInformation();
//				if(s2 != null)
//					s2.displayInformation();
//				if(s3 != null)
//					s3.displayInformation();
//			}
//			else if ( choice.equals("5") ) {
//				//break;
//				System.exit(0);
//			}
//			
//			else {
//				System.out.println("Enter a valid choice");
//			}
//			
			System.out.println("1. Enter a student");
			System.out.println("2. Display All");
			System.out.println("0. Exit");
			
			String choice = input.nextLine();
			if ( choice.equals("1") ) {
				if (i != 10 ) {
					//student[i] = new StudentContainingCourse();
					//i++;
					student[i++] = new StudentContainingCourse();
				}
				else {
					System.out.println("Max number of students is reached");
				}
			}
			else if ( choice.equals("2") ) {
				for ( int j = 0; j < i; j++) {
					student[j].displayInformation();
				}
//				for ( int j = 0; j < student.length; j++) {
//					if ( student j != null)
//						student[j].displayInformation();
//				}
			}
			else if ( choice.equals("0") ) {
				System.exit(0);
			}
			else {
				System.out.println("Enter a valid choice");
			}
		}

	}
}
