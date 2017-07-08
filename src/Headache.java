import java.time.LocalDate;
import java.util.*;

public class Headache {
	
	private LocalDate date; 
	private int durationInHours; 
	private Map<String,Integer> severity;
	private List<Location> painLocation; 
	private Sidedness sidedness; 
	private List<HeadacheType> headacheType; 

	public Headache(LocalDate date, int durationInHours, Map<String,Integer> severity, List<Location> painLocation, Sidedness sidedness, List<HeadacheType> headacheType){
		this.date = date; 
		this.durationInHours = durationInHours; 
		this.severity = severity; 
		this.painLocation = painLocation; 
		this.sidedness = sidedness; 
		this.headacheType = headacheType;
	}

}
