package SKK_Day07;

public class Ex01 {

	public static final int[] PENT_ARR = new int[50];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		init_pentNum(); // initializing Array
		printArr(); // print Array

	}

	public static void init_pentNum() {
//		pNum = ((3 * n* n) - n)/2	

		int n = 1;
		for (int i = 0; i < 50; i++) {
			PENT_ARR[i] = ((3 * n * n) - n) / 2;
			n++;
		}
	}

	public static void printArr() {
		int i, j, ind = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 10; j++) {
				System.out.printf("%d \t", PENT_ARR[ind++]);
			}
			System.out.println();
		}

	}

}
