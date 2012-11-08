package org.amm.euler.p100;
/**
 * 
 * @author amekich
 *
 */
public class Problem_1 {
	
	public static Integer solution_1(Integer n){
		Integer sum = 0;
		for(int i = 0; i<n; i++){
			if((i % 3 == 0)||(i % 5 == 0)){
				sum += i;
			}
		}
		return sum;
	}
}
