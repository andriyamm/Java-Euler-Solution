package org.amm.euler.p100;

import org.amm.euler.lib.EulerHelper;

public class Problem_07 {

	public static long solution_0() {
		long i = 0;// count of prime numbers
		long n = 2;// numbers
		while (true) {
			if (EulerHelper.isPrime(n)) {
				i++;
				if (i == 10001)
					return n;
				n++;
			}
		}
	}
}
