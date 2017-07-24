import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Trigger {
    private List<String> triggersList;
    
    public void addTrigger(String t){
        this.triggersList.add(t); 
    }
    
    public void addTrigger(DefaultTrigger t){
        this.triggersList.add(defaulToString(t)); 
    }
    public Trigger(String t) {
        this.triggersList = new ArrayList<String>(); 
        this.triggersList.add(t); 
    } 

    public Trigger(DefaultTrigger t){
        this.triggersList = new ArrayList<String>(); 
        this.triggersList.add(defaulToString(t)); 
    }
    
    /*
    public String toString(){
		StringBuilder triggerSummary = new StringBuilder(); 
		for(int i = 0; i < triggersList.size(); i++){
			locationSummary.append(getLocationType(i)); 
			locationSummary.append("/"); 
			locationSummary.append(getSidednessType(i)); 
			if(i != locationType.size()-1)
				locationSummary.append(", "); 
			else
				locationSummary.append(" "); 
		}
		return locationSummary.toString();
	}*/
    
    public String toString(){
    	StringBuilder triggerSummary = new StringBuilder(); 
    	for(int i = 0; i < triggersList.size(); i++){
    		triggerSummary.append(triggersList.get(i)); 
    		if(i != triggersList.size()-1){
    			triggerSummary.append(", "); 
    		}
    	}
		return triggerSummary.toString();
    }

        
    public String defaulToString(DefaultTrigger t){
        if(t == DefaultTrigger.sleepCycleChanges)
            return "Sleep Cycle Changes"; 
        else if(t == DefaultTrigger.Scents)
            return "Scents"; 
        else if(t == DefaultTrigger.Lighting)
            return "Lighting"; 
        else if(t == DefaultTrigger.Sound)
            return "Sound"; 
        else if(t == DefaultTrigger.CertainFoods)
            return "Certain Foods"; 
        else if(t == DefaultTrigger.FoodAdditives)
            return "Food Additives"; 
        else if(t == DefaultTrigger.MissedMeals)
            return "Missed Meals"; 
        else if(t == DefaultTrigger.Alcohol)
            return "Alcohol"; 
        else if(t == DefaultTrigger.Caffeine)
            return "Caffiene"; 
        else if(t == DefaultTrigger.Weather)
            return "Weather"; 
        else if(t == DefaultTrigger.Stress)
            return "Stress";
        else
            return "N/A"; 
    }

}
