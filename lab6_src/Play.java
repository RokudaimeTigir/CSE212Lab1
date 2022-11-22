import java.util.Comparator;
import java.util.Scanner;

//Mert Korkut 20190701004-072

public class Play implements Displayable, Comparable<Play>{
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

	@Override
	public int compareTo(Play arg0) {
		String[] str1 = this.date.split("\\.");
		int day1 = Integer.parseInt(str1[0]);
		int month1 = Integer.parseInt(str1[1]);
		int year1 = Integer.parseInt(str1[2]);
		
		String[] str2 = arg0.date.split("\\.");
		int day2 = Integer.parseInt(str2[0]);
		int month2 = Integer.parseInt(str2[1]);
		int year2 = Integer.parseInt(str2[2]);
		
		int yearCompare = year1 - year2 ;
		
		if ( yearCompare != 0)
			return yearCompare;
		
		int monthCompare = month1 - month2;
		
		if( monthCompare != 0)
			return monthCompare;
		
		int dayComparator = day1-day2;
		
		if( dayComparator != 0)
			return (day1-day2);
		
		return startComparator.compare(this,arg0);
		
	}
	
	public static Comparator<Play> startComparator = new Comparator<Play>() {

		@Override
		public int compare(Play arg0, Play arg1) {
			String[] str1 = arg0.startTime.split(":");
			int hour1 = Integer.parseInt(str1[0]);
			int minute1 = Integer.parseInt(str1[1]);
			
			String[] str2 = arg1.startTime.split(":");
			int hour2 = Integer.parseInt(str2[0]);
			int minute2 = Integer.parseInt(str2[1]);
			
			int hourCompare = hour1-hour2;
			
			if ( hourCompare != 0)
				return hourCompare;

			int minuteCompare = minute1-minute2;
			
			if (minuteCompare != 0)
				return minuteCompare;
			
			return endComparator.compare(arg0, arg1);
		}
		
	};
	
	public static Comparator<Play> endComparator = new Comparator<Play>() {

		@Override
		public int compare(Play arg0, Play arg1) {
			String[] str1 = arg0.endTime.split(":");
			int hour1 = Integer.parseInt(str1[0]);
			int minute1 = Integer.parseInt(str1[1]);
			
			String[] str2 = arg1.endTime.split(":");
			int hour2 = Integer.parseInt(str2[0]);
			int minute2 = Integer.parseInt(str2[1]);
			
			int hourCompare = hour1-hour2;
			
			if ( hourCompare != 0)
				return hourCompare;

			int minuteCompare = minute1-minute2;
			
			if (minuteCompare != 0)
				return minuteCompare;
			
			return nameComparator.compare(arg0, arg1);
		}
		
	};
	
	public static Comparator<Play> nameComparator = new Comparator<Play>() {

		@Override
		public int compare(Play o1, Play o2) {
			
			return o1.eventName.compareTo(o2.eventName);
		}
		
	};
}
