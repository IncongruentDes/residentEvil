
public class rings extends equipment {
	
	String effect;
	String details;
	
	public rings(String Name, String Effect, String Details) {
		name = Name;
		effect = Effect;
		details = Details;
		
	}
	
	
	public String toString() {
		String str = name + ": " + effect;
		return str;
	}
	
	public String fullStats() {
		String str = name + ": " + effect + "\n";
		str += details + "\n";
		return str;
	}

}
