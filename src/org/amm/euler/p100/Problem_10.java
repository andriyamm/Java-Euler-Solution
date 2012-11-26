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

	public static long solution_1(long limit) {
		
		int sievebound = (int) ((limit - 1) / 2); // last index of sieve
		boolean[] sieve = new boolean[sievebound];
		
		int crosslimit = (int) (Math.sqrt(limit) / 2);
		for (int i = 1; i < crosslimit; ++i) {
			if (!sieve[i]) { // 2*i+1 is prime, mark multiples
				for (int j = 2 * i * (i + 1); j < sievebound; j += 2 * i + 1) {
					sieve[j] = true;
				}
			}
		}
		long sum = 2; // 2 is prime
		for (int i = 1; i < sievebound; ++i) {
			if (!sieve[i])
				sum += (2 * i + 1);
		}
		return sum;
	}
}
