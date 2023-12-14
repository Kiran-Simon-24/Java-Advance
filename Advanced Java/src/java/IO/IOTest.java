package java.IO;
import java.io.*;
public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {FileWriter fw = new FileWriter("names.txt");
		fw.write("First item" + ",");
		fw.write("Second item");
		fw.close();}
		catch(IOException e){
			System.out.println("Could not write to file");
		}
	}

}
