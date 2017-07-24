import java.time.LocalTime;
import java.util.ArrayList;
import static java.time.temporal.ChronoUnit.MINUTES;
import java.util.HashMap;

public class Medication extends Treatment {

	private String medClass; 
	private String medicationName; 
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
	
	public String getMedClass(){
		return this.medClass; 
	}
	
	public double getDose(){
		return this.doseTaken; 
	}
}
