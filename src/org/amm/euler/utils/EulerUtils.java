package org.amm.euler.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EulerUtils {

	/**
	 * read matrix from text file
	 * 
	 * @param filename
	 * 			name of file  
	 * @return matrix in as ArrayList of <ArrayList<Integer>
	 * @throws FileNotFoundException 
	 */
	public static ArrayList<ArrayList<Integer>> readMatrix(String filename)
			throws FileNotFoundException {

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		Scanner input = new Scanner(new File(filename));
		while (input.hasNextLine()) {
			Scanner rowReader = new Scanner(input.nextLine());
			ArrayList<Integer> row = new ArrayList<Integer>();
			while (rowReader.hasNextInt()) {
				row.add(rowReader.nextInt());
			}
			matrix.add(row);
		}
		return matrix;
	}
	
	/**
	 * read matrix from text file
	 * 
	 * @param filename
	 * 			name of file  
	 * @return two dimension array
	 * @throws FileNotFoundException 
	 */
	public static int[][] readMatrix(String filename, Integer row, Integer col)
			throws FileNotFoundException {

		int[][] matrix = new int[row][col];
		int j, i = 0;
		Scanner input = new Scanner(new File(filename));
		
		while (input.hasNextLine()) {
			Scanner rowReader = new Scanner(input.nextLine());
			j = 0;
			while (rowReader.hasNextInt()) {
				matrix[i][j] = rowReader.nextInt();
				j++;
			}
			i++;
		}
		return matrix;
	}
}
