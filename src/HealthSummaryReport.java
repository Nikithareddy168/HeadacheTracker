import java.time.LocalDate;
import java.util.List;

public class HealthSummaryReport implements Report{
	private List<Headache> headacheList;  
	private LocalDate startDate;
	private LocalDate endDate; 
	private double averageDuration; 
	private double averageSeverity; 
	
	public HealthSummaryReport(List<Headache> headacheList){
		this.headacheList = headacheList; 
	}

	@Override
	//Start, end, headache count, average severity, duration
	public String buildReport() {
		//Assume headaches are placed in order
		//Eventually we need a function that gets min/max date
		setHeadacheInfo(); 
		StringBuilder hsReport = new StringBuilder(); 
		hsReport.append("\nReport Start Date: "); 
		hsReport.append(getStartDate().toString() + "\n"); 
		hsReport.append("Report End Date: "); 
		hsReport.append(getEndDate().toString() + "\n"); 
		hsReport.append("Headache Count: "); 
		hsReport.append(getHeadacheList().size() + "\n"); 
		hsReport.append("Average Severty: "); 
		hsReport.append(getAverageSeverity() + "\n"); 
		hsReport.append("Average Duration (hours): "); 
		hsReport.append(getAverageDuration() + "\n"); 
		return hsReport.toString(); 
	}
	
	public double getAverageSeverity(){
		return averageSeverity; 
	}
	
	public double getAverageDuration(){
		return averageDuration; 
	}
	
	public LocalDate getEndDate(){
		return endDate; 
	}
	
	public LocalDate getStartDate(){
		return startDate; 
	}
	
	public void setHeadacheInfo(){
		List<Headache>temp = getHeadacheList();
		double averageSeverity = 0; 
		double averageDuration = 0; 
		for(int i = 0; i < temp.size(); i++){
			if(startDate == null){
				startDate = temp.get(i).getDate(); 
				endDate = startDate; 
			}
			else if(temp.get(i).getDate().isAfter(endDate)){
				endDate = temp.get(i).getDate(); 
			}
			else if(temp.get(i).getDate().isBefore(startDate)){
				startDate = temp.get(i).getDate(); 
			}
			
			averageSeverity += temp.get(i).getSeverity().getSeverityNumber(); 
			averageDuration += temp.get(i).getHeadacheDuration(); 
		}
		this.averageDuration = averageDuration/temp.size(); 
		this.averageSeverity = averageSeverity/temp.size(); 
	}

	@Override
	public void printReport(String report) {
		System.out.println("\nHealth Summary Report:");
		System.out.println("***************************");
		System.out.println(report);
		System.out.println("***************************");
	}

	public List<Headache> getHeadacheList() {
		return headacheList;
	}

	public void setHeadacheList(List<Headache> headacheList) {
		this.headacheList = headacheList;
	}

}
