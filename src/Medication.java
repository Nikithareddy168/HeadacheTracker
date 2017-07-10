import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MINUTES;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Medication extends Treatment {

	private String medClass; 
	private double doseTaken; 
	private int initialPain; 
	private int finalPain; 
	private int medcount;
	private String medStr;
	private double timeCnt=0;
	static Map<String,String> medSummaryValues = new HashMap<String,String>();
	static ArrayList<String> medctn = new ArrayList<String>();
	static ArrayList<String> medicnName = new ArrayList<String>(); 
	static HashMap <String,String> medicinedose = new HashMap<String, String>();
	static String result1;
	static String parsing1;
	static int doseCount = 0;
	static int medCount = 0;
	
	public Medication(String medicationName, String medClass, double doseTaken, LocalTime timeTaken, LocalTime timeEffective,int initialPain, int finalPain) {
		super(medicationName, timeTaken, timeEffective); 
		this.medClass = medClass; 
		this.doseTaken = doseTaken; 
		this.initialPain = initialPain; 
		this.finalPain = finalPain; 
	
		// Implementation for med summary report
		if(medicnName.isEmpty()){
			medicnName.add(medicationName);
		}
		for(int a= 0; a< medicnName.size();a++){
			if(medicnName.get(a).equalsIgnoreCase(medicationName)){
				medCount++;
			}
		}
		if(medCount == 0){
			medicnName.add(medicationName);
			}
		medCount=0;
		timeCnt = timeTaken.until(timeEffective, MINUTES);
		timeCnt=timeCnt/60;
		String result = medicationName +","+medClass+","+doseTaken+","+Double.toString(timeCnt);
		timeCnt=0;
		medctn.add(result);
		for(int i=0; i< medicnName.size();i++){
			parsing1 = medicnName.get(i);
			for (int j=0;j<medctn.size();j++){
			
				String parse1 = medctn.get(j);
				String parse2[] = parse1.split(",");
				if(parsing1.equalsIgnoreCase(parse2[0])){
					timeCnt = timeCnt+ Double.parseDouble(parse2[3]);
					doseTaken = Double.parseDouble(parse2[2]);
					medClass = parse2[1];
					doseCount++;				
				}
				
			}
			timeCnt = timeCnt/doseCount;
			String result1 = " "+medClass+"        "+Double.toString(doseTaken)+" mg      "+Double.toString(timeCnt)+"                "+Integer.toString(doseCount);
			medicinedose.put(parsing1, result1);
			result1 = "The dose count for "+ parsing1 + "is "+result1;
			doseCount =0 ;
			
		}
	
	}
	
	@Override
	public void getAll() {
		 
		System.out.println("Medication: " + super.getTreatmentName()
		+ "\n" + getMedClass() + " " + "\n" + getDoseTaken() + " mg" + "\n" +
				getTreatmentTimes());
		System.lineSeparator(); 
	}
	

	public String getMedClass() {
		return medClass;
	}

	public void setMedClass(String medClass) {
		this.medClass = medClass;
	}

	public double getDoseTaken() {
		return doseTaken;
	}

	public void setDoseTaken(double doseTaken) {
		this.doseTaken = doseTaken;
	}

	public int getInitialPain() {
		return initialPain;
	}

	public void setInitialPain(int initialPain) {
		this.initialPain = initialPain;
	}

	public int getFinalPain() {
		return finalPain;
	}

	public void setFinalPain(int finalPain) {
		this.finalPain = finalPain;
	}

	public static Map<String, String> getMedSymmary() {
		System.out.println("<< Detailed report for Medication >>");
		System.out.println("===========================================================================================");
		System.out.println("Medication      Class             Dose       Avg. Severity in Hours   Total doses taken");
		System.out.println("===========================================================================================");
	    for (String key : medicinedose.keySet()){
			System.out.println(" " + key + "      " + medicinedose.get(key));
		}
	    return medSummaryValues;
	}
}
