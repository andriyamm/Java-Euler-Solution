package org.amm.euler.p100;

public class Problem_7 {
	public static Long solution_1() {
		return null;
	}

	public static boolean isPrime(long n) {

		return false;
	}

	public static long run() {
		long i = 0;// count of prime numbers
		long n = 2;// numbers
		while (true) {
			if (isPrime(n)) {
				i++;
				if (i == 10001)
					return n;
				n++;
			}
		}
	}
}
