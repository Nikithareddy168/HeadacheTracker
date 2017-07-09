import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

//Driver class for headache tracker application
public class HeadacheApplication {
	public static void main(String[] args){
		
		Treatment m = new Medication("MaxAlt", "triptan class", 2.0, LocalTime.of(12,50),LocalTime.of(15, 48),7, 2); 
		Treatment sh = new SelfHelp("Yoga",LocalTime.of(13, 30),LocalTime.of(15, 45),Effectivity.DID_NOT_HELP); 
		
		List<Treatment> tList = new ArrayList <Treatment>(); 
		tList.add(m); 
		tList.add(sh); 
		
		Headache h1 = new Headache(LocalDate.now(), LocalTime.of(12, 0), LocalTime.of(3, 0), null,
				null, null, null, null, null,tList); 
		
		
		List <Headache> hList = new ArrayList <Headache>(); 
		hList.add(h1); 
		
		Patient p1 = new Patient(hList); 
		p1.getHeadacheInfo();
		
		System.out.println("Done!");
	
	}
	

}
