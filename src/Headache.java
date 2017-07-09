import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Headache {
	private LocalDate date; 
	private double durationInHours; 
	private int severity;
	private Location painLocation; 
	private Sidedness sidedness; 
	private HeadacheType headacheType; 
	private Phase ph;
	private ArrayList<Symptoms> plist;
	private ArrayList<Symptoms> clist;
	private ArrayList<Symptoms> postList;
	String prodrome = "Prodrome :";
    String concurrent = "Concurrent :";
	String postdrome = "Postdrome :";
	String allSymptoms;
	
	

	public Headache(String date, double durationInHours, int severity, Location painLocation, Sidedness sidedness, HeadacheType headacheType, ArrayList<Symptoms> psymptoms, ArrayList<Symptoms> csymptoms, ArrayList<Symptoms> postSymptoms){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/d/yy");
		LocalDate localDate = LocalDate.parse(date, formatter);
		this.date = localDate; 
		this.durationInHours = durationInHours; 
		this.severity = severity; 
		this.painLocation = painLocation; 
		this.sidedness = sidedness; 
		this.headacheType = headacheType;
		this.plist=psymptoms;
		this.clist = csymptoms;
		this.postList = postSymptoms;
		
	}
	
	public void getAll(){
		
		System.out.println("plist================================+++++++"+plist);
		//Output all headache info in a formatted string
		for(int i=0;i<plist.size();i++){
			System.out.println("prodrome================================+++++++"+plist.get(i).symptom );
				 prodrome = prodrome +" "+plist.get(i).symptom + " ";
		}
		for(int i=0;i<clist.size();i++){
			 concurrent = concurrent +" "+ clist.get(i).symptom + " ";
		}
		for(int i=0;i<postList.size();i++){
			 postdrome = postdrome +" "+ postList.get(i).symptom + " ";
		}
		System.out.println("prodrome================================+++++++"+prodrome);
		System.out.println("concurrent================================+++++++"+concurrent);
		allSymptoms = prodrome + " "+concurrent + " "+ postdrome;
		String headStr = date.toString() +" "+durationInHours +" " +severity +" "+ painLocation.toString() +"/ "+ sidedness.toString() +"  " +headacheType.toString() +" "+allSymptoms  ;
		System.out.println(headStr);
	}

}
