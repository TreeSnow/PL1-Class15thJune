package SKK_Day07;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input a number for the matrix - n by n : ");
		n = kb.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%d ", (int) (Math.random() * 2));
			}
			System.out.println();
		}

		kb.close();
	}

}
