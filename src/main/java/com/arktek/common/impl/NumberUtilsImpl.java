package com.arktek.common.impl;

import com.arktek.common.NumberUtils;
import com.google.common.base.Preconditions;

/**
 * Implementation of common number utilities.
 */
public class NumberUtilsImpl implements NumberUtils {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isPrime(long number) {
		
		Preconditions.checkArgument(number > 0, "Number %d must be positive", number);
		long squareRoot = (long) Math.sqrt(number);
		
		for (long i = 2; i <= squareRoot; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long reverse(long number) {

		Preconditions.checkArgument(number > 0, "Number %d must be positive", number);
		long reverseNumber = 0;
		while (number != 0) {
			int digit = (int) (number % 10);
			reverseNumber = (reverseNumber * 10) + digit;
			number /= 10;
		}
		
		return reverseNumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isPalindrome(long number) {
		
		Preconditions.checkArgument(number > 0, "Number %d must be positive", number);
		return (number == reverse(number));
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getPalindrome(long number) {
		
		Preconditions.checkArgument(number > 0, "Number %d must be positive", number);
		int maxTries = 10;
		int numberOfTries = 0;
		long palindromeNumber = number;
		while (numberOfTries++ < maxTries) {
			palindromeNumber += reverse(palindromeNumber);
			if (isPalindrome(palindromeNumber)) {
				return palindromeNumber;
			}
		}
		
		return -1;
	}
}
