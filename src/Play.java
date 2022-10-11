//Mert Korkut 20190701004-072

public class Play {
	String eventName;
	String startTime;
	String date;
	int duration;
	
	public Play() {
		
	}
	
	public Play(String eventName, String startTime , String date,int duration) {
		this.eventName = eventName;
		this.startTime = startTime;
		this.date = date;
		this.duration = duration;
	}
	
	public void displayInfo() {
		//System.out.println("Event Name: " + this.eventName);
		//System.out.println("Start Time: " + this.startTime);
		//System.out.println("Date: " + this.date);
		//System.out.println("Duration: " + this.duration);
		
		System.out.println( this.eventName + " starts at " + this.startTime +
				" on " + this.date + " and ends at " + this.calculateEndTime() );
	}
	
	public String calculateEndTime() {
		
		String[] a = startTime.split(":",2);
		int hour = Integer.parseInt(a[0]);
		int minute = Integer.parseInt(a[1]);
		
		hour = duration + hour;
		if ( hour > 23 ) {
			hour = hour - 24;
			this.startTime = this.startTime.format("%02d:%02d the next day", hour, minute);
			return this.startTime;
		}
		
		this.startTime = this.startTime.format("%02d:%02d", hour, minute);
		return this.startTime;
	}
}
