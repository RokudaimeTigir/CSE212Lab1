//Mert Korkut 20190701004-072
import java.util.Scanner;

public class TestPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Play play[] = new Play[10];
		int i = 0;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. Create new Play");
			System.out.println("2. Display all Plays");
			System.out.println("0. Exit");
			
			String choice = s.nextLine();
			
			if(choice.equals("1")) {
				
				System.out.println("\nEvent Name: ");
				String eventName = s.nextLine();
				
				System.out.println("Start Time: ");
				String startTime = s.nextLine();
				
				System.out.println("Date: ");
				String date = s.nextLine();
				
				System.out.println("Duration: ");
				int duration = s.nextInt();
				s.nextLine();
				
				play[i++] = new Play( eventName, startTime, date, duration);
				System.out.println();
				
			} else if(choice.equals("2")) {
				
				System.out.println();
				
				for (int j = 0; j < play.length; j++) {
					if(play[j] != null)
						play[j].displayInfo();
				}
				
				System.out.println();
			} else if(choice.equals("0")) {
				
				System.exit(0);
				
			} else {
				
				System.out.println("Please enter correct choice!");
				
			}
		}

	}
}