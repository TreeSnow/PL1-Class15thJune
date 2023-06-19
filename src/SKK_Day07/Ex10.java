package SKK_Day07;

import java.util.Scanner;

public class Ex10 {

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

		if (has_MidNum(num1, num2, num3)) {
			System.out.println("These numbers have a midpoint!! True.");
		} else {
			System.out.println("These numbers does NOT have a midpoint!! False.");
		}

		kb.close();

	}

	public static boolean has_MidNum(double x, double y, double z) {

		if (x == (y + z) / 2) {
			return true;
		} else if (y == (x + z) / 2) {
			return true;
		} else if (z == (x + y) / 2) {
			return true;
		} else {
			return false;
		}
	}

}
