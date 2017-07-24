import java.util.*;

import java.time.LocalDate;

import java.time.LocalTime;

//Driver class for headache tracker application
public class HeadacheApplication {

	public static void main(String[] args){
		
		//Create running list of medication and treatment
		Medication m1 = new Medication("MaxAlt", "triptan class", 2.0, LocalTime.of(12,50),LocalTime.of(15, 50),7, 2); 
		Medication m2 = new Medication("Advil", "acetominophen class", 4.0, LocalTime.of(14,55),LocalTime.of(18, 55),9, 1); 
		Medication m3 = new Medication("MaxAlt", "triptan class", 2.0, LocalTime.of(11,50),LocalTime.of(15, 50),7, 2); 
		List<Medication>medList = new ArrayList<Medication>();
		medList.add(m1); 
		medList.add(m2); 
		medList.add(m3); 
		
		SelfHelp sh = new SelfHelp("Yoga",LocalTime.of(13, 30),LocalTime.of(15, 45),Effectivity.DID_NOT_HELP); 
		
		//Create headache, severity, location, symptoms
		Severity s1 = new Severity("stabbing",4); 
		Severity s2 = new Severity("stabbing",8); 
		Location l1 = new Location(LocationType.FRONTAL,SidednessType.LEFT_SIDE); 
		
		l1.add(LocationType.OCCIPITAL,SidednessType.RIGHT_SIDE); 
		Symptom sy1 = new Symptom(DefaultSymptom.Aura); 
		sy1.addSymptom("Second symptom");
		Phase phase1 = new Phase(PhaseType.CONCURRENT,sy1); 
		Symptom sy2 = new Symptom("All smells"); 
		phase1.addPhase(PhaseType.POST_DROME, sy2);
		
		Headache h1 = new Headache(LocalDate.now(),LocalTime.of(12,30),LocalTime.of(18, 30),s1,l1,HeadacheType.CLUSTER,m1,phase1); 
		Headache h2 = new Headache(LocalDate.of(2017, 7, 29),LocalTime.of(12,30),LocalTime.of(19, 30),s2,l1,HeadacheType.CLUSTER,m2,phase1); 
		List<Headache>hList1 = new ArrayList<Headache>(); 
		hList1.add(h1); 
		hList1.add(h2); 
		
		//Create symptoms
		
		
		
		//Treatment Reports
		MedicationReport mr = new MedicationReport(medList); 
		mr.printReport(mr.buildReport()); 
		
		//Headache & Health Summary report
		HealthSummaryReport hsr = new HealthSummaryReport(hList1); 
		hsr.printReport(hsr.buildReport()); 
		
		//Patient Data Report
		PatientDataReport pdr = new PatientDataReport(hList1); 
		pdr.printReport(pdr.buildReport());
		
	}

}