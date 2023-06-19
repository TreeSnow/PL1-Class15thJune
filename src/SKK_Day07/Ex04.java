package SKK_Day07;

import java.util.Scanner;

public class Ex04 {

	public static int CNT_CHAR = 0, CNT_NUM = 0, ARR_LENGTH = 8;
	public static final char[] PWORD = new char[ARR_LENGTH];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println(" 1. A password must have at least eight characters. \r\n"
				+ " 2. A password consists of only letters and digits. \r\n"
				+ " 3. A password must contain at least two digits \r\n"
				+ " Input a password (You are agreeing to the above Terms and Conditions.): abcd1234 \r\n"
				+ "	Password is valid: abcd1234 ");

		String pw;
		do {
			System.out.println("Input password : ");
			pw = kb.next();
			if (pw.length() <= ARR_LENGTH -1) {
				System.out.println("Invalid Password. Please try it again!");
			}
		} while (pw.length() < ARR_LENGTH); 

		init_pwArr(pw);
		boolean check = is_Valid();

		if (check) {
			System.out.println("Password is valid : " + pw);
		} else {
			System.out.println("Password is Not valid !! : " + pw);
		}

		kb.close();

	}

	public static void init_pwArr(String pw1) {
		for (int i = 0; i < ARR_LENGTH; i++) {
			PWORD[i] = pw1.charAt(i);
		}
	}

	public static boolean is_Valid() {
		int i;
		for (i = 0; i < PWORD.length; i++) {
			if (is_Char(i)) {
				CNT_CHAR++;
			} else if (is_Number(i)) {
				CNT_NUM++;
			} else {
				return false;
			}
		}
		if (CNT_NUM >= 2 && i == PWORD.length) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean is_Char(int i) {
		char ch = Character.toUpperCase(PWORD[i]);
		if (ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}

	}

	public static boolean is_Number(int i) {
		char ch = PWORD[i];
		if (ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}
	}

}
