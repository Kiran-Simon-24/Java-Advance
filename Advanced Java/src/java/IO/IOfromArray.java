package java.IO;

import java.io.*;

public class IOfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"BMW", "Audi", "Volvo" , "Honda", "Nissan"};
		try {
			FileWriter fw = new FileWriter("cars.txt");
			for(int index = 0; index < cars.length; index++) {
				fw.write(cars[index] + ",");
			}
			fw.close();
		}
		catch(IOException e){
			System.out.println("Could not write to file");
		}
	}

}
