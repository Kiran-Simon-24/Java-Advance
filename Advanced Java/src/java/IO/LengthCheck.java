package java.IO;

import java.util.Scanner;

public class LengthCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String postCode = scan.next();
		int length = postCode.length();
		if(length >= 6 && length <= 8) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		
		}
	}

}
