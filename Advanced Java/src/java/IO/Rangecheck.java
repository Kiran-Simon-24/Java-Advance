package java.IO;

import java.util.*;

public class Rangecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		boolean validNum = false;
		
		while (validNum == false) {
			System.out.println("Please enter a number between 1 and 10.");
			number = scan.nextInt();
			if (number >= 1 && number <= 10) {
				validNum = true;
				break;
			}

		}
		System.out.println("You have entered: " +  number);
		
	}

}
