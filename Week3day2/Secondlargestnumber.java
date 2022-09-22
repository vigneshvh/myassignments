package maven1;

import java.util.Arrays;

public class Secondlargestnumber {

	public static void main(String[] args) {
		int[] num = { 32, 82, 8, 10, 13, 27, 45 };
		Arrays.sort(num);

		System.out.println("the Second largest number in the array is " + num[5]);

	}

}
