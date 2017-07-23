import java.util.List;

public interface HealthCareProfessional<T> {
	String getName(); 
	List<T> getPatientList(); 
}
