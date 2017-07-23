import java.util.List;

public class Neurologist implements HealthCareProfessional<HealthComposite>{

	private List<HealthComposite> patientList;
	
	public Neurologist(List<HealthComposite> patientList) {
		this.patientList = patientList; 
	}

	@Override
	//Return the type of health care professional (e.g. Neurologist, Cardiologist, etc.)
	public String getName() {
		return this.getClass().getSimpleName(); 
	}

	@Override
	public List<HealthComposite> getPatientList() {
		return patientList;
	}

}
