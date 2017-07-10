import java.time.*;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.HOURS;

import java.util.*;


public class Headache {
	
	private LocalDate date; 
	private LocalTime startTime; 
	private LocalTime endTime; 
	private Map<String, Integer> severity;
	private List<Location> painLocation; 
	private Sidedness sidedness; 
	private HeadacheType headacheType; 
	private List <Trigger> trigger; 
	private Map<Phase,Symptom> symptom; 
	private List <Treatment> treatment; 	

	
	public Headache(LocalDate date, LocalTime startTime, LocalTime endTime, Map<String, Integer> severity,
			List<Location> painLocation, Sidedness sidedness, HeadacheType headacheType, List<Trigger> trigger,
			Map<Phase,Symptom> symptom, List<Treatment> treatment) {
	   
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.severity = severity;
		this.painLocation = painLocation;
		this.sidedness = sidedness;
		this.headacheType = headacheType;
		this.trigger = trigger;
		this.symptom = symptom;
		this.treatment = treatment;	
	}
	
	public void getAll(){
		//Output all headache info in a formatted string
		System.out.println("\n\tGetting Headache info..");
		
		//Get info from each object headache is composed of
		System.out.print("Date " + getDate().format(DateTimeFormatter.ofPattern("MM-dd-yy")) + 
				"\nStart time: " + getStartTime().format(DateTimeFormatter.ofPattern("hh:mm a")) + 
				"\nEnd time: " + getEndTime().format(DateTimeFormatter.ofPattern("hh:mm a")) + "\nDuration: " + getDuration()
				+ "\nHeadache Type: " + getHeadacheType() + "\nSeverity: " + getSeverity() + "\nSidedness: " + getSidedness() + "\nPain Location(s): ");
		
		for(int i = 0; i < painLocation.size(); i++){
			System.out.print(painLocation.get(i)); 
			if(i != painLocation.size() - 1)
				System.out.print(", ");
			else
				System.out.println();
		}
		
		//Get Treatment info 
		getTreatmentInfo(); 
		
		//Get Info for each Phase and Symptom
		System.out.println("\tGetting Symptom/Phase info");
		for(Phase p : symptom.keySet()){
			System.out.print(p.toString() + ": ");
			symptom.get(p).getAll();
			System.out.println(""); 
		}
	}
	
	//get all info from each treatment type
	public void getTreatmentInfo(){
		List<Treatment>tList = getTreatment(); 
		for(Treatment t : tList){
			t.getAll();
		}
	}
	
	/* Are these useful? 
	public long getDurationHours(){
		return getStartTime().until(getEndTime(),HOURS); 
	}
	
	public long getDurationMinutes(){
		return getStartTime().until(getEndTime(),MINUTES); 
	}*/
	
	public double getDuration(){
		return (((double)getStartTime().until(getEndTime(),MINUTES))/60); 
	}
	
	//Getters and Setters
	//Need more abstraction - making new class to handle date/time, severity and painlocation (?), etc. 
   
	public LocalDate getDate() {
		return date;
	}


	public void setSeverity(Map<String, Integer> severity) {
        this.severity = severity;
    }

    public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}


	public LocalTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}


	public String getSeverity() {
	    String key = null;
	    String value = null;
	    String med = null;
	    for (String note: severity.keySet()){

            key = note.toString();
            value = severity.get(note).toString();  
  
        }
	    if(Integer.parseInt(value) > 0 && Integer.parseInt(value) < 4){
	        med = "No medication";
	    }
	    else if(Integer.parseInt(value) > 3 && Integer.parseInt(value) < 7){
	        med = "Use medium level pain medication plus appropriate symptom medication as needed.";    
	    }
	    else 
	        med = "Use high level pain medication in combination with one or more symptom medications.";
		return key + " - " + value + ";  " + med;
	}


	public List<Location> getPainLocation() {
		return painLocation;
	}


	public void setPainLocation(List<Location> painLocation) {
		this.painLocation = painLocation;
	}


	public Sidedness getSidedness() {
		return sidedness;
	}


	public void setSidedness(Sidedness sidedness) {
		this.sidedness = sidedness;
	}


	public List<Trigger> getTrigger() {
		return trigger;
	}


	public void setTrigger(List<Trigger> trigger) {
		this.trigger = trigger;
	}

	public List<Treatment> getTreatment() {
		return treatment;
	}


	public void setTreatment(List<Treatment> treatment) {
		this.treatment = treatment;
	}

	public HeadacheType getHeadacheType() {
		return headacheType;
	}

	public void setHeadacheType(HeadacheType headacheType) {
		this.headacheType = headacheType;
	}

	public Map<Phase, Symptom> getSymptom() {
		return symptom;
	}

	public void setSymptom(Map<Phase, Symptom> symptom) {
		this.symptom = symptom;
	}

}
