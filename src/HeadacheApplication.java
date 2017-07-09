import java.time.LocalTime;

//Driver class for headache tracker application
public class HeadacheApplication {
	public static void main(String[] args){
		Treatment m1 = new Medication("MaxAlt", "triptan", 2.0, LocalTime.now() , 7, 5); 
		Treatment m2 = new Medication("Tylenol", "acetaminophen", 1.0, LocalTime.now() , 7, 5); 

		
		m1.getAll();
		m2.getAll();
	}
	

}
