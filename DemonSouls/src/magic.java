// - Deal with magic separately, not as an equipment extension
public class magic extends equipment {
	public String alignment;
	public Float mpCost;
	public String duration;
	public Float slotCost;
	public String spellType;
	
	
	
	public magic(String Name, String Alignment, Float MPCost, String Duration, Float SlotCost, String SpellType ) {
		name = Name;
		alignment = Alignment;
		mpCost = MPCost;
		duration = Duration;
		slotCost = SlotCost;
		spellType = SpellType;
		
	}
	
	
	public String toString() {
		String str =  spellType + " (" + alignment + "):  " + name;
		return str;
	}
}
