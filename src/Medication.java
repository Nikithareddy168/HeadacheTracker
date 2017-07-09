import java.time.LocalTime;

public class Medication extends Treatment {

	private String medClass; 
	private double doseTaken; 
	private int initialPain; 
	private int finalPain; 
	
	public Medication(String medicationName, String medClass, double doseTaken, LocalTime timeTaken, LocalTime timeEffective,int initialPain, int finalPain) {
		super(medicationName, timeTaken, timeEffective); 
		this.medClass = medClass; 
		this.doseTaken = doseTaken; 
		this.initialPain = initialPain; 
		this.finalPain = finalPain; 
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println("Getting all medication info"); 
		System.out.println("Medication: " + super.getTreatmentName()
		+ ", " + medClass + " class" + ", " + doseTaken + " mg" + ", " +
				getTreatmentTimes());
		System.lineSeparator(); 
	}

}
