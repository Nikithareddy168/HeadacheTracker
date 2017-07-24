import java.util.*;

import java.time.LocalDate;

import java.time.LocalTime;

//Driver class for headache tracker application
public class HeadacheApplication {

	public static void main(String[] args){
		
		//Should treatment abstract class instead hold a list instead of having it out here? 
		//Create running list of medication and treatment (like a pill case) or
		//	in the case of selfhelp, a running note of selfhelp methods
		Medication m1 = new Medication("MaxAlt", "triptan class", 2.0, LocalTime.of(12,50),LocalTime.of(15, 50),7, 2); 
		Medication m2 = new Medication("Advil", "acetominophen class", 4.0, LocalTime.of(14,55),LocalTime.of(18, 55),9, 1); 
		Medication m3 = new Medication("MaxAlt", "triptan class", 2.0, LocalTime.of(11,50),LocalTime.of(15, 50),7, 2); 
		List<Medication>medList = new ArrayList<Medication>();
		medList.add(m1); 
		medList.add(m2); 
		medList.add(m3); 
		Effectivity e1 = new Effectivity(EffectivityType.DID_NOT_HELP); 
		Effectivity e2 = new Effectivity(EffectivityType.HELPED_A_LOT); 
		SelfHelp sh1 = new SelfHelp("Yoga",LocalTime.of(13, 30),LocalTime.of(16, 30),e1); 
		sh1.addSelfHelp("Stretching", e2);
		sh1.addSelfHelp("Stretching", e1);
		SelfHelp sh2 = new SelfHelp("Breathing",LocalTime.of(13, 30),LocalTime.of(16, 30),e1); 
		sh2.addSelfHelp("Stretching", e2);
		List<SelfHelp>selfHelpList = new ArrayList<SelfHelp>(); 
		selfHelpList.add(sh1); 
		selfHelpList.add(sh2); 
		
		//Create items required for headache constructor
		//Severity and Location
		Severity s1 = new Severity("stabbing",4); 
		Severity s2 = new Severity("stabbing",8); 
		Location l1 = new Location(LocationType.FRONTAL,SidednessType.LEFT_SIDE); 
		l1.add(LocationType.OCCIPITAL,SidednessType.RIGHT_SIDE); 
		
		//Symptom and Phases
		Symptom sy1 = new Symptom(DefaultSymptom.Aura); 
		sy1.addSymptom("Second symptom");
		Phase phase1 = new Phase(PhaseType.CONCURRENT,sy1); 
		Symptom sy2 = new Symptom("All smells"); 
		phase1.addPhase(PhaseType.POST_DROME, sy2);
		
		//Triggers
		Trigger t1 = new Trigger("Trigger1"); 
		t1.addTrigger(DefaultTrigger.Alcohol);
		
		//Compile into headaches
		Headache h1 = new Headache(LocalDate.now(),LocalTime.of(12,30),LocalTime.of(18, 30),s1,l1,HeadacheType.CLUSTER,m1,phase1,t1,sh1); 
		Headache h2 = new Headache(LocalDate.of(2017, 7, 29),LocalTime.of(12,30),LocalTime.of(19, 30),s2,l1,HeadacheType.CLUSTER,m2,phase1,t1,sh2); 
		List<Headache>hList1 = new ArrayList<Headache>(); 
		hList1.add(h1); 
		hList1.add(h2); 
				
		
		//Compile headaches into headache patients
		//Then add list of patients to neurologist
		HeadachePatient hp1 = new HeadachePatient(hList1,medList); 
		List<HeadachePatient> hpList = new ArrayList<HeadachePatient>(); 
		hpList.add(hp1); 
		Neurologist neuro = new Neurologist(hpList); 
		
		
		MedicationReport mr = new MedicationReport();
		SelfHelpReport shr = new SelfHelpReport(); 
		HealthSummaryReport hsr = new HealthSummaryReport(); 
		PatientDataReport pdr = new PatientDataReport(); 

		//Iterate through neurologist patients and print report for each
		for(HeadachePatient hp : neuro.getPatientList()){
			mr.setMedList(hp.getTreatmentComposition()); 
			shr.setSelfHelp(selfHelpList);  //Had trouble making selfhelp clean
			hsr.setHeadacheList(hp.getHealthComposition()); 
			pdr.setHeadacheList(hp.getHealthComposition());
		}
					
		//Strategy 
		List<Report> reportList = new ArrayList<Report>(); 
		reportList.add(mr); 
		reportList.add(hsr); 
		reportList.add(pdr); 
		reportList.add(shr); 
		for(Report r : reportList){
			r.printReport(r.buildReport());
		}
		
	}

}