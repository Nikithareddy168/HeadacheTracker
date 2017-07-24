import java.util.ArrayList;
import java.util.List;

public class Phase {
	List<PhaseType> phaseType; 
	List<Symptom> symptomList; 
	
	public Phase(PhaseType phaseType, Symptom symptom){
		this.phaseType = new ArrayList<PhaseType>(); 
		this.symptomList = new ArrayList<Symptom>(); 
		this.phaseType.add(phaseType); 
		this.symptomList.add(symptom); 
	}
	
	public void addPhase(PhaseType phaseType, Symptom symptom){
		this.phaseType.add(phaseType); 
		this.symptomList.add(symptom); 
	}
	
	public PhaseType getPhaseType(int index){
		return phaseType.get(index);
	}
	
	public Symptom getSymptom(int index){
		return symptomList.get(index); 
	}
	
	public List<Symptom> getSymptomList(){
		return symptomList; 
	}
	
	public List<PhaseType> getPhaseTypeList(){
		return phaseType; 
	}
	
	public String toString(){
		List<PhaseType> tempPL = getPhaseTypeList(); 
		List<Symptom> tempSL = getSymptomList(); 
		StringBuilder symptomSummary = new StringBuilder(); 
		for(int i = 0; i < phaseType.size(); i++){
			if(i!=0)
				symptomSummary.append("\t  " + tempPL.get(i).toString() + " - ");
			else
				symptomSummary.append(tempPL.get(i).toString() + " - ");
			symptomSummary.append(tempSL.get(i).toString() + "\n"); 
		}
		return symptomSummary.toString();
	}
}
