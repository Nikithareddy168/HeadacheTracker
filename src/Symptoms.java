
public class Symptoms {
	String symptom;
	//HashMap <String,Integer> symptomePhase = new HashMap<String, Integer>();
	public Symptoms(String symptom) {
		
		this.symptom = symptom;
	}
	public String getSymp(){
		System.out.println("symptom============================="+symptom);
		return symptom;
	}
}
