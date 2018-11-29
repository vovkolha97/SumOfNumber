package ua.com.qalight.Vovk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumNumTest {

	@Test
	void testGetSumBySplit() {
		
		Integer result = SumNumberRunner.getSumBySplit(234);
		assertTrue(result == 9);
	}

	@Test
	void testGetSumByDivision() {
		
		Integer result = SumNumberRunner.getSumByDivision(456);
		assertTrue(result == 15);
	}

}
