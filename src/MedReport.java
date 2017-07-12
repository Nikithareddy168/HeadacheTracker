
public class MedReport {
    
   Medication m;
        
    public Medication getM(){
            return m;
        }
    public void setM(Medication m2){
        this.m = m2;
    }
        
    public void output(){
        System.out.println("Printing med report: ");
        System.out.println("Medication: " + m.getTreatmentName()
        + "\n" + m.getMedClass() + " class" + "\n" + m.getDoseTaken() + " mg" + "\n" +
                m.getTreatmentTimes());
        System.lineSeparator(); 
    }
    

}
