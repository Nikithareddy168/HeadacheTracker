import java.time.LocalTime;
import java.util.ArrayList;

//Driver class for headache tracker application
public class HeadacheApplication {
	public static void main(String[] args){
		Location lc = null;
		HeadacheType hd =null;
		Sidedness sd = null;
		ArrayList<Symptoms> plist = new ArrayList<Symptoms>();
		plist.add(new Symptoms ("nausea"));
		plist.add(new Symptoms ("light"));
		ArrayList<Symptoms> clist = new ArrayList<Symptoms>();
		clist.add(new Symptoms ("neck pain"));
		clist.add(new Symptoms ("sinus"));
		ArrayList<Symptoms> postList = new ArrayList<Symptoms>();
		postList.add(new Symptoms ("neck pain"));
		postList.add(new Symptoms ("sinus"));
		
		Treatment m1 = new Medication("MaxAlt", "triptan", 2.0, LocalTime.now() , 7, 5); 
		Treatment m2 = new Medication("Tylenol", "acetaminophen", 1.0, LocalTime.now() , 7, 5); 
		//Symptoms s1 = new Symptoms("")
	 Headache h1 = new Headache("05/07/17",3.5,7,lc.OCCULAR,sd.LEFT_SIDE,hd.MIGRAINE,plist, clist,postList);
		
		m1.getAll();
		m2.getAll();
		h1.getAll();
	}
	

}