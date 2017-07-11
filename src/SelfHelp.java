import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SelfHelp extends Treatment{
	private Effectivity effectivity; 
	
	
	public SelfHelp(String selfHelpMethod, LocalTime timeTaken, LocalTime timeEffective, Effectivity effectivity) {
		super(selfHelpMethod,timeTaken, timeEffective); 
		this.effectivity = effectivity; 
	}
	
	public String averageEffectivity(){
		return effectivity.toString();
	}
	
	
	public void getAll(){
		
		//Format date

		System.out.println("\tPrinting self help info");
		System.lineSeparator(); 
		System.out.println("Selfhelp Method: " + getEffectivity().toString()
				+ ", " + getTreatmentTimes()); 
		System.lineSeparator(); 
	}

	public Effectivity getEffectivity() {
		return effectivity;
	}

	public void setEffectivity(Effectivity effectivity) {
		this.effectivity = effectivity;
	}

}
