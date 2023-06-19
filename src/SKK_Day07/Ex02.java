package SKK_Day07;

public class Ex02 {

	public static final double INV = 1000, INTR = 0.104713, YEARS = 5;
	public static final double[] FUTURE_VAL = new double[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init_Arr();
		System.out.println("Years		FutureValue");
		for (int i = 0; i < YEARS; i++) {
			System.out.printf("%d \t\t %.2f %n", i + 1, FUTURE_VAL[i]);

		}

	}

	public static void init_Arr() {
		double futureVal = INV;

		for (int i = 0; i < YEARS; i++) {
			futureVal += cal_Profit(futureVal);
			FUTURE_VAL[i] = futureVal;

		}
	}

	public static double cal_Profit(double amount) {
		double addProfit;
		addProfit = amount * INTR;

		return addProfit;
	}

}
