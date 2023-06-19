package SKK_Day07;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		boolean bl;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Input an integer : ");
			num1 = kb.nextInt();
			if (num1 == 0) {
				System.out.println("Invalid number! Please give me another integer!");
			}
		} while (num1 == 0);

		bl = check_evenDigit(num1);
		System.out.println("Check whether every digit of the said integer is even or not!");
		if (bl) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		kb.close();

	}

	public static boolean check_evenDigit(int checkNum) {
		while (checkNum / 10 != 0) {
			if ((checkNum % 10) % 2 != 0) {
				return false;
			} else {
				checkNum /= 10;
			}
		}

		if (checkNum % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
