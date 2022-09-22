package simpleprograms;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				System.out.println("the missing element in the array is");
				System.out.println(arr[i] + 1);
				break;

			}

		}

	}
}
