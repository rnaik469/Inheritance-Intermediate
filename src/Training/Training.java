package Training;

public abstract class Training {
	private static int id = 0;
	private String subject;
	private int fees;

	// Constructor with parameters subject and fees
	public Training(String subject, int fees) {

		this.subject = subject;
		this.fees = fees;

		id++;
	}

	// getter setters
	public int getFees() {
		return fees;
	}

	public String getSubject() {
		return subject;
	}

	// Static function to get id
	public static int getId() {
		return id;
	}

	// method used in all the child classes
	abstract int getOrderValue();
}
