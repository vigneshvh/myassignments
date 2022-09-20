package maven1;

public class palindrome {

	public static void main(String[] args) {
		String word = "madam", reverse = "";

		int strLength = word.length();

		for (int i = strLength - 1; i >= 0; --i) {
			reverse = reverse + word.charAt(i);
		}

		if (word.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println(word + " is a Palindrome");
		} else {
			System.out.println(word + " is not a Palindrome");
		}
	}

}
