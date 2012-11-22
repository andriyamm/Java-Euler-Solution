package org.amm.euler.p100;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_02_Test {

	@Test
	public void solution_1_test() {
		Long n = new Long(4000000);
		assertEquals(4613732, Problem_02.solution_1(n).intValue());
	}

}
