package NumberLogicalProgramms;

import java.util.Arrays;

public class NumberProgramms {

	private void sortTheGivenNumber2() {

		int num = 74180701;

		String numStr = Integer.toString(num);

		char[] digits = numStr.toCharArray();

		Arrays.sort(digits);

		String sortedNumStr = new String(digits);

		System.out.println("Sorted digits (ascending): " + sortedNumStr);

		int sortedNum = Integer.parseInt(sortedNumStr);

		System.out.println("Sorted number (ascending): " + sortedNum);

	}

	private void reverseTheGivenNumber() {

		int given = 74180701;

		int result = 0;

		while (given > 0) {

			int num = given % 10;
			result = (result * 10) + num;
			given = given / 10;

		}
		System.out.println(result);
	}

	private void countTheGivenNumbers() {
		int given = 74180701;
		int count = 0;
		while (given > 0) {
			count++;
			given = given / 10;
		}
		System.out.println(count);
	}

	private void sumTheGivenNumber() {

		int given = 123;

		int sum = 0;

		while (given > 0) {

			int num = given % 10;
			sum = sum + num;
			given = given / 10;

		}
		System.out.println(sum);

	}

	private void productTheGivenNumber() {

		int given = 1234;

		int multiply = 1;

		while (given > 0) {

			int num = given % 10;
			multiply = multiply * num;
			given = given / 10;

		}
		System.out.println(multiply);

	}

	private void squareValueOfTheGivenNumber() {

	}

	private void checkTheGivenNumberIsOddOrEven() {

		int given = 1234;

		int num = given % 2;

		if (num == 0) {
			System.out.println("Given Number Is Even");

		} else {
			System.out.println("Given Number Is Odd");
		}

	}

	private void printTheOddandEvenNumbersBetween1to10() {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number = " + i);

			} else {
				System.out.println("Odd Number = " + i);
			}
		}

	}

	private void sumOfOddOrEvenNumbersBetween1to10() {

		int given = 1234;

		int sumOfOdd = 0;
		int sumOfEven = 0;

		while (given > 0) {
			int num = given % 10;
			if (num % 2 == 0) {
				sumOfEven = sumOfEven + num;
			} else {
				sumOfOdd = sumOfOdd + num;
			}
			given = given / 10;

		}
		System.out.println("SUM OF EVEN = " + sumOfEven);
		System.out.println("SUM OF ODD = " + sumOfOdd);
	}

	private void findThePrimeNumber() {
		/**
		 * Condition: A prime number is a number that is greater than 1 Prime number can
		 * only divided by 1 and the number itself. Number is less than or equal to 1,
		 * it's not prime. Ex: If the number is 2 or 3, it is prime (since 2 and 3 are
		 * prime numbers).
		 */

		int given = 4;

		if (given < 2) {
			System.out.println("GIVEN NUMBER IS NOT A PRIME NUMBER = " + given);
		} else {

			for (int i = 2; i < given; i++) {
				if (given % i == 0) { // If divisible by any number other than 1 and itself
					System.out.println("GIVEN NUMBER IS NOT A PRIME NUMBER = " + given);
					return; // Exit the method once we find a divisor
				}
			}

			System.out.println("GIVEN NUMBER IS PRIME NUMBER = " + given);
		}
	}

	private void findTheFactorialNumberOf_5() {
		/**
		 * 5! Factorial number is 5*4*3*2*1
		 */

		int result = 1;
		for (int i = 1; i <= 5; i++) {
			result = result * i;
		}
		System.out.println("FACTORIAL OF 5! = " + result);

	}

	private void findTheFibonacciSeriesUpto_5() {

		int a = 0;
		int b = 1;

		for (int i = 1; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

	private void checkGivenNumberIsArmstrongNumber() {
		/**
		 * Example: Let's consider the number 153. It has 3 digits. 1^3 + 5 ^3 +
		 * 3^3=153. Since the sum equals the original number, 153 is an Armstrong
		 * number.
		 */

		int given = 153;
		int checkArmstrong = given;
		int result = 0;

		while (given > 0) {
			int num = given % 10;
			result = result + num * num * num;
			given = given / 10;
		}

		System.out.println(result);
		if (result == checkArmstrong) {
			System.out.println("GIVEN NUMBER IS ARMSTRONG NUMBER");

		} else {
			System.out.println("GIVEN NUMBER IS NOT A ARMSTRONG NUMBER");
		}

	}

	private void checkTheGivenNumberIsPalindromeNumber() {

		int given = 1331;
		int checkPalindrome = given;
		int result = 0;
		while (given > 0) {

			int num = given % 10;
			result = (result * 10) + num;
			given = given / 10;

		}
		if (result == checkPalindrome) {
			System.out.println("GIVEN NUMBER IS PALINDROME NUMBER = " + result);
		} else {
			System.out.println("GIVEN NUMBER IS NOT A PALINDROME NUMBER = " + result);
		}

	}

	private void checkTheGivenYearIsLeapYear() {

		int given = 2024;
		if ((given % 4 == 0 && given % 100 != 0) || given % 400 == 0) {
			System.out.println("GIVEN IS A LEAP YEAR = " + given);
		} else {
			System.out.println("NOT A LEAP YEAR = " + given);
		}

	}

	private void swapTheGivenNumbersWith3rdVariable() {

		int a = 100;
		int b = 200;

		int c = a;
		a = b;
		b = c;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

	private void swapTheGivenNumbersWithout3rdVariable() {

		int a = 100;
		int b = 200;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
