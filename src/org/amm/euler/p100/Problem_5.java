package org.amm.euler.p100;

/**
 * 2520 is the smallest number that can be divided by each of the numbers
 * from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of 
 * the numbers from 1 to 20?
 */
public class Problem_5 {

	public static long solution_0() {
		int p[] = { 2, 3, 5, 7, 9, 11, 13, 17, 19 };
		long a[] = new long[20];
		int k = 20,  i = 1;
		long N = 1;
		boolean check = true;

		double limit = Math.sqrt(k);

		while (p[i] <= k) {
			a[i] = 1;
			if (check) {
				if (p[i] <= limit) {
					a[i] = (int) Math.floor(Math.log(k) / Math.log(p[i]));
				} else {
					check = false;
				}
			}
			N = (int) (N * Math.pow(p[i], a[i]));
			i++;
		}
		return N;
	}
}
