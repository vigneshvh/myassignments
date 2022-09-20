package maven1;

public class touppercase {

	public static void main(String[] args) {

		String input = "changeme";

		char[] arr1 = input.toCharArray();

		for (int i = 0; i < arr1.length; i++) {

			if (i % 2 != 0) {

				arr1[i] = Character.toUpperCase(arr1[i]);
				System.out.print(" " + arr1[i]);
			} else {

				System.out.print(" " + arr1[i]);

			}

		}
	}
}
