
public class Ticket implements Displayable{
	Play play = null;
	String audienceName;
	String seatNumber;
	
	public Ticket(Play play, String audienceName) {
		this.play = play;
		this.audienceName = audienceName;
		this.play.audienceCounter +=1;
	}
	
	public Ticket(Play play, String audienceName, String seatNumber) {
		this(play,audienceName);
		this.seatNumber = seatNumber;
	}
	
	public int calculatePrice() {
		return 200;
	}
	
	public void otherDisplay() {
		System.out.println("Ticket:");
		System.out.printf("\tName: %s\n", this.audienceName);
		System.out.printf("\tPlay: %s\n", this.play.eventName);
		System.out.printf("\tPrice: %d\n", this.calculatePrice());
	}
}
