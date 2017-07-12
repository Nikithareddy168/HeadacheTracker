import java.util.*;

import java.time.LocalDate;

import java.time.LocalTime;



//Driver class for headache tracker application

public class HeadacheApplication {

	public static void main(String[] args){
	
	
		//Treatments
		
		Treatment m = new Medication("MaxAlt", "triptan class", 2.0, LocalTime.of(12,50),LocalTime.of(15, 48),7, 2); 
		
		
		Treatment sh = new SelfHelp("Yoga",LocalTime.of(13, 30),LocalTime.of(15, 45),Effectivity.DID_NOT_HELP); 
		
		List<Treatment> tList = new ArrayList <Treatment>(); 
		
		tList.add(m); 
		
		tList.add(sh); 
		
		
		
		//Symptoms
		
		//Example with single symptom, adding an additional symptom, or using an array to declare a list of symptoms
		
		Map<Phase,Symptom> symptoms = new HashMap<Phase,Symptom>(); 
		
		Symptom s1 = new Symptom("Sunlight"); 
		
		Symptom s2 = new Symptom(DefaultSymptom.LightSensitivity); 
		
		s2.addSymptom(DefaultSymptom.Aura); 
		
		List <String> exampleSymptoms = new ArrayList<>(Arrays.asList("sy1","sy2")); 
		
		Symptom s3 = new Symptom(exampleSymptoms); 
		
		symptoms.put(Phase.CONCURRENT,s1); 
		
		symptoms.put(Phase.POST_DROME, s2); 
		
		symptoms.put(Phase.PRO_DROME, s3); 
		
		
		//severity
		
		Map<String, Integer> severity1 = new HashMap<String, Integer>(); 
		
		severity1.put("Medium grade", 5);
		
		
		
		
		//sidedness and painlocation
		
		Sidedness side1 = Sidedness.BILATERAL; 
		
		Location l1 = Location.FRONTAL; 
		
		Location l2 = Location.OCCIPITAL; 
		
		List<Location> painLocations1 = new ArrayList<>(Arrays.asList(l1,l2)); 
		
		List<Location> painLocations2 = new ArrayList<>(Arrays.asList(l1));
		
		
		//triggers
		
		        Map<Trigger,String> triggerMap = new HashMap<Trigger,String>(); 
		
		        Trigger t1 = new Trigger("Other Trigger");
		
		        Trigger t2 = new Trigger(DefaultTrigger.CertainFoods);
		
		        triggerMap.put(t1, "<<Patient_Note>>");
		
		        triggerMap.put(t2, "Ice Cream");
		
		        
		
		//Headaches
		
		Headache h1 = new Headache(LocalDate.now(), LocalTime.of(12, 0), LocalTime.of(15, 30), severity1,
		
		painLocations1, side1, HeadacheType.MIGRAINE, triggerMap, symptoms,tList); 
		
		Headache h2 = new Headache(LocalDate.now(), LocalTime.of(11, 30), LocalTime.of(20, 0), severity1, painLocations2, Sidedness.BILATERAL, HeadacheType.TENSION, triggerMap, symptoms, tList );
		
		List <Headache> hList = new ArrayList <Headache>(); 
		
		hList.add(h1); 
		
		hList.add(h2);
		
		
		Patient p1 = new Patient(hList); 
		
		p1.getHeadacheInfo();
		
		     
		getSummaryReport(p1);  
		
		System.out.println("");
		Medication med;
		Medication.getMedSymmary();
		System.out.println("");
		System.out.println("Done!");

	
	
	}



	public static void getSummaryReport(Patient p){
	
	        System.out.println("\n\tPrinting Summary Report..\n");
	
	        System.out.println("Headache occurences: " + p.getSize());
	
	        System.out.println("Average Severity: " + (p.totalSeverity/p.getSize()));
	
	        System.out.println("Average Duration: " + (p.totalDuration/p.getSize()));    
	
	        System.out.println("Done!");
	
	        
	
	    }




}