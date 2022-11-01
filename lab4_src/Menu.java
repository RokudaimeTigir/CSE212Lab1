//Mert Korkut 20190701004-072
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Play> play = new ArrayList<Play>();
		ArrayList<Ticket> ticket = new ArrayList<Ticket>();
		//Ticket ticket[] = new Ticket[10];
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
				
				play.add(new Play( eventName, startTime, date, duration));
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
				
				Iterator<Play> iterator = play.iterator();
				Play tmp = null;
				while ( iterator.hasNext() ) {
					tmp = iterator.next();
					if(tmp.eventName.equals(eventName) ) {
						flag = true;
						break;
					}
					
				}
				if (flag) {
					System.out.println("Play found!");
					if(choice.equals("1")) {
						ticket.add(new Ticket(tmp,audienceName)); 
						System.out.println("Normal Ticket is purchased!\n");
					} else if(choice.equals("2")) {
						ticket.add(new PremiereTicket(tmp,audienceName)); 
						System.out.println("Premiere Ticket is purchased!\n");
					} else if(choice.equals("3")) {
						System.out.println("Enter your code:");
						choice = s.nextLine();
						ticket.add(new PromotionTicket(tmp,audienceName,choice)); 
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
				
				
				
				
				Iterator<Play> iterator = play.iterator();
				Play tmp = null;
				while ( iterator.hasNext() ) {
					tmp = iterator.next();
					if(tmp.eventName.equals(eventName) ) {
						flag = true;
						break;
					}
				}
				if (flag) {
					
					System.out.println("Play found!");
					if(choice.equals("1")) {
						ticket.add(new Ticket(tmp,audienceName,seatNumber)); 
						System.out.printf("Normal Ticket is purchased with seat number %s!\n",seatNumber);

					} else if(choice.equals("2")) {
						ticket.add(new PremiereTicket(tmp,audienceName,seatNumber)); 
						System.out.printf("Premiere Ticket is purchased with seat number %s!\n",seatNumber);
					} else if(choice.equals("3")) {
						System.out.println("Enter your code:");
						choice = s.nextLine();
						ticket.add(new PromotionTicket(tmp,audienceName,seatNumber,choice)); 
						System.out.printf("Promotion Ticket is purchased with seat number %s!\n",seatNumber);

					}
				}
				else
					System.out.println("Play not found!\n");
				
				
			} else if(choice.equals("4")) {
					Iterator<Ticket> iterator = ticket.iterator();
					int j = 0;
					while ( iterator.hasNext() ) {
						Ticket tmp = iterator.next();
						System.out.printf(tmp.audienceName + " is going to ");
						tmp.play.displayInfo();
						if ( tmp.seatNumber != null)
							System.out.printf(" with seat number " + tmp.seatNumber);
						System.out.printf(" with %s price %d TL", tmp.getClass().getName(),tmp.calculatePrice());
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