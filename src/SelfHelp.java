import java.time.LocalTime;

public class SelfHelp extends Treatment{

	private String method; 
	private Effectivity effectivity; 
	
	public SelfHelp(String treatmentName, LocalTime timeEffective,String method, Effectivity effectivity) {
		super(treatmentName); 
		this.method = method; 
		this.effectivity = effectivity; 
	}
	
	public void getAll(){
		System.out.println("Printing self help info");
		System.lineSeparator(); 
	}

}
