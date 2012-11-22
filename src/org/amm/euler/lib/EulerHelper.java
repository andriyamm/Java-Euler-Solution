package org.amm.euler.lib;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * contains methods which used to solve problems from projecteuler.net
 * 
 */
public class EulerHelper {

	/**
	 * Find square root of BigInteger using NEWTON's method.
	 * 
	 * a_next=0.5*(a_current +x/a_current)
	 * 
	 * Use problem_3 solution_2
	 * 
	 * @param number
	 * 
	 * @return Square Root of number
	 */
	public static BigInteger squareRoot(BigDecimal number) {

		BigDecimal current = new BigDecimal("1");
		
		BigDecimal two = new BigDecimal("2");
		BigDecimal eps = new BigDecimal("0.0000000001");

		BigDecimal next = number.divide(current).add(current).divide(two);

		do {
			next = number.divide(current, 9, BigDecimal.ROUND_FLOOR).add(current).divide(two, 9, BigDecimal.ROUND_FLOOR);
			if (next.subtract(current).compareTo(eps) == -1)
				break;
			current = next;
		} while (true);
		return current.toBigInteger();
	}

	/**
	 * from http://e-maxx.ru/
	 * 
	 * find square root of BigInteger using NEWTON's method.
	 * 
	 * Поскольку число может быть достаточно большим, то имеет смысл обратить
	 * внимание на начальное приближение. Очевидно, что чем оно ближе к корню,
	 * тем быстрее будет достигнут результат. Достаточно простым и эффективным
	 * будет брать в качестве начального приближения число (2^bits)/2, где bits
	 * — количество битов в числе n.
	 * 
	 * Use problem_3 solution_2
	 * 
	 * @param n
	 * @return Square Root of n
	 */
	public static BigInteger squareRoot_0(BigInteger n) {

		BigInteger a = BigInteger.ONE.shiftLeft(n.bitLength() / 2);
		boolean p_dec = false;
		for (;;) {
			BigInteger b = n.divide(a).add(a).shiftRight(1);
			if (a.compareTo(b) == 0 || a.compareTo(b) < 0 && p_dec)
				break;
			p_dec = a.compareTo(b) > 0;
			a = b;
		}
		return a;
	}

	/**
	 * Reversed parameter n and return it
	 * 
	 * Use problem_4(in method isPalindrome) 
	 * 
	 * @param n long
	 * @return long reversed number
	 */
	public static long reverse(long n){
		long reversed = 0;
		while (n > 0){
			reversed = 10 * reversed + (n % 10);
			n /= 10;
		}
		return reversed;
	}
	
	/**
	 * Verify if parameter n is palindrom
	 * (Перевіряє чи пареметер n є паліндромом )
	 * 
	 * Use problem_4
	 * 
	 * @param n long
	 * @return boolean
	 */
	public static boolean isPalindrome(long n){
		return n == reverse(n);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(long n) {

		return false;
	}
}
