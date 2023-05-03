
public class achievement {
	public String name;
	public Boolean status;
	public String requirements;
	String game;
	
	
	public achievement(String Name, Boolean Status, String Req, String Game) {
		name = Name;
		status = Status;
		requirements = Req;
		game = Game;
	}
	
	public String toString() {
		String str = name + ": " + requirements + " (" + game + ")";
		
		return str;
	}
}
