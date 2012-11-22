package org.amm.euler.p100;

import org.amm.euler.lib.EulerHelper;

public class Problem_07 {

	public static long solution_0(long primeCount) {
		long count = 1; // 2 is prime
		long number = 1;
		do {
			number += 2;
			if (EulerHelper.isPrime(number))
				count++;
		} while (count != primeCount);
		return number;
	}
}
