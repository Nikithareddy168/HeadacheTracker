import java.time.*;
import java.time.format.DateTimeFormatter;

//Abstract/Interface for selfhelp and medication classes
public abstract class Treatment implements Report {

	private String treatmentName; 
	//Phase b/c says we could also track timeeffectivity for selfhelp, could possibly take start time and end time from medication and put it here as well
	//Can discuss during next call
	private LocalTime timeEffective; 
	private LocalTime timeTaken; 

	
	public Treatment(String treatmentName, LocalTime timeTaken, LocalTime timeEffective) {
		this.timeEffective = timeEffective; 
		this.timeTaken = timeTaken; 
		this.treatmentName = treatmentName; 
	}
	
	public String getTreatmentName(){
		return treatmentName; 
	}
	
	public LocalTime getTimeEffective(){
		return timeEffective; 
	}
	
	public LocalTime getTimeTaken(){
		return timeTaken; 
	}
	
	public String getTreatmentTimes(){
		return "Time started: " + getTimeTaken().format(DateTimeFormatter.ofPattern("hh:mm a")) + 
		", Time Effective: " + getTimeEffective().format(DateTimeFormatter.ofPattern("hh:mm a"));
	}
	

}
