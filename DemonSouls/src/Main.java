
// - final test. 12.26
// - final test part II - 12.27

//- import sections

import java.io.*;  
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<weapons> weaponList = weaponSet();
		ArrayList<armor> armorList = armorSet();
		ArrayList<sheilds> sheildList = sheildSet();
		ArrayList<rings> ringList = ringSet();
		
		ArrayList<magic> magicSet = magicSet();
		
		ArrayList<equipment> fullset = combineEquipment(armorList, 
				sheildList, weaponList, ringList);
		
		forLoops(fullset);

	}
	
	
	// - function to read in file
	public static ArrayList<String> fileReader(String file) {
		ArrayList<String> lines = new ArrayList<String>();
		
		
		// - Reading in file
		try {
			Scanner scanner = new Scanner(new File(file));

			while (scanner.hasNextLine()) {
			//	System.out.println(scanner.nextLine());
				lines.add(scanner.nextLine());
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return lines;
	}
	
	public static ArrayList<weapons> weaponSet() {
		// - pulling lines
		ArrayList<String> lines = fileReader("weapons.txt");
		// - setting up weapon arraylist
		ArrayList<weapons> weapons = new ArrayList<weapons>();

		for (int x = 0; x < lines.size(); x++) {
			// - pulling current line
			String curLine = lines.get(x);
			String[] split = lineSets(curLine);
			
			// - weapon object creation
			weapons curWeapon = new weapons(split[0], split[1], Float.parseFloat(split[9]), Float.parseFloat(split[10]));
			curWeapon.updateStats(Float.parseFloat(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]),
					Float.parseFloat(split[5]), Float.parseFloat(split[6]), Float.parseFloat(split[7]), Float.parseFloat(split[8]), 
					Float.parseFloat(split[11]),(split[12]), Float.parseFloat(split[13]), Float.parseFloat(split[14]),
					Float.parseFloat(split[15]));
			
			weapons.add(curWeapon);
		}
		return weapons;
	}
	
	
	public static ArrayList<armor> armorSet() {
		// - pulling lines
		ArrayList<String> lines = fileReader("armor.txt");
		
		// - Setting up Array
		ArrayList<armor> armorSets = new ArrayList<armor>();
		
		for (int x = 0; x < lines.size(); x++) {
			// - pulling current line
			String curLine = lines.get(x);
			String[] split = lineSets(curLine);
			
			
			armor curArmor = new armor(split[0], split[14], Float.parseFloat(split[12]), Float.parseFloat(split[11]));
			curArmor.updateStats(split[1], Float.parseFloat(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]),
					Float.parseFloat(split[5]), Float.parseFloat(split[6]), Float.parseFloat(split[7]), Float.parseFloat(split[8]),
					Float.parseFloat(split[9]), Float.parseFloat(split[10]), split[13]);
			
			
			armorSets.add(curArmor);
		}
		return armorSets;
		
		
		
	}
	
	public static ArrayList<sheilds> sheildSet() {
		// - pulling lines
		ArrayList<String> lines = fileReader("sheilds.txt");
		
		//- setting up Sheild Array
		ArrayList<sheilds> shieldSets = new ArrayList<sheilds>();
		
		for (int x = 0; x < lines.size(); x++) {
			// - pulling current line
			String curLine = lines.get(x);
			String[] split = lineSets(curLine);
			
			
			sheilds curSheild = new sheilds(split[0], split[1], Float.parseFloat(split[5]), Float.parseFloat(split[7]));
			curSheild.addStats(Float.parseFloat(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[6]),
					Float.parseFloat(split[8]), Float.parseFloat(split[9]), Float.parseFloat(split[10]), Float.parseFloat(split[11]));
			
			
			shieldSets.add(curSheild);
		}
		return shieldSets;
		
	}
	
	public static ArrayList<rings> ringSet() {
		// - pulling lines
		ArrayList<String> lines = fileReader("rings.txt");
		
		//- setting up Ring Array
		ArrayList<rings> ringSets = new ArrayList<rings>();
		
		for (int x = 0; x < lines.size(); x++) {
			// - pulling current line
			String curLine = lines.get(x);
			String[] split = lineSets(curLine);
			
			
			rings curRing = new rings(split[0], split[1], split[2]);
			ringSets.add(curRing);
		}
		
		return ringSets;
		
	}
	
	public static ArrayList<magic> magicSet(){
		// - pulling lines
		ArrayList<String> lines = fileReader("magic.txt");
		
		//- setting up Ring Array
		ArrayList<magic> magicSet = new ArrayList<magic>();
		
		
		for (int x = 0; x < lines.size(); x++) {
			// - pulling current line
			String curLine = lines.get(x);
			String[] split = lineSets(curLine);
			
			magic curMagic = new magic(split[0], split[1], Float.parseFloat(split[2]), (split[3]), Float.parseFloat(split[4]), split[5]);
			magicSet.add(curMagic);
			
		}	
		return magicSet;
		
		
	}
	
	public static ArrayList<equipment> combineEquipment(ArrayList<armor> armorList,
	        ArrayList<sheilds> sheildList, ArrayList<weapons> weaponList, ArrayList<rings> ringList) {
	    ArrayList<equipment> fullSet = new ArrayList<equipment>();

	    for (armor x : armorList) {
	    	fullSet.add(x);
	    }
	    for (sheilds x : sheildList) {
	    	fullSet.add(x);
	    }
	    for (weapons x : weaponList) {
	    	fullSet.add(x);
	    }
	    for (rings x : ringList) {
	    	fullSet.add(x);
	    }
	    return fullSet;
	}
	
	//- clean up data function
	public static String[] lineSets(String line) {
		String[] split =  line.split("@");
		for (int y = 0; y < split.length; y++) {
			split[y] = split[y].strip();
		}
		return split;
	}
	
	//- easier printing
	public static void forLoops(ArrayList<?> arrayList) {
		for (int x = 0; x < arrayList.size(); x++) {
			System.out.println(arrayList.get(x));
		}
	}
	

	
	
	
	
	

}
