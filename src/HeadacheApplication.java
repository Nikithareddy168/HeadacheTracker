import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

//Driver class for headache tracker application
public class HeadacheApplication {

	public HeadacheApplication() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String args[])throws IOException, ParseException{
		Date dt = new Date();
		Location lc = null;
		Sidedness sd = null;
		HeadacheType hed = null;
		Headache hd = new Headache("05/01/17", 3.5, 7, lc.FRONTAL, sd.BILATERAL,hed.CLUSTER);
		System.out.println("The reports for the patient are"+ hd.getAll());
		
		Medication med = new Medication("Maxalt", "Triptan", 5, "9:00 AM","11:00 AM", 9,2);
		System.out.println("The reports for the patient are"+ med.getAll());
	}

}
