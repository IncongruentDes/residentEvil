import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<achievement> arr = fileReader("re2r.txt", "Resident Evil 2 Remake");
		fileReader("re3r.txt", "Resident Evil 3 Remake");
		fileReader("re4r.txt", "Resident Evil 4 Remake");
		
		pop Pop = new pop("Resident Evil 2 Achivements", arr);



	}
	
	public static ArrayList<achievement> fileReader(String text, String games)
	{
		
		// - setting up achievements
		ArrayList<achievement> game = new ArrayList<achievement>();
		
		//-file reading
		try {
			Scanner scanner = new Scanner(new File(text));

			while (scanner.hasNextLine()) {
				String curLine = scanner.nextLine();
				String[] split = curLine.split("@");
				achievement curAch = new achievement(split[0].strip(), Boolean.parseBoolean(split[1].strip()), split[2].strip(), games);
				game.add(curAch);
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		forLoops(game);
		// - return statement
		return game;
	}

	//- easier printing
	public static void forLoops(ArrayList<?> arrayList) {
		for (int x = 0; x < arrayList.size(); x++) {
			System.out.println(arrayList.get(x));
		}
	}



}
