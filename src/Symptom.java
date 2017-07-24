import java.util.*;


public class Symptom{
	private List<String> symptoms; 
		
	public String getSymptom(int index){
		return symptoms.get(index); 
	}
	
	public List<String> getSymptomList(){
		return symptoms; 
	}

	public String toString(){
		List<String>temp = getSymptomList();
		StringBuilder symptomSummary = new StringBuilder(); 
		for(int i = 0; i < temp.size(); i++){
			symptomSummary.append(temp.get(i)); 
			if(i != temp.size()-1)
				symptomSummary.append(", "); 
		}
		return symptomSummary.toString(); 
	}
	
	public void addSymptom(String s){
		this.symptoms.add(s); 
	}
	
	public void addSymptom(DefaultSymptom s){
		this.symptoms.add(defaultToString(s)); 
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
		this.symptoms.add(defaultToString(s)); 
	}
	
	public Symptom(List<String> s) {
		this.symptoms = new ArrayList<String>(); 
		this.symptoms.addAll(s); 
	}
	
	//Need to do this for every enum :(
	public String defaultToString(DefaultSymptom s){
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
