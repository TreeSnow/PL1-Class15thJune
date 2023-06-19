package SKK_Day07;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the first number : ");
		num1 = kb.nextDouble();
		System.out.println("Input the second number : ");
		num2 = kb.nextDouble();
		System.out.println("Input the third number : ");
		num3 = kb.nextDouble();

		if (is_Consecutive(num1, num2, num3)) {
			System.out.println("These numbers are consecutive!! True.");
		} else {
			System.out.println("These numbers are Not consecutive!! False.");
		}

		kb.close();

	}

	public static boolean is_Consecutive(double a, double b, double c) {
		if (a == b) {
			return false;
		} else if (b == c) {
			return false;
		} else if (a == c) {
			return false;
		} else {

			return is_MidNum(a, b, c);
		}
	}

	public static boolean is_MidNum(double x, double y, double z) {

		if (x == (y + z) / 2) {
			if (Math.abs(y - z) == 2) {
				return true;
			} else {
				return false;
			}

		} else if (y == (x + z) / 2) {
			if (Math.abs(x - z) == 2) {
				return true;
			} else {
				return false;
			}
		} else if (z == (x + y) / 2) {
			if (Math.abs(x - y) == 2) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
