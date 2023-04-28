
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
	
	
}
