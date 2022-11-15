import java.util.Scanner;

//Mert Korkut 20190701004-072

public class Play implements Displayable {
	String eventName;
	String startTime;
	String date;
	int duration;
	String endTime;
	int audienceCounter = 0;
	
	Scanner s = new Scanner(System.in);
	
	public Play() {
		
		System.out.println("\nEvent Name: ");
		this.eventName = s.nextLine();
		
		System.out.println("Start Time: ");
		this.startTime = s.nextLine();
		
		System.out.println("Date: ");
		this.date = s.nextLine();
		
		System.out.println("Duration: ");
		this.duration = s.nextInt();
		s.nextLine();
		
		this.endTime = calculateEndTime();
	}
	
	public Play(String eventName, String startTime , String date,int duration) {
		this.eventName = eventName;
		this.startTime = startTime;
		this.date = date;
		this.duration = duration;
		this.endTime = calculateEndTime();
	}

	
	public void displayInfo() {
		//System.out.println("Event Name: " + this.eventName);
		//System.out.println("Start Time: " + this.startTime);
		//System.out.println("Date: " + this.date);
		//System.out.println("Duration: " + this.duration);
		
		System.out.printf( this.eventName + " which starts at " + this.startTime +
				" on " + this.date + " and ends at " + this.calculateEndTime() );
	}
	
	public String calculateEndTime() {
		
		String[] a = startTime.split(":",2);
		int hour = Integer.parseInt(a[0]);
		int minute = Integer.parseInt(a[1]);
		
		hour = duration + hour;
		if ( hour > 23 ) {
			hour = hour - 24;
			this.endTime = this.endTime.format("%02d:%02d the next day", hour, minute);
			return this.endTime;
		}
		
		this.endTime = this.endTime.format("%02d:%02d", hour, minute);
		return this.endTime;
	}
	
	public void otherDisplay() {
		System.out.println("Play:");
		System.out.printf("\tName: %s\n", this.eventName);
		System.out.printf("\tAudiences: %d\n", this.audienceCounter);
		System.out.printf("\tStart: %s\n", this.startTime);
		System.out.printf("\tEnd: %s\n", this.endTime);
		System.out.printf("\tDate: %s\n\n", this.date);
	}
}
