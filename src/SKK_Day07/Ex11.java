package SKK_Day07;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, absNum;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Input an integer (positive/negative) : ");
			num1 = kb.nextInt();
			if (num1 == 0) {
				System.out.println("Invalid number! Please give me another integer!");
			}
		} while (num1 == 0);
		
		absNum = Math.abs(num1);
		
		System.out.println("Extract the first digit from the said integer : " + firstDigit(absNum));
		
		kb.close();

	}

	public static int firstDigit(int ext) {
		while (ext / 10 != 0) {
			ext = ext / 10;
		}
		return ext;

	}

}
