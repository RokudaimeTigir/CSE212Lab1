
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
}
