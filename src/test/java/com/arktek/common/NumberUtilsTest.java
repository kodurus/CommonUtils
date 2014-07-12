package com.arktek.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.arktek.common.impl.NumberUtilsImpl;

public class NumberUtilsTest {

	private NumberUtils numberUtils = new NumberUtilsImpl();
	
	@Test
	public void testIsPrime() {
		assertTrue(numberUtils.isPrime(7));
		assertFalse(numberUtils.isPrime(484));
		assertTrue(numberUtils.isPrime(15485863));
		assertTrue(numberUtils.isPrime(1234567811));
		assertFalse(numberUtils.isPrime(4675876987986978L));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsPrimeWithException() {
		assertTrue(numberUtils.isPrime(-7));
	}

	@Test
	public void testReverse() {
		assertEquals(1012, numberUtils.reverse(2101));
		assertEquals(467689708098L, numberUtils.reverse(890807986764L));
		assertEquals(56674876869L, numberUtils.reverse(96867847665L));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testReverseWithException() {
		assertEquals(-12345, numberUtils.reverse(-54321));
	}

	@Test
	public void testIsPalindrome() {
		assertTrue(numberUtils.isPalindrome(567464765));
		assertFalse(numberUtils.isPalindrome(675465432));
		assertTrue(numberUtils.isPalindrome(3));
		assertTrue(numberUtils.isPalindrome(33433));
	}
	
	@Test
	public void testGetPalindrome() {
		assertEquals(1111, numberUtils.getPalindrome(95));
		assertEquals(4884, numberUtils.getPalindrome(87));
		assertEquals(-1, numberUtils.getPalindrome(196));
		assertEquals(44044, numberUtils.getPalindrome(770));
		assertEquals(56265, numberUtils.getPalindrome(1689));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetPalindromeWithException() {
		assertEquals(-1111, numberUtils.getPalindrome(-95));
	}
}
