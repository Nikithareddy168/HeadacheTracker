import java.util.List;

public abstract class Patient<T> {
	
	protected List <T> healthComposition; 
	
	public Patient(List<T> healthComposition) {
		this.healthComposition = healthComposition; 
	}
	
	public List<T> getHealthComposition() {
		return healthComposition;
	}
	
	public void setHealthComposition(List<T> healthComposition){
		this.healthComposition = healthComposition; 
	}
}