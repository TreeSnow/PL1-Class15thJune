package SKK_Day07;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		Scanner kb = new Scanner(System.in);
		System.out.println("[ Leap Year check ]");
		System.out.println("Input a Year to check: ");
		year = kb.nextInt();

		System.out.println(check_Leap(year));
		
//		if (check_Leap(year)) {
//			System.out.println("Yes, the year "+ year + " is Leap Year!!");
//		} else {
//			System.out.println("Nope, the year "+ year + " is Common Year!!");
//		}

		kb.close();

	}

	public static boolean check_Leap(int yr) {
		boolean bl;
		if (yr % 400 == 0) {
			bl = true;
		} else if (yr % 4 == 0 && yr % 100 != 0) {
			bl = true;
		} else {
			bl = false;
		}

		return bl;

	}

}
