package SKK_Day07;

import java.util.Scanner;

public class Ex12 {

	public static int CNT = 0, FACT = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, remain;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Input an integer (positive/negative) : ");
			num1 = kb.nextInt();
			if (num1 == 0) {
				System.out.println("Invalid number! Please give me another integer!");
			}
		} while (num1 == 0);

		remain = check_Factor(num1);

		if (Math.abs(remain) == 1) {
			System.out.println("Factors of " + FACT + " of the said integer : ");
			System.out.print(num1 + " = ");
			for (int i = 1; i <= CNT; i++) {
				System.out.print(FACT + " * ");
			}
			System.out.println(remain);
		} else {
			System.out.println("This number is not a multiple of " + FACT + " !");
		}

		kb.close();

	}

	public static int check_Factor(int ext) {
		while (ext / FACT != 0) {
			if (ext % FACT == 0) {
				ext = ext / FACT;
				CNT++;
			} else {
				break;
			}
		}

		return ext;

	}

}
