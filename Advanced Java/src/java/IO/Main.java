package java.IO;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] studentScores = {{"Faruq", "60"}, {"Jalila" , "90"}};
		try {
			FileWriter fw = new FileWriter("results.txt");
			for (int row = 0; row < studentScores.length; row++) {
				fw.write(studentScores[row][0] + ",");
				fw.write(studentScores[row][1] + "\n");
			}
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could not write to file");
		}
	}

}
