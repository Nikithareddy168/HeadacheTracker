import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SelfHelp extends Treatment {
	private List<Effectivity> effectivity; 
	private List<String> selfHelpMethods; 
	
	public SelfHelp(String selfHelpMethod, LocalTime timeTaken, LocalTime timeEffective, Effectivity effectivity) {
		super(selfHelpMethod,timeTaken, timeEffective); 
		this.effectivity = new ArrayList<Effectivity>(); 
		this.selfHelpMethods = new ArrayList<String>(); 
		
		this.effectivity.add(effectivity); 
		this.selfHelpMethods.add(selfHelpMethod); 
	}
	
	public void addSelfHelp(String selfhelpMethod, Effectivity effectivity){
		this.effectivity.add(effectivity); 
		this.selfHelpMethods.add(selfhelpMethod); 
	}

	
	public List<Effectivity> getEffectivityList(){
		return effectivity; 
	}
	
	public List<String> getSelfHelpList(){
		return selfHelpMethods; 
	}
	
	public String toString(){
		List<Effectivity> effTemp = getEffectivityList(); 
		List<String> selfHelp = getSelfHelpList(); 
		StringBuilder selfHelpSummary = new StringBuilder(); 
		for(int i = 0; i < selfHelp.size(); i++){
			if(i!=0)
				selfHelpSummary.append("\t  " + selfHelp.get(i).toString() + " -> ");
			else
				selfHelpSummary.append(selfHelp.get(i) + " -> ");
			selfHelpSummary.append(effTemp.get(i).getEffectivity() + "\n"); 
		}
		return selfHelpSummary.toString();
	}


}
