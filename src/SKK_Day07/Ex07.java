package SKK_Day07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numSide, lenSide, area;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number of sides : ");
		numSide = kb.nextDouble();
		System.out.println("Input the side : ");
		lenSide = kb.nextDouble();

		if (numSide == 5) {
			area = pent_Area(numSide, lenSide);
			System.out.printf("The area of the pentagon is %.13f %n", area);
		} else {
			System.out.printf("This is not the pentagon!!");
		}

		kb.close();

	}

	public static double pent_Area(double numSide, double lenSide) {
		double area;
		area = (Math.sqrt(numSide * (numSide + 2 * Math.sqrt(numSide))) * Math.pow(lenSide, 2)) / 4;

		return area;
	}

}
