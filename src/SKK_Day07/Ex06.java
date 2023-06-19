package SKK_Day07;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scalene Triangle Area
		// A = sqrt ( S x(S -a)x (S-b) x(S-c))
		// S = (a + b+ c) /2
		
		double side1, side2, side3, area;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input Side-1 : ");
		side1 = kb.nextDouble();
		System.out.println("Input Side-2 : ");
		side2 = kb.nextDouble();
		System.out.println("Input Side-3 : ");
		side3 = kb.nextDouble();
		
		area = cal_TriangArea(side1,side2, side3);
		
		System.out.printf("The area of the triangle is %.13f %n", area);
		
		kb.close();

	}

	public static double cal_TriangArea(double a, double b, double c) {
		double area, s;
		s = (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		return area;
	}

}
