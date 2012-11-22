package org.amm.euler.p100;

import org.amm.euler.lib.EulerHelper;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 */
public class Problem_10 {

	public static long solution_0(long limit) {
		long sum = 5; // we know that 2 and 3 are prime
		int n = 5;
		while (n <= limit) {
			if (EulerHelper.isPrime(n))
				sum += n;
			n += 2;
			if (n <= limit && EulerHelper.isPrime(n))
				sum += n;
			n += 4;
		}
		return sum;
	}

	public static long solution_1(int limit) {

		int crosslimit = (int) Math.sqrt(limit);
		int sieve[] = new int[limit];
		for (int n = 0; n < limit; n++)
			sieve[n] = 0;

		for (int n = 4; n < limit; n += 2)
			// mark even numbers > 2
			sieve[n] = 1;

		for (int n = 3; n < crosslimit; n += 2) {
			if (sieve[n] != 0) { // n not marked, hence prime
				for (int m = n * n; m < limit; m += 2 * n)
					sieve[m] = 1;
			}
		}
		long sum = 0;
		for (int n = 2; n < limit; n++)
			if (sieve[n] != 0)
				sum += n;

		return sum;
	}

	public static long solution_2(long limit) {
		int sievebound = (int) ((limit - 1) / 2); // last index of sieve
		int[] sieve = new int[sievebound];
		for (int n = 0; n < sievebound; n++)
			sieve[n] = 0;

		int crosslimit = (int) (Math.sqrt(limit) / 2);
		for (int i = 1; i < crosslimit; ++i) {
			if (sieve[i] != 0) { // 2*i+1 is prime, mark multiples
				for (int j = 2 * i * (i + 1); j < sievebound; j += 2 * i + 1) {
					sieve[j] = 1;
				}
			}
		}
		long sum = 2; // 2 is prime
		for (int i = 1; i < sievebound; ++i) {
			if (sieve[i] != 0)
				sum += (2 * i + 1);
		}
		return sum;
	}
}
