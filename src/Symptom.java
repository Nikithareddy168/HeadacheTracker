
public class Symptom {
	String symptom;
	Phase phase; 

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public Symptom(String symptom, Phase phase) {
		this.symptom = symptom;
		this.phase = phase; 
	} 
}
