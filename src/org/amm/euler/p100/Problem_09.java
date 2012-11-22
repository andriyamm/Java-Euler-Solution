package org.amm.euler.p100;

import org.amm.euler.lib.EulerHelper;

/**
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
 *
 * a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 */
public class Problem_09 {

	public static int solution_0(int s) {
		int a, b, c;
		s = 1000; // or whatever the perimeter should be
		for (a = 3; a < ((s - 3) / 3); a++) {
			for (b = (a + 1); b < (s - 1 - a) / 2; b++) {
				c = s - a - b;
				if ((c * c) == (a * a + b * b)) {
					return c * a * b;
				}
			}
		}
		return 0;
	}

	public static int solution_1(int s) {
		int s2, mlimit, sm, d, n, k, a, b, c;
		s2 = s / 2;
		mlimit = (int) (Math.sqrt(Math.abs(s2)) - 1);

		for (int m = 2; m < mlimit; m++) {
			if ((s2 % m) == 0) {
				sm = s2 / m;
				while ((sm % 2) == 0) {// reduce the search space by
					sm = sm / 2; // removing all factors 2
				}
				if ((m % 2) == 1)
					k = m + 2;
				else
					k = m + 1;
				while ((k < 2 * m) && (k <= sm)) {
					if (((sm % k) == 0) && (EulerHelper.gcd(k, m) == 1)) {
						d = s2 / (k * m);
						n = k - m;
						a = d * (m * m - n * n);
						b = 2 * d * m * n;
						c = d * (m * m + n * n);
						return c*b*a;
					}
					k += 2;
				}// po while ((k < 2 * m) && (k <= sm))
			}// po if ((s2 % m) == 0)
		}// po for
		return 0;
	}// po run_0

}
