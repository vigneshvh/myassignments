package maven1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatesinarray {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");
		Set<String> str = new LinkedHashSet<String>(Arrays.asList(split));

		for (String string : str) {
			System.out.print(string + " ");
		}

	}

}