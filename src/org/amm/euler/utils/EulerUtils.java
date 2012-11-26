package org.amm.euler.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EulerUtils {

	public static ArrayList<ArrayList<Integer>> read2darray(String filename)
			throws FileNotFoundException {

		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		Scanner input = new Scanner(new File(filename));
		while (input.hasNextLine()) {
			Scanner colReader = new Scanner(input.nextLine());
			ArrayList<Integer> col = new ArrayList<Integer>();
			while (colReader.hasNextInt()) {
				col.add(colReader.nextInt());
			}
			a.add(col);
		}
		return a;
	}
}
