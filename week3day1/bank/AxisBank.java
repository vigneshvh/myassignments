package inheritance;

public class AxisBank extends BankInfo {

	public void deposit(int depoamt) {

		System.out.println("amount Deposit in account " + depoamt);
	}

	public static void main(String[] args) {

		AxisBank obj = new AxisBank();
		obj.deposit(25000);

	}

}
