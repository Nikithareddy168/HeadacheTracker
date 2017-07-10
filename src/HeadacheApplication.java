import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

//Driver class for headache tracker application
public class HeadacheApplication {
	public static void main(String[] args){
		
		//Treatments
		Treatment m = new Medication("MaxAlt", "triptan class", 5.0, LocalTime.of(12,50),LocalTime.of(15, 48),7, 2); 
		Treatment m1 = new Medication("MaxAlt", "triptan class", 5.0, LocalTime.of(12,50),LocalTime.of(15, 48),7, 2);
		Treatment m2 = new Medication("Anaprox", "NSAID class", 550.0, LocalTime.of(12,50),LocalTime.of(15, 48),7, 2);
		Treatment m3 = new Medication("Anaprox", "NSAID class", 550.0, LocalTime.of(12,50),LocalTime.of(15, 48),7, 2);
		Treatment sh = new SelfHelp("Yoga",LocalTime.of(13, 30),LocalTime.of(15, 45),Effectivity.DID_NOT_HELP); 
		List<Treatment> tList = new ArrayList <Treatment>(); 
		tList.add(m); 
		tList.add(m1);
		tList.add(m2);
		tList.add(m3);
		tList.add(sh); 
		
		//Symptoms
		//Example with single symptom, adding an additional symptom, or using an array to declare a list of symptoms
		Map<Phase,Symptom> symptoms = new HashMap<Phase,Symptom>(); 
		Map<String, Integer> severity = new HashMap<String, Integer>(); 
		Symptom s1 = new Symptom("Sunlight"); 
		Symptom s2 = new Symptom(DefaultSymptom.LightSensitivity); 
		s2.addSymptom(DefaultSymptom.Aura); 
		List <String> exampleSymptoms = new ArrayList<>(Arrays.asList("sy1","sy2")); 
		Symptom s3 = new Symptom(exampleSymptoms); 
		symptoms.put(Phase.CONCURRENT,s1); 
		symptoms.put(Phase.POST_DROME, s2); 
		symptoms.put(Phase.PRO_DROME, s3); 
		
		severity.put("Medium grade", 5);
		//sidedness and painlocation
		Sidedness s = Sidedness.BILATERAL; 
		Location l1 = Location.FRONTAL; 
		Location l2 = Location.OCCIPITAL; 
		List<Location> painLocations = new ArrayList<>(Arrays.asList(l1,l2)); 
		

		//Headaches
		Headache h1 = new Headache(LocalDate.now(), LocalTime.of(12, 0), LocalTime.of(15, 30), severity,
				painLocations, s, HeadacheType.MIGRAINE, null, symptoms,tList); 
		List <Headache> hList = new ArrayList <Headache>(); 
		hList.add(h1); 
		
		Patient p1 = new Patient(hList); 
		p1.getHeadacheInfo();
		
		// Medication Summary Report
		
		System.out.println("");
		Medication med;
		Medication.getMedSymmary();
		System.out.println("");
		System.out.println("Done!");
	
	}
	

}
