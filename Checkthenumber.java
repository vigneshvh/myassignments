package simpleprograms;

public class Checkthenumber {

	public static void main(String[] args) {

		int num = -2;
		if (num < 0)
			System.out.println(num + "the given number is negative");
		else if (num == 0)
			System.out.println(num + "the given number is neither positive nor negative");
		else
			System.out.println(num + "the given number is positive");
	}

}

