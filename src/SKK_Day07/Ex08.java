package SKK_Day07;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime;

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number to check : ");
		prime = kb.nextInt();

		if (is_Prime(prime)) {
			System.out.println("Number " + prime + " is a prime number!!");
		} else {
			System.out.println("Number " + prime + " is NOT a prime number!!");
		}

		kb.close();

	}

	public static boolean is_Prime(int num1) {
		boolean check = true;
		if (num1 == 2) {
			return check;
		}

		for (int i = 2; i < num1; i++) {

			if (num1 % i == 0) {
				check = false;
				break;
			}
		}
		return check;

	}

}
