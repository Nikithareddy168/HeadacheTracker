
public enum Effectivity {
	HELPED_A_LOT, HELPED_A_LITTLE, DID_NOT_HELP, MADE_IT_WORSE; 
	
	public String toString(Effectivity e){
		if(e == Effectivity.DID_NOT_HELP)
			return "Did not help";
		else if (e == Effectivity.HELPED_A_LITTLE)
			return "Helped a little"; 
		else if (e == Effectivity.HELPED_A_LOT)
			return "Helped a lot"; 
		else if (e == Effectivity.MADE_IT_WORSE)
			return "Made it worse"; 
		else
			return "N/A"; 
	}
}
