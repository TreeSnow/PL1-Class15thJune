package June15th;

public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		score={54,745,92,265,54};
		int[] myArray = new int[5]; // declaring Array with size '5'
//		double[] scores;
//		scores = new double[6];

		int[] mySecArr = { 5, 7, 2, 5, 3, 7, 2, 5, 7, 3 }; // another way to write array

		myArray[0] = 2;
		myArray[1] = 5;
		myArray[2] = 77;
		myArray[3] = 84;
		myArray[4] = 9;

		System.out.println(myArray); // Print out memory Address
		System.out.println(myArray[2]); // Print out value

//		for (int i = 0; i < 5; i++) {
//			System.out.println(myArray[i]);
//		}
		for (int i = 0; i < 10; i++) {
			System.out.println(mySecArr[i]);
		}

	}

}
