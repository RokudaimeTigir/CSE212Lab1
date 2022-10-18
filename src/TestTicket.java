//Mert Korkut 20190701004-072
import java.util.Scanner;

public class TestTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Play play[] = new Play[10];
		Ticket ticket[] = new Ticket[10];
		int i = 0;
		int k = 0;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. Create new Play");
			System.out.println("2. Buy a Ticket");
			System.out.println("3. Buy a Ticket with seat number");
			System.out.println("4. Display all Tickets");
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
				
				//System.out.println(play[0].eventName);
				
				Boolean flag = false;
				System.out.println("\nAudience Name: ");
				String audienceName = s.nextLine();
				
				System.out.println("\nEvent Name: ");
				String eventName = s.nextLine();
				
				int j = 0;
				
				for (j = 0; j < i ; j++) {
					if(play[j].eventName.equals(eventName) ) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Play found!");
					ticket[k++] = new Ticket(play[j],audienceName); 
					System.out.println("Ticket is purchased!\n");
				}
				else
					System.out.println("Play not found!\n");
				
			} else if(choice.equals("3")) {
				
				Boolean flag = false;
				
				System.out.println("\nSeat Number: ");
				String seatNumber = s.nextLine();
				
				System.out.println("\nAudience Name: ");
				String audienceName = s.nextLine();
				
				System.out.println("\nEvent Name: ");
				String eventName = s.nextLine();
				
				
				
				int j = 0;
				for (j = 0; j < i; j++) {
					if(play[j].eventName.equals(eventName) ) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Play found!");
					ticket[k++] = new Ticket(play[j],audienceName,seatNumber); 
					System.out.printf("Ticket is purchased with seat number %s!\n",seatNumber);
				}
				else
					System.out.println("Play not found!\n");
				
				
			} else if(choice.equals("4")) {
				
				for (int j = 0; j < k ; j++) {

						System.out.printf(ticket[j].audienceName + " is going to ");
						ticket[j].play.displayInfo();
						if ( ticket[j].seatNumber != null)
							System.out.printf(" with seat number " + ticket[j].seatNumber);
						System.out.println();
					
				}
				
			} else if(choice.equals("0")) {
				
				System.exit(0);
				
			} else {
				
				System.out.println("Please enter correct choice!");
				
			}
		}

	}
}