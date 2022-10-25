//Mert Korkut 20190701004-072
import java.util.Scanner;

public class TestTicketTypes {

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
				
				System.out.println("1. Create Normal Ticket");
				System.out.println("2. Create Premiere Ticket");
				System.out.println("3. Create Promotion Ticket");
				choice = s.nextLine();
				
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
					if(choice.equals("1")) {
						ticket[k++] = new Ticket(play[j],audienceName); 
						System.out.println("Normal Ticket is purchased!\n");
					} else if(choice.equals("2")) {
						ticket[k++] = new PremiereTicket(play[j],audienceName); 
						System.out.println("Premiere Ticket is purchased!\n");
					} else if(choice.equals("3")) {
						System.out.println("Enter your code:");
						choice = s.nextLine();
						ticket[k++] = new PromotionTicket(play[j],audienceName,choice); 
						System.out.println("PromotionTicket is purchased!\n");
					}

				}
				else
					System.out.println("Play not found!\n");
				
			} else if(choice.equals("3")) {
				
				System.out.println("1. Create Normal Ticket");
				System.out.println("2. Create Premiere Ticket");
				System.out.println("3. Create Promotion Ticket");
				choice = s.nextLine();
				
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
					if(choice.equals("1")) {
						ticket[k++] = new Ticket(play[j],audienceName,seatNumber); 
						System.out.printf("Normal Ticket is purchased with seat number %s!\n",seatNumber);

					} else if(choice.equals("2")) {
						ticket[k++] = new PremiereTicket(play[j],audienceName,seatNumber); 
						System.out.printf("Premiere Ticket is purchased with seat number %s!\n",seatNumber);
					} else if(choice.equals("3")) {
						System.out.println("Enter your code:");
						choice = s.nextLine();
						ticket[k++] = new PromotionTicket(play[j],audienceName,seatNumber,choice); 
						System.out.printf("Promotion Ticket is purchased with seat number %s!\n",seatNumber);

					}
				}
				else
					System.out.println("Play not found!\n");
				
				
			} else if(choice.equals("4")) {
				
				for (int j = 0; j < k ; j++) {

						System.out.printf(ticket[j].audienceName + " is going to ");
						ticket[j].play.displayInfo();
						if ( ticket[j].seatNumber != null)
							System.out.printf(" with seat number " + ticket[j].seatNumber);
						System.out.printf(" with %s price %d TL", ticket[j].getClass().getName(),ticket[j].calculatePrice());
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