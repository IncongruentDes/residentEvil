
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

	}
	
	public String toString() {
		String str = name + ": " + type;
		return str;
	}
	
	public String fullStats() {
		String str = name + ": " + type + "\n";
		str += physAttack + " " + magAttack + " " + fireAttack + " " + bleeding + " " + poison + " " + 
		plague + " " + critStrike + " " + damageRed + " " + magFireRed + " " + guardBreak + " " + range + " " + magAdjust;
		return str;
	}
	
}
