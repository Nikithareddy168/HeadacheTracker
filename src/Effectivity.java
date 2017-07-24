
public class Effectivity {
	private String effectivity;  
	
	Effectivity(String effectivity){
		this.setEffectivity(effectivity); 
	}
	
	Effectivity(EffectivityType effectivity){
		this.setEffectivity((defaultToString(effectivity))); 
	}
	
	public String defaultToString(EffectivityType e){
		if(e == EffectivityType.DID_NOT_HELP)
			return "Did not help";
		else if (e == EffectivityType.HELPED_A_LITTLE)
			return "Helped a little"; 
		else if (e == EffectivityType.HELPED_A_LOT)
			return "Helped a lot"; 
		else if (e == EffectivityType.MADE_IT_WORSE)
			return "Made it worse"; 
		else
			return "N/A"; 
	}

	public String getEffectivity() {
		return effectivity;
	}

	public void setEffectivity(String effectivity) {
		this.effectivity = effectivity;
	}
}
