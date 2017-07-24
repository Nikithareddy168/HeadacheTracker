import java.time.*;
import static java.time.temporal.ChronoUnit.MINUTES;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

//Abstract/Interface for selfhelp and medication classes
//Selfhelp will be considered a type of treatment, so reporting will be the same
public abstract class Treatment {
	private static DecimalFormat df = new DecimalFormat(".##"); 
	private String treatmentName; 
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
	
	public double getTimeToEffective(){
		double elapsedTime = ((double)getTimeTaken().until(getTimeEffective(),MINUTES))/60;	
		return Double.valueOf(df.format(elapsedTime)); 
	}
	
	//Return string of medication or selfhelp
	//default to time effective
	public String averageEffectivity(){
		return timeEffective.toString(); 
	}
	
	public String getTreatmentTimes(){
		return "Time started: " + getTimeTaken().format(DateTimeFormatter.ofPattern("hh:mm a")) + 
		", Time Effective: " + getTimeEffective().format(DateTimeFormatter.ofPattern("hh:mm a"));
	}
	

}
