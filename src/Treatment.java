import java.time.*;

//Abstract/Interface for selfhelp and medication classes
public abstract class Treatment implements Report {

	private String treatmentName; 
	//Phase b/c says we could also track timeeffectivity for selfhelp, could possibly take start time and end time from medication and put it here as well
	//Can discuss during next call
	private LocalTime timeEffective; 
	
	public Treatment(String treatmentName) {
		this.treatmentName = treatmentName; 
	}
	
	public String getTreatmentName(){
		return treatmentName; 
	}
	

}