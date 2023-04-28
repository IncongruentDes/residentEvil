
public class sheilds extends equipment{
	
	Float physicalAttack;
	Float magicAttack;
	Float fireAttack;
	Float piercing;
	Float physicalDefence;
	Float magicDefence;
	Float fireDefence;
	Float guardBreakReduction;

	public sheilds(String Name, String Type, Float Dur, Float Weight)
	{
		name = Name;
		type = Type;
		Durability = Dur;
		weight = Weight;
		
	}
	public void addStats(Float PhysicalAttack, Float MagicAttack, Float FireAttack, Float Piercing,
			Float PhysicalDefence, Float MagicDefence, Float FireDefence, Float GuardBreakReduction)
	{
		physicalAttack = PhysicalAttack;
		magicAttack = MagicAttack;
		fireAttack = FireAttack;
		piercing = Piercing;
		physicalDefence = PhysicalDefence;
		magicDefence = MagicDefence;
		fireDefence = FireDefence;
		guardBreakReduction = GuardBreakReduction;
		
	}
	
	
	
	public String toString() {
		String str = type + " Shield: " + name;
		return str;
	}
}
