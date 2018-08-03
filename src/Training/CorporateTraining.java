package Training;

public class CorporateTraining extends Training {

	private int days;

	// Constructor with parameters subject,fees and days
	public CorporateTraining(String subject, int fees, int days) {
		super(subject, fees);
		this.days = days;
	}

	// returns CorporateTraining fees
	int getOrderValue() {
		return getFees() * days;
	}

}
