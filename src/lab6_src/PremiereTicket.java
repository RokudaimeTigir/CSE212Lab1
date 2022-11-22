
public class PremiereTicket extends Ticket{

	public PremiereTicket(Play play, String audienceName) {
		super(play, audienceName);
		// TODO Auto-generated constructor stub
	}
	
	public PremiereTicket(Play play, String audienceName, String seatNumber) {
		super(play,audienceName,seatNumber);	
	}

	public int calculatePrice() {
		return super.calculatePrice()*2;
	}
	
	public void otherDisplay() {
		System.out.println("Ticket:");
		System.out.printf("%8Name: %s", this.audienceName);
		System.out.printf("%8Play: %s", this.play.eventName);
		System.out.printf("%8Price: %d", this.calculatePrice());
	}
}
