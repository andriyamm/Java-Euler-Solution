package org.amm.euler.p100;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_3_Test {
	
	@Test
	public void solution_1_test() {
		assertEquals(6857, Problem_3.solution_1(600851475143l).intValue());
	}
}
