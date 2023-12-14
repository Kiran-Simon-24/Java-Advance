package java.IO;
import java.io.*;
import java.util.Scanner;

public class IObyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars;
		try {
			File file = new File("cars.txt");
			Scanner scan = new Scanner(file);
			String line = scan.nextLine();
			cars = line.split(",");
			
			for(int i = 0; i < cars.length; i++) {
				System.out.println(cars[i]);
			}
			scan.close();
		}
		catch(IOException e){
			System.out.println("Could not write to file");
		}
	}

}
