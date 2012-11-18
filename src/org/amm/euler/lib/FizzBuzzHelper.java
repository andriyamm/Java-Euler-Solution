package org.amm.euler.lib;

public class FizzBuzzHelper {
	
	/**
	  * Write a program that prints the numbers from 1 to 100.
	  * But for multiples of three print "Fizz" instead of the
	  * number and for the multiples of five print "Buzz". For
	  * numbers which are multiples of both three and five print "FizzBuzz".
	  */
	public static void FizzBuzz(){
	    for(int i = 1; i < 100; i++){
	        if((i % 3 == 0) && (i % 5 == 0) ){
	        	 System.out.println("FizzBuzz\t");
	            continue;
	        }
	        if(i % 3 == 0){
	        	 System.out.println("Fizz\t");
	            continue;
	        }
	        if(i % 5 == 0){
	        	 System.out.println("Buzz\t");
	           continue;
	        }
	        System.out.println(i + "\t");
	    }
	}
	
}
