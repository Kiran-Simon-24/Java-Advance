package java.IO;

import java.util.Scanner;

public class PresenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "";
		while (userName == "") {
			Scanner scan = new Scanner(System.in);
			userName = scan.next();	
		}
		System.out.println("Hello" + " " + userName);
	}

}
