
public class Severity {
	private String painDescription; 
	private int severityNumber;
	
	public Severity(String painDescription, int severityNumber){
		this.painDescription = painDescription; 
		this.severityNumber = severityNumber; 
	}
	
	public String getPainDescription() {
		return painDescription;
	}
	
	public void setPainDescription(String painDescription) {
		this.painDescription = painDescription;
	}

	public int getSeverityNumber() {
		return severityNumber;
	}

	public void setSeverityNumber(int severityNumber) {
		this.severityNumber = severityNumber;
	} 
}
