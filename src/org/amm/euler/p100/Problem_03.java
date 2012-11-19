package org.amm.euler.p100;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.amm.euler.lib.EulerHelper;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
public class Problem_03 {

	public static Long solution_1(long n) {

		long lastFactor, factor, maxFactor;

		if (n % 2 == 0) {
			lastFactor = 2;
			n = n / 2;
			while (n % 2 == 0) {
				n = n / 2;
			}
		} else {
			lastFactor = 1;
		}
		factor = 3;
		maxFactor = (long) Math.sqrt(n);
		while ((n > 1) && (factor <= maxFactor)) {
			if (n % factor == 0) {
				n /= factor;
				lastFactor = factor;
				while (n % factor == 0) {
					n /= factor;
				}
				maxFactor = (long) Math.sqrt(n);
			}
			factor = factor + 2;
		}

		if (n == 1) {
			return lastFactor;
		} else {
			return n;
		}

	}// po method

	/**
	 * BigInteger implementation
	 * 
	 * @param n
	 * @return
	 */
	public static BigInteger solution_2(BigInteger n) {
		
		BigInteger temp_f0 = BigInteger.valueOf(0);
		BigInteger temp_f1 = BigInteger.valueOf(1);
		BigInteger temp_f2 = BigInteger.valueOf(2);
		
		BigInteger lastFactor, factor, maxFactor;

		if (n.remainder(temp_f2).equals(temp_f0)) {
			lastFactor = BigInteger.valueOf(2);
			n = n.divide(temp_f2);
			while (n.remainder(temp_f2).equals(temp_f0)) {
				n = n.divide(temp_f2);
			}
		} else {
			lastFactor = BigInteger.valueOf(1);
		}
		factor = BigInteger.valueOf(3);
		maxFactor = EulerHelper.squareRoot(new BigDecimal(n));
		//maxFactor = EulerHelper.squareRoot_0(n);
		while ((n.compareTo(temp_f1) > 0) && (factor.compareTo(maxFactor) <= 0)) {
			if (n.remainder(factor).equals(temp_f0)) {
				n = n.divide(factor);
				lastFactor = factor;
				while (n.remainder(factor).equals(temp_f0)) {
					n = n.divide(factor);
				}
				maxFactor =   EulerHelper.squareRoot(new BigDecimal(n));
				//maxFactor =   EulerHelper.squareRoot_0(n);
			}
			factor = factor.add(temp_f2);
		}

		if (n.equals(temp_f1)) {
			return lastFactor;
		} else {
			return n;
		}
		
	}
	
}

