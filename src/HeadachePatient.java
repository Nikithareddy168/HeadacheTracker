import java.util.List;

public class HeadachePatient extends Patient <Headache,Medication>{
	
		public HeadachePatient(List<Headache>healthComposition, List<Medication>treatmentComposition) {
			super(healthComposition,treatmentComposition);
		}
		
		public void setHeadache(List<Headache> headache) {
			super.setHealthComposition(headache);
		}
		
		public void setMedication(List<Medication> medication){
			super.setTreatmentComposition(medication);
		}
}
