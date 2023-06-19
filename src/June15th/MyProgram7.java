package June15th;

import java.util.Scanner;

public class MyProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int check = 0, index1 = 0, index2 = 0;
		int[] ar1 = new int[10];
		ar1[0] = 2;
		ar1[1] = 5;
		ar1[2] = 77;
		ar1[3] = 22;
		ar1[4] = 99;
		ar1[5] = 18;
		ar1[6] = 22;
		ar1[7] = 7;
		ar1[8] = 12;
		ar1[9] = 81;

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number to check : ");
		int num1 = kb.nextInt();

//		for (int i = 0; i < 10; i++) {
//			if (num1 == ar1[i]) {
//				if (i == 9) {
//					check = 1;
//					index2 = i;
//					break;
//				} else {
//					check = 1;
//					index1 = i;
//				}
//			} else {
//				check = 2;
//			}
//
//		}
//
//		switch (check) {
//		case 1:
//			System.out.println("Yes, you have a number " + num1 + " in the array!");
//			if (index2 != 0) {
//				System.out.println("Value found in the 1st index : " + index1);
//				System.out.println("Value found in the 2nd index : " + index2);
//			} else {
//				System.out.println("Value found in the index : " + index1);
//			}
//
//			break;
//		case 2:
//			System.out.println("Nope, you don't have that number in the array!");
//			break;
//
//		}

		for (int i = 0; i < 10; i++) {
			if (ar1[i] == num1) {
				System.out.println("Value found in the index : " + index1);

			}
		}

		kb.close();

	}

}
