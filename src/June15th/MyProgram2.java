package June15th;

import java.util.Scanner;

public class MyProgram2 {

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 
		 * 
		 * 
		 * 2. A password consist of only
		 * 
		 * 
		 */

		Scanner kb = new Scanner(System.in);
		System.out.println("Please put your year : ");
		String pass = kb.next();
		boolean result = is_validPass(pass);

		if (result) {
			System.out.println("yes, you got it!!");
			
		}else {
			System.out.println("Nope !");
		}
		
		kb.close();

	}

	public static boolean is_validPass(String password) {

		if (password.length() < PASSWORD_LENGTH) {
			return false;
		}

		int charCount = 0, numCount = 0;

		for (int i = 0; i < password.length(); i++) { // p2argol
			char mych = password.charAt(i);

			if (is_Num(mych)) {
				numCount++;
			} else if (is_Letter(mych)) {
				charCount++;
			} else {
				return false;
			}
		}
		return (charCount >= 2 && numCount >= 2);
	}

	

	public static boolean is_Letter(char c) {
		c = Character.toUpperCase(c);
		if (c >= +'A' && c <= 'Z') {
			return true;
		} else {
			return false;
		}

	}

	public static boolean is_Num(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}

	}

}
