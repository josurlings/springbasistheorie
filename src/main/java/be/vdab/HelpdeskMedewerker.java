package be.vdab;


import java.util.Map;

public class HelpdeskMedewerker
{

	// private String[] namen; 
	
	//private List<String> namen;
	
	// private Set<String> namen;
	
	// private final Map<String, Integer> medewerkers;
	
	private final Map<String, String> medewerkers;
	
	// key = naam medewerker, value=intern telefoonnummer
	HelpdeskMedewerker(Map<String, String> medewerkers) 
	{
		this.medewerkers = medewerkers;
	}
	
	
	@Override
	public String toString()
	{
		// return Arrays.toString(namen);
		// return namen.toString();
		return medewerkers.toString();
	}
	
	
	// public void setNamen(List<String> namen) 
	/*
	public void setNamen(Set<String> namen) 
	{
		this.namen = namen;
	}
	*/
	
	
}
