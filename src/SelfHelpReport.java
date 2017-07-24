import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelfHelpReport implements Report{
	private List<SelfHelp> selfHelp;
	private int frequency; 
	
	public SelfHelpReport(List<SelfHelp>selfHelp){
		this.selfHelp = selfHelp; 
		frequency = 0; 
	}
	
	public void setSelfHelp(List<SelfHelp>selfHelp){
		this.selfHelp = selfHelp; 
	}
	
	public SelfHelpReport() {
		frequency = 0; 
	}

	public List<SelfHelp> getSelfHelp(){
		return selfHelp; 
	}
	
	public int getFrequency(){
		return frequency; 
	}
	
	public void setFrequency(int count){
		frequency = count; 
	}
	
	@Override
	public String buildReport() {
		StringBuilder shReport = new StringBuilder(); 
		List<SelfHelp> tempSH = getSelfHelp();  
		for(SelfHelp shList : tempSH){
			for(String shName : shList.getSelfHelpList()){
				if(shReport.indexOf(shName)<0){
					shReport.append(shName + "\n"); 
					shReport.append("Average Effectivity: "); 
					shReport.append(getAverageEffectivity(shName) + "\n"); 
					shReport.append("Times Used: ");
					shReport.append(getFrequency() + "\n"); 
				}
			}
		}
		return shReport.toString();
	}
	
	public String getAverageEffectivity(String treatmentName){
		List<SelfHelp> tempSH = getSelfHelp(); 
		Map<String,Integer> effMap = new HashMap<String, Integer>(); 
		int count = 0; 
		int effCount = 0; 
		int runningMax = 0; 
		String largest = ""; 
		for(SelfHelp shList : tempSH){
			for(int i = 0; i < shList.getSelfHelpList().size(); i++){
				if(shList.getSelfHelpList().get(i) == treatmentName){
					count++; 
					//String is combination of treatmentname and effectivity
					if(effMap.containsKey(treatmentName + shList.getEffectivityList().get(i).getEffectivity())){
						effCount = effMap.get(treatmentName + shList.getEffectivityList().get(i).getEffectivity());
						effMap.put(treatmentName + shList.getEffectivityList().get(i).getEffectivity(), effCount+1); 
						if(effCount+1 > runningMax){
							runningMax = effCount + 1; 
							largest = shList.getEffectivityList().get(i).getEffectivity(); 
						}
					}
					else{
						if(effMap.isEmpty()){
							largest = shList.getEffectivityList().get(i).getEffectivity(); 
						}
						effMap.put(treatmentName + shList.getEffectivityList().get(i).getEffectivity(),1);
						runningMax = 1; 
					}
				}
			}
		}
		setFrequency(count); 
		
		return largest;
	}
	
/*
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
	}*/

	@Override
	public void printReport(String report) {
		System.out.println("\nDetailed Selfhelp Report:");
		System.out.println("***************************");
		System.out.println(report);
		System.out.println("***************************");
	}

}
