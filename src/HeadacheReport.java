
import java.time.format.DateTimeFormatter;
import java.util.List;



public class HeadacheReport {
    List<Headache> hList;
    
    public List<Headache> getH() {
        return hList;
    }

    public void setH(List<Headache> hList) {
        this.hList = hList;
    }

    public void output(){
        System.out.println("\n\n\tHeadache report: ");
        for(Headache h: hList){
        System.out.print("\n\nDate " + h.getDate().format(DateTimeFormatter.ofPattern("MM-dd-yy")) + 
                "\nStart time: " + h.getStartTime().format(DateTimeFormatter.ofPattern("hh:mm a")) + 
                "\nEnd time: " + h.getEndTime().format(DateTimeFormatter.ofPattern("hh:mm a")) + "\nDuration: " + h.getDuration()
                + "\nHeadache Type: " + h.getHeadacheType() + "\nSeverity: " + h.getSeverity() + "\nSidedness: " + h.getSidedness() + "\nPain Location(s): " + h.getPainLocation() + "\n\n");
        }
    }

}
