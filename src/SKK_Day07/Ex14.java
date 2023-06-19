package SKK_Day07;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		boolean bl;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a String : ");
		str = kb.next();
		bl = is_Vowel(str);
		
		System.out.println("Check all the characters of the said string are vowel or not!");
		if (bl) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		kb.close();

	}

	public static boolean is_Vowel(String strCheck) {

		char ch;
		for (int i = 0; i < strCheck.length(); i++) {
			ch = Character.toUpperCase(strCheck.charAt(i));
			if (ch == 'A') {
				continue;
			} else if (ch == 'E') {
				continue;
			} else if (ch == 'I') {
				continue;
			} else if (ch == 'O') {
				continue;
			} else if (ch == 'U') {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}
