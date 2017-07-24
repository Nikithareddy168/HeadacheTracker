import java.util.List;

public abstract class Patient<T,G> {
	
	protected List <T> healthComposition; 
	protected List <G> treatmentComposition; 
	
	public Patient(List<T> healthComposition, List<G> treatmentComposition) {
		this.treatmentComposition = treatmentComposition; 
		this.healthComposition = healthComposition; 
	}
	
	public List<T> getHealthComposition() {
		return healthComposition;
	}
	
	public void setHealthComposition(List<T> healthComposition){
		this.healthComposition = healthComposition; 
	}
	
	public List<G> getTreatmentComposition(){
		return treatmentComposition; 
	}
	
	public void setTreatmentComposition(List<G> treatmentComposition){
		this.treatmentComposition = treatmentComposition; 
	}
}