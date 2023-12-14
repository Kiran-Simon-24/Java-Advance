package java.IO;
import java.io.*;
import java.util.*;

public class IOtestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String[]> results = new ArrayList<String[]>();
		try {
			File file = new File("results.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] singleStudent = line.split(",");
				results.add(singleStudent);
			}
			scanner.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could not write to file");
		}
		for(int i = 0; i < results.size(); i++) {
			System.out.println(results.get(i)[0] + ": " + results.get(i)[1]);
		}
	}

}
