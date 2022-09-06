package simpleprograms;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;

		int rev = 0, i, remainder;
		i = num;

		for (; num != 0; num /= 10) {
			remainder = num % 10;
			rev = (rev * 10) + remainder;
		}

		if (i == rev) {
			System.out.println("Yes, it is palindrome");
		} else {
			System.out.println("No, it is not palindrome");
		}
	}

}
