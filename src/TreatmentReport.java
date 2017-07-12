import java.util.*;
public class TreatmentReport {
    List<Treatment> tList;
    
    public List<Treatment> getT(){
            return tList;
        }
    public void setT(List<Treatment> t){
        this.tList = t;
    }
        
   /* Medication m;
    
    public Medication getM(){
            return m;
        }
    public void setM(Treatment t){
        t = m;
    }
    */
        
    public void output(){
        System.out.println("\n\n\tPrinting med report: ");
        for(Treatment t : tList){
            System.out.println("Treatment: " + t.getTreatmentName()
            + "\n" + t.getTreatmentTimes());
                    
        /*System.out.println("Medication: " + t.getTreatmentName()
        + "\n" + t.getMedClass() + " class" + "\n" + t.getDoseTaken() + " mg" + "\n" +
                t.getTreatmentTimes());
                */
        System.lineSeparator(); 
        }
    }


}
