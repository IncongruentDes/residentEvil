
public class armor extends equipment{
	String family;
	Float normalDefense;
	Float bluntDefense;
	Float slashDefense;
	Float bleedDefense;
	Float poisonDefense;
	Float plagueDefense;
	Float pierceDefense;
	Float magicDefense;
	Float fireDefense;
	String gender;
	
	
	
	
	
	
	
	public armor(String Name, String Type, Float durability, Float Weight) {
		name = Name;
		type = Type;
		Durability = durability;
		weight = Weight;
	}
	
	public void updateStats(String Set, Float NormalDefense, Float BluntDefense, Float SlashDefense, Float BleedDefense,
			Float PoisonDefense, Float PlagueDefense, Float PierceDefense, Float MagicDefense, Float FireDefense,
			String Gender) {
		
		family = Set;
		normalDefense = NormalDefense;
		bluntDefense = BluntDefense;
		slashDefense = SlashDefense;
		bleedDefense = BleedDefense;
		poisonDefense = PoisonDefense;
		plagueDefense = PlagueDefense;
		pierceDefense = PierceDefense;
		magicDefense = MagicDefense;
		fireDefense = FireDefense;
		gender = Gender;
				
	}
	
	public String fullStats() {
		String str = name + ": " + type + "\n";
		str += "Durability: " + Durability + ", Weight: " + weight + "\n";
		str += "family: " + family + "\n" +
				"Normal Defense: " + family + "\n" + 
				"Blunt Defense: " + bluntDefense + "\n" + 
				"Slash Defense: " + slashDefense + "\n" + 
				"Bleed Defense: " + bleedDefense + "\n" + 
				"Poison Defense: " + poisonDefense + "\n" + 
				"Plague Defense: " + plagueDefense + "\n" + 
				"Pierce Defense: " + pierceDefense + "\n" + 
				"Magic Defense: " + magicDefense + "\n" + 
				"Fire Defense: " + fireDefense + "\n" + 
				"Gender: " + gender + "\n";
		
				
		return str;
	}
	
	
	
	
}
