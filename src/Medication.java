import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Medication extends Treatment{
	ArrayList<String> medctn = new ArrayList();
	int doseCount = 0;
	double avgHours = 0.0;
	String medName;
	String medClass;
	double doseTaken;
	String timeTaken;
	String timeEffective;
	int initialPain;
	int finalPain;
	public Medication(String medName, String medClass, double doseTaken, String timeTaken, String timeEffective,
			int initialPain, int finalPain) throws ParseException {
		super();
		this.medName = medName;
		this.medClass = medClass;
		this.doseTaken = doseTaken;
		this.timeTaken = timeTaken;
		this.timeEffective = timeEffective;
		this.initialPain = initialPain;
		this.finalPain = finalPain;
		getAll();
	}
	public String getAll() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
		Date tmTaken = sdf.parse(timeTaken);
		Date tmEff = sdf.parse(timeEffective);
		String result = medName +","+medClass+","+doseTaken+","+tmTaken+","+tmEff+","+initialPain+","+finalPain;
		medctn.add(result);
	
		for(int i=0; i< medctn.size();i++){
			String parsing1 = medctn.get(i);
			String[] parsing2 = parsing1.split(",");
			//if()
			
		}
		return result;
	}
	
}
