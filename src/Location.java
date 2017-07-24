import java.util.ArrayList;
import java.util.List;

public class Location {

	private List<SidednessType> sidednessType; 
	private List<LocationType> locationType; 
	
	public Location(LocationType locationType, SidednessType sidednessType){
		this.sidednessType = new ArrayList<SidednessType>(); 
		this.locationType = new ArrayList <LocationType>(); 
		
		this.locationType.add(locationType); 
		this.sidednessType.add(sidednessType);  
	}
	
	public SidednessType getSidednessType(int index){
		return sidednessType.get(index); 
	}
	
	public LocationType getLocationType(int index){
		return locationType.get(index); 
	}
	
	public String toString(){
		StringBuilder locationSummary = new StringBuilder(); 
		for(int i = 0; i < locationType.size(); i++){
			locationSummary.append(getLocationType(i)); 
			locationSummary.append("/"); 
			locationSummary.append(getSidednessType(i)); 
			if(i != locationType.size()-1)
				locationSummary.append(", "); 
			else
				locationSummary.append(" "); 
		}
		return locationSummary.toString();
	}

	public void add(LocationType locationType, SidednessType sidednessType) {
		this.locationType.add(locationType); 
		this.sidednessType.add(sidednessType);  
	}
}
