import java.time.LocalTime;

//Driver class for headache tracker application
public class HeadacheApplication {
	public static void main(String[] args){
		Treatment m = new Medication("MaxAlt", "triptan class", 2.0, LocalTime.of(12,50),LocalTime.of(15, 48),7, 2); 
		Treatment sh = new SelfHelp("Yoga",LocalTime.of(13, 30),LocalTime.of(15, 45),Effectivity.DID_NOT_HELP); 
		
		m.getAll();
		sh.getAll();
	}
	

}
