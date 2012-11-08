package org.amm.euler.p100;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2_Test {

	@Test
	public void solution_1_test() {
		Long n = new Long(4000000);
		assertEquals(4613732, Problem_2.solution_1(n).intValue());
	}

}
