import java.time.format.DateTimeFormatter;
import java.util.*;

public class TriggerReport {
    
    Map<Trigger, String> trig;
    
    public Map<Trigger, String> getTList() {
        return trig;
    }

    public void setTList(Map<Trigger, String> trig) {
        this.trig = trig;
    }

    public void output(){
        System.out.println("\tGetting Trigger info..");

        for(Trigger tr : trig.keySet()){
            //System.out.println(tr.toString());
            System.out.print(tr.getTrigger());
            System.out.print(" : ");
            System.out.print(trig.get(tr) + "\n");
        }
        
        
        
       
        }
    

}
