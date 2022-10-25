
public class PromotionTicket extends Ticket {

	String accessCode;
	
	public PromotionTicket(Play play, String audienceName,String accessCode) {
		super(play,audienceName);
		this.accessCode = accessCode;
	}
	
	public PromotionTicket(Play play, String audienceName, String seatNumber, String accessCode) {
		super(play,audienceName,seatNumber);
		this.accessCode = accessCode;
	}
	public int calculatePrice() {
		String a = accessCode.charAt(3)+"";
		return (super.calculatePrice()-(Integer.parseInt(a)*10));
	}
}
