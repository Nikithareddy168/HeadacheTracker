import java.util.List;
import java.util.Map;

public class ReportAdapter implements Report {
    MedReport mr = new MedReport();
    TreatmentReport tr = new TreatmentReport();
    HeadacheReport hr = new HeadacheReport();
    TriggerReport trigr = new TriggerReport();
    
    public void setHeadacheList(List<Headache> hList){
        hr.setH(hList);
    }
    
    public void setTreatmentList(List<Treatment> t){
        tr.setT(t);
    }
    
    public void setMedicationInstance(Medication m){
        mr.setM(m);
    }
    public void setTriggerList(Map<Trigger, String> tList){
        trigr.setTList(tList);
    }
    


    @Override
    public void getAll() {
        hr.output();
        trigr.output();
        tr.output();
      
        
    }

}
