import java.util.List;

public class HeadachePatient extends Patient <Headache>{
	
		public HeadachePatient(List<Headache>healthComposition) {
			super(healthComposition);
		}
		public Double totalDuration = 0.0;
		public float totalSeverity = 0;
	
		
		public List<Headache> getHeadache() {
			return super.getHealthComposition(); 
		}
		
		public void setHeadache(List<Headache> headache) {
			super.setHealthComposition(headache);
		}
		public int getSize(){
		    return super.getHealthComposition().size(); 
		}
}
