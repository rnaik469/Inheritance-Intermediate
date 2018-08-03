package Training;

public class PublicTraining extends Training {

	private int participants;

	// Constructor with parameters subject,fees and participants
	public PublicTraining(String subject, int fees, int participants) {
		super(subject, fees);
		this.participants = participants;
	}

	// returns PublicTraining fees
	public int getOrderValue() {
		return getFees() * participants;
	}

}
