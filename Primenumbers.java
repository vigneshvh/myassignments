package maven1;

public class Primenumbers {

	public static void main(String[] args) {
		int num = 13;

		boolean flag = false;
		for (int i = 2; i <= 2; i++) {

			if (num % i == 0) {

				flag = true;
				break;

			}
			if (!flag)
				System.out.println("it is a prime number");
			else
				System.out.println("it is not a prime number");
		}

	}

}
