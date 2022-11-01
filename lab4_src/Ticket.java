
public class Ticket {
	Play play = new Play();
	String audienceName;
	String seatNumber;
	
	public Ticket(Play play, String audienceName) {
		this.play = play;
		this.audienceName = audienceName;
	}
	
	public Ticket(Play play, String audienceName, String seatNumber) {
		this(play,audienceName);
		this.seatNumber = seatNumber;
	}
	
	public int calculatePrice() {
		return 200;
	}
}
