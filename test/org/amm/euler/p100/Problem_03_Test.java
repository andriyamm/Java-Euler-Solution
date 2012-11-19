package org.amm.euler.p100;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Problem_03_Test {
	
	@Test
	public void solution_1_test() {
		assertEquals(6857, Problem_03.solution_1(600851475143l).intValue());
	}
	
	@Test
	public void solution_2_test() {
		BigInteger n = BigInteger.valueOf(600851475143l);
		assertEquals(6857, Problem_03.solution_2(n).intValue());
	}
	
}
