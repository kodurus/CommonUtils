package com.arktek.common;


/**
 * This API provides the utilities for obtaining information
 * about numbers, such as finding if a number is prime, or finding
 * the reverse of a number etc.
 */
public interface NumberUtils {

	/**
	 * Identifies if the given number is prime. A number is
	 * considered to be prime if and only if the number is
	 * divisible only by 1 and itself.
	 * @param number the number to be tested for prime. The
	 * input number must be a positive whole number.
	 * @return true, if the given number is prime, else false.
	 * @throws IllegalArgumentException thrown if the number
	 * is not a positive whole number.
	 */
	public boolean isPrime(long number);

	/**
	 * Reverses the given number.
	 * @param number the number to be reversed. The input
	 * number must be a positive whole number.
	 * @return the reverse of the given number.
	 * @throws IllegalArgumentException thrown if the number
	 * is not a positive whole number.
	 */
	public long reverse(long number);

	/**
	 * /**
	 * A number is said to be a palindrome if it reads the same
	 * from left to right as from right to left. If the given
	 * number is a palindrome, true is returned, else false.
	 * @param number the number to be tested for palindrome.
	 * @return true, if the given number is a palindrome,
	 * else false.
	 */
	public boolean isPalindrome(long number);
	
	/**
	 * A number is said to be a palindrome if it reads the same
	 * from left to right as from right to left. For the given
	 * number, if its digits are reversed and added to the number,
	 * the resulting number could be a palindrome. If it is not a
	 * palindrome, the process is repeated for a finite number
	 * of times (10 times in the current implementation). If the
	 * resulting number is not a plaindrome after the maximum
	 * number of tries, -1 is returned.
	 * @param number the number to be tested if it would result
	 * in a palindrome.
	 * @return the resulting palindrome number, or -1 if the number
	 * does not result in a palindrome.
	 */
	public long getPalindrome(long number);
}
