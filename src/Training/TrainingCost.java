package Training;

public class TrainingCost {
	public static void main(String args[])
	{
		Training trainingPublic = new PublicTraining("Java", 5000, 50); //Instantiating PublicTraining class 
		System.out.println("Cost of Public training with ID: "+ Training.getId()+" is : "+trainingPublic.getOrderValue());
		
		Training trainingCorporate = new CorporateTraining("Bigdata", 35000, 4); //Instantiating CorporateTraining class 
		System.out.println("Cost of Corporate training with ID: "+ Training.getId()+" is : "+trainingCorporate.getOrderValue());
		
		
	}
}
