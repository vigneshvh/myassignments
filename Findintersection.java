package simpleprograms;

public class Findintersection {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 8, 9, 10 };
		int[] arr2 = { 2, 9, 10, 7, 6 };
		System.out.println("Array intersection");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j])
					System.out.println(arr1[i]);

			}
		}

	}

}
