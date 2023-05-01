
public class weapons extends equipment {
	public float physAttack;
	public float magAttack;
	public float fireAttack;
	public float bleeding;
	public float poison;
	public float plague;
	public float critStrike;
	
	public float damageRed;
	public String magFireRed;
	public float guardBreak;
	public float range;
	public float magAdjust;
	
	// -avgStats
	public float avgStats;

	public weapons(String Name, String Type, Float Dur, Float Weight) {
		name = Name;
		type = Type;
		Durability = Dur;
		weight = Weight;
	}

	
	public void updateStats(Float PhysAttack, Float MagAttack, Float FireAttack, Float Bleeding, Float Poison, 
			Float Plague, Float CritStrike, Float DamageRed, String MagFireRed, Float GuardBreak, Float Range, Float MagAdjust) {
		
		physAttack = PhysAttack;
		magAttack = MagAttack;
		fireAttack = FireAttack;
		bleeding = Bleeding;
		poison = Poison;
		plague = Plague;
		critStrike = CritStrike;
		damageRed = DamageRed;
		magFireRed = MagFireRed;
		guardBreak = GuardBreak;
		range = Range;
		magAdjust = MagAdjust;
		
		avgStats = (physAttack + magAttack + fireAttack + bleeding + poison + plague + critStrike + damageRed + guardBreak + range + magAdjust)/10;

	}
	
	public String toString() {
		String str = name + ": " + type;
		return str;
	}
	
	public String fullStats() {
		String str = name + ": " + type + "\n";
		str += "Durability: " + Durability + " Weight: " + weight + "\n";
		str +=  "Physical Attack Power: " + physAttack + "\n" + 
				"Magic Attack Power: " + magAttack + "\n" + 
				"Fire Attack Power: " + fireAttack + "\n" + 
				"Bleeding: " + bleeding + "\n" + 
				"Poison: " + poison + "\n" + 
				"Critical Strike: "  + critStrike + "\n" + 
				"Damage Reduction: " + damageRed + "\n" + 
				"Magic and Fire Reduction: " + magFireRed + "\n" + 
				"Guard Break Reduction " + guardBreak + "\n" + 
				"Range: " + range + "\n" + 
				"Magic Adjustment: " + magAdjust + "\n";
				
		return str;
	}
	
	
	
	
}
