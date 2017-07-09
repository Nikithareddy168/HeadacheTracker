import java.time.LocalDate;
import java.time.LocalTime;

public class Medication extends Treatment {

	private String medClass; 
	private double doseTaken; 
	private LocalTime timeTaken; 
	private int initialPain; 
	private int finalPain; 
	
	public Medication(String treatmentName, String medClass, double doseTaken, LocalTime timeTaken, int initialPain, int finalPain) {
		super(treatmentName); 
		this.medClass = medClass; 
		this.doseTaken = doseTaken; 
		this.timeTaken = timeTaken; 
		this.initialPain = initialPain; 
		this.finalPain = finalPain; 
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println("Getting all medication info"); 
		System.out.println("Medication: " + super.getTreatmentName()
		+ ", " + medClass + " class" + ", " + doseTaken + " mg");
		System.lineSeparator(); 
	}

}
