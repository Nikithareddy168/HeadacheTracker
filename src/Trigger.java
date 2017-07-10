import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class Trigger implements Report {
    private List<String> triggersList;
    Map<Trigger,String> Trigger;
    public void addTrigger(String t){
        this.triggersList.add(t); 
    }
    
    public void addTrigger(DefaultTrigger t){
        this.triggersList.add(toString(t)); 
    }
    public Trigger(String t) {
        this.triggersList = new ArrayList<String>(); 
        this.triggersList.add(t); 
    } 

    public Trigger(DefaultTrigger t){
        this.triggersList = new ArrayList<String>(); 
        this.triggersList.add(toString(t)); 
    }
    
    public void getAll() {
        System.lineSeparator(); 
        for(int i = 0; i < triggersList.size(); i++){
            System.out.print(triggersList.get(i));
            if(i != triggersList.size()-1)
                System.out.print("\n");
        }
        System.lineSeparator(); 
    } 
        
    public String toString(DefaultTrigger t){
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
