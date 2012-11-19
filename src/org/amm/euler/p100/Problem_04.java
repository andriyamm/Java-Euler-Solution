package org.amm.euler.p100;

import org.amm.euler.lib.EulerHelper;

/**
*
* A palindromic number reads the same both ways. The largest palindrome made from 
* the product of two 2-digit numbers is 9009 = 91 99.
*
* Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Problem_04{

	
	public static long solution_0(){
		
		int largestPalindrome = 0;
		int a = 999;
		int b = 999;
		int db = 1;
		
		while (a >= 100){
			if ((a % 11) == 0){
				b = 999;
				db = 1;
			}else{
				b = 990; //The largest number less than or equal 999
						 //and divisible by 11
				db = 11;
			}
			while (b >= a){
				if ((a * b) <= largestPalindrome)
					break;
				
				if (EulerHelper.isPalindrome(a * b))
					largestPalindrome = a * b;
				
				b = b - db;
			}
				a = a - 1;
		}
		
		return largestPalindrome;
	}
	
}// po class
