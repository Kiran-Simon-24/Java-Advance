package java.IO;

import java.util.*;

public class Look_upCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arryForm = { "7AXB", "7PDB", "7ARL", "7JEH" };
		Scanner scan = new Scanner(System.in);
		String form = scan.next();
		boolean valid = false;
		int index = 0;
		int length = arryForm.length;
		while (valid == false && index < length) {
			if (form.equals(arryForm[index])) {
				valid = true;
			}
			index++;
		}
		if (valid == true) {
			System.out.println("Valid form");
		} else {
			System.out.println("The form you entered does not exit");
		}
	}

}
