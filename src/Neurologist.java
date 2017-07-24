import java.util.List;

public class Neurologist implements HealthCareProfessional<HeadachePatient>{

	private List<HeadachePatient> patientList;
	
	public Neurologist(List<HeadachePatient> patientList) {
		this.patientList = patientList; 
	}

	@Override
	//Return the type of health care professional (e.g. Neurologist, Cardiologist, etc.)
	public String getName() {
		return this.getClass().getSimpleName(); 
	}

	@Override
	public List<HeadachePatient> getPatientList() {
		return patientList;
	}

}
