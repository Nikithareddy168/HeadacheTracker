import java.time.LocalDate;
import java.util.*;

public class Headache {
	private String date; 
	private double durationInHours; 
	private int severity;
	private Location painLocation; 
	private Sidedness sidedness; 
	private HeadacheType headacheType; 

	public Headache(String date, double durationInHours, int severity, Location painLocation, Sidedness sidedness, HeadacheType headacheType){
		this.date = date; 
		this.durationInHours = durationInHours; 
		this.severity = severity; 
		this.painLocation = painLocation; 
		this.sidedness = sidedness; 
		this.headacheType = headacheType;
		
	}
	
	public String getAll(){
		
		//Output all headache info in a formatted string
		String headStr = date.toString() + durationInHours + severity + painLocation.toString() + sidedness.toString() + headacheType.toString()  ;
		return headStr;
	}

}
