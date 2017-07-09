import java.util.*;


public class Symptom implements Report{
	private List<String> symptoms; 
	
	public void addSymptom(String s){
		this.symptoms.add(s); 
	}
	
	public void addSymptom(DefaultSymptom s){
		this.symptoms.add(toString(s)); 
	}
	
	public void addSymptom(List<String> s){
		this.symptoms.addAll(s); 
	}

	public Symptom(String s) {
		this.symptoms = new ArrayList<String>(); 
		this.symptoms.add(s); 
	} 
	
	public Symptom(DefaultSymptom s){
		this.symptoms = new ArrayList<String>(); 
		this.symptoms.add(toString(s)); 
	}
	
	public Symptom(List<String> s) {
		this.symptoms = new ArrayList<String>(); 
		this.symptoms.addAll(s); 
	}

	@Override
	public void getAll() {
		System.lineSeparator(); 
		for(int i = 0; i < symptoms.size(); i++){
			System.out.print(symptoms.get(i));
			if(i != symptoms.size()-1)
				System.out.print(", ");
		}
		System.lineSeparator(); 
	} 
	
	public String toString(DefaultSymptom s){
		if(s == DefaultSymptom.Aura)
			return "Aura"; 
		else if(s == DefaultSymptom.Nausea)
			return "Nausea"; 
		else if(s == DefaultSymptom.Vomiting)
			return "Vomiting"; 
		else if(s == DefaultSymptom.LightSensitivity)
			return "Light Sensitivity"; 
		else if(s == DefaultSymptom.SmellSensitivity)
			return "Smell Sensitivity"; 
		else if(s == DefaultSymptom.VisionDisturbances)
			return "Vision Disturbances"; 
		else if(s == DefaultSymptom.Tearing)
			return "Tearing"; 
		else if(s == DefaultSymptom.RednessOfEyes)
			return "Redness of Eyes"; 
		else if(s == DefaultSymptom.SinusCongestion)
			return "Sinus congestion"; 
		else if(s == DefaultSymptom.NeckPain)
			return "Neck pain"; 
		else
			return "N/A"; 
	}

}
