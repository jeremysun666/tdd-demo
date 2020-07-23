package org.example.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxServiceImplTest {

	private TaxService taxService = new TaxServiceImpl();

	@Test
	public void test_0() {
		assertEquals(0, taxService.getIncomeTax(0));
	}

	@Test
	public void test_50000() {
		assertEquals(5000, taxService.getIncomeTax(50000));
	}

	@Test
	public void test_100000() {
		//50 * 0.1 + 50 * 20%
		assertEquals(15000, taxService.getIncomeTax(100000));
	}

	@Test
	public void test_invalid() {
		assertEquals(0, taxService.getIncomeTax(-1));
	}

	@Test
	public void test_200000() {
		//15000 + (100000 * 0.25
		assertEquals(40000, taxService.getIncomeTax(200000));
	}

	@Test
	public void test_500000() {
		//40000 + 300000 * 0.5
		assertEquals(190000, taxService.getIncomeTax(500000));
	}
}