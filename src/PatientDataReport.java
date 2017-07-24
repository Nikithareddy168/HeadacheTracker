import java.time.format.DateTimeFormatter;
import java.util.List;

public class PatientDataReport implements Report{
	DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm a");
	List<Headache> headacheList; 
	
	public PatientDataReport(List<Headache>headacheList){
		this.headacheList = headacheList; 
	}
	
	public List<Headache> getHeadacheList(){
		return headacheList; 
	}
	
	@Override
	public String buildReport() {
		// TODO Auto-generated method stub
		List<Headache>tempHL = getHeadacheList(); 
		StringBuilder pdReport = new StringBuilder(); 
		for(int i = 0; i < headacheList.size(); i++){
			Headache tempH = tempHL.get(i); 
			pdReport.append("\nDate: "); 
			pdReport.append(tempH.getDate().toString()+"\n"); 
			pdReport.append("Start Time: "); 
			pdReport.append(df.format(tempH.getStartTime()).toString()+"\n"); 
			pdReport.append("End Time: "); 
			pdReport.append(df.format(tempH.getEndTime()).toString() + "\n"); 
			pdReport.append("Type: "); 
			pdReport.append(tempH.getHeadacheType().toString() + "\n"); 
			pdReport.append("Severity: "); 
			pdReport.append(tempH.getSeverity().getSeverityNumber() + "\n"); 
			pdReport.append("Pain Description: "); 
			pdReport.append(tempH.getSeverity().getPainDescription()+ "\n"); 
			pdReport.append("Location: "); 
			pdReport.append(tempH.getLocation().toString() + "\n"); 
			pdReport.append("Symptoms: "); 
			pdReport.append(tempH.getPhase().toString());
			pdReport.append("Medication: "); 
			Medication tempM = tempH.getMed(); 
			pdReport.append(tempM.getTreatmentName() + ", "); 
			pdReport.append(tempM.getMedClass() + ", "); 
			pdReport.append(tempM.getDose() + "\n"); 
			pdReport.append("Medication Start: "); 
			pdReport.append(df.format(tempM.getTimeTaken()) + "\n"); 
			pdReport.append("Medication Effective: "); 
			pdReport.append(df.format(tempM.getTimeEffective()) + "\n"); 
			pdReport.append("Triggers: "); 
			pdReport.append(tempH.getTrigger().toString() + "\n"); 
		}
		return pdReport.toString();
	}

	@Override
	public void printReport(String report) {
		System.out.println("\nPatient Data Report:");
		System.out.println("***************************");
		System.out.println(report);
		System.out.println("***************************");
	}

}
