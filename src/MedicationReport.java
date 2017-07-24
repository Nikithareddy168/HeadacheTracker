import java.util.List;

public class MedicationReport implements Report{
	private List<Medication> medList; 
	private int frequency; 
	
	public MedicationReport(List<Medication>medList){
		this.medList = medList; 
	}

	@Override
	public String buildReport() {
		StringBuilder medReport = new StringBuilder(); 
		//medReport.append("Medication Report: "); 
		List<Medication>tempList = getMedList(); 
		for(Medication m : tempList){
			if(medReport.indexOf(m.getTreatmentName())<0){
				medReport.append("\n" + m.getTreatmentName() + "\n"); 
				medReport.append("Medication Class: "); 
				medReport.append(m.getMedClass() + "\n"); 
				medReport.append("Dose: "); 
				medReport.append(m.getDose() + "\n"); 
				medReport.append("Average Time to Effectivity (Hours): "); 
				medReport.append(getAverageEffectivity(m.getTreatmentName())+"\n");
				medReport.append("Total Dose Taken: "); 
				medReport.append(getFrequency() + "\n"); 
				//date range probably should be in interface since all reports need them
			}
		}
		return medReport.toString(); 
	}
	
	//Maybe make this a map? 
	private int getFrequency(){
		return frequency; 
	}
	
	private void setFrequency(int count){
		this.frequency = count; 
	}
	
	public double getAverageEffectivity(String treatmentName){
		double avgTimeEffective=0; 
		int count=0; 
		for(Medication m : medList){
			if(m.getTreatmentName().equals(treatmentName)){
				avgTimeEffective += m.getTimeToEffective(); 
				count++; 
			}
			
		}
		setFrequency(count); 
		return avgTimeEffective/count;
	}
		
	@Override
	public void printReport(String report) {
		System.out.println("\nDetailed Medication Report:");
		System.out.println("***************************");
		System.out.println(report);
		System.out.println("***************************");
	}

	public List<Medication> getMedList() {
		return medList;
	}
	
	public void setMedList(List<Medication>medList){
		this.medList = medList; 
	}
	
}
