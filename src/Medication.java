import java.time.LocalTime;

public class Medication extends Treatment {

	private String medClass; 
	private double doseTaken; 
	//What were these initial for? 
	private int initialPain; 
	private int finalPain; 	
	
	public Medication(String medicationName, String medClass, double doseTaken, LocalTime timeTaken, LocalTime timeEffective,int initialPain, int finalPain) {
		super(medicationName, timeTaken, timeEffective); 
		this.medClass = medClass; 
		this.doseTaken = doseTaken; 
		this.initialPain = initialPain; 
		this.finalPain = finalPain; 
	}
	
	public String getMedClass(){
		return this.medClass; 
	}
	
	public double getDose(){
		return this.doseTaken; 
	}
}
