import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class Patient {

	private List<Headache> headache;
	public Double totalDuration = 0.0;
	public float totalSeverity = 0;
	
	
	public Patient(List<Headache> headache) {
		this.headache = headache;
	}
	
	public void getHeadacheInfo(){
		List<Headache> hList = getHeadache(); 
		for(Headache h : hList){
			h.getAll();
			totalDuration += h.getDuration();
			totalSeverity += h.tseverity;
			
		}
	}
	
	public List<Headache> getHeadache() {
		return headache;
	}
	
	public void setHeadache(List<Headache> headache) {
		this.headache = headache;
	}
	public int getSize(){
	    return headache.size();
	}

}