import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class achievement {
	public String name;
	public Boolean status;
	public String requirements;
	String game;
	File fileName;
	
	
	public achievement(String Name, Boolean Status, String Req, String Game, File FileName) {
		name = Name;
		status = Status;
		requirements = Req;
		game = Game;
		fileName = FileName;
	}
	
	public String toString() {
		String str = name + ": " + requirements + " (" + game + ")";
		
		return str;
	}
	
	public void toggleBool(boolean as) {
		String linetoFind = "";
		String linetoUse = "";
		
		if (status == false) {
			linetoFind = name + "	@	FALSE	@	" + requirements;
			linetoUse = name + "	@	TRUE	@	" + requirements;
		}
		else {
			linetoFind = name + "	@	TRUE	@	" + requirements;
			linetoUse = name + "	@	FALSE	@	" + requirements;
		}
		
		status = as;
		 try {
	            updateFile(linetoFind, linetoUse, fileName);
	        } catch (IOException e) {
	            System.out.println("Error updating file: " + e.getMessage());
	        }
	}
	
	private void updateFile(String lineToFind, String lineToUse, File f) throws IOException {
	    File tempFile = new File(f.getAbsolutePath() + ".tmp");
	    try (BufferedReader reader = new BufferedReader(new FileReader(f));
	         PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            if (line.equals(lineToFind)) {
	                writer.println(lineToUse);
	            } else {
	                writer.println(line);
	            }
	        }
	    } catch (IOException e) {
	        // Handle the exception here or rethrow it
	        throw e;
	    }
	    f.delete();
	    tempFile.renameTo(f);
	}


}
