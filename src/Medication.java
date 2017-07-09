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
		System.out.println("\tGetting all medication info"); 
		System.out.println("Medication: " + super.getTreatmentName()
		+ ", " + getMedClass() + " class" + ", " + getDoseTaken() + " mg" + ", " +
				getTreatmentTimes());
		System.lineSeparator(); 
	}
	

	public String getMedClass() {
		return medClass;
	}

	public void setMedClass(String medClass) {
		this.medClass = medClass;
	}

	public double getDoseTaken() {
		return doseTaken;
	}

	public void setDoseTaken(double doseTaken) {
		this.doseTaken = doseTaken;
	}

	public int getInitialPain() {
		return initialPain;
	}

	public void setInitialPain(int initialPain) {
		this.initialPain = initialPain;
	}

	public int getFinalPain() {
		return finalPain;
	}

	public void setFinalPain(int finalPain) {
		this.finalPain = finalPain;
	}

}
