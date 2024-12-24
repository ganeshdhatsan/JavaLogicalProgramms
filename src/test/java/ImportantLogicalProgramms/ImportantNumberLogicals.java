package ImportantLogicalProgramms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ImportantNumberLogicals {
	
		@Test
		private void countTheGivenNumbers() {
			int given = 1;
			int count = 0;
			while (given > 0) {
				count++;
				given = given / 10;

			}
			System.out.println(count);
		}

		@Test
		private void reverseTheGivenNumber() {

			int given = 123;

			int result = 0;

			while (given > 0) {

				int num = given % 10;
				System.out.println("result " + result + " num " + num);
				result = (result * 10) + num;
				System.out.println(result);
				given = given / 10;

			}
			System.out.println(result);
		}

		@Test
		private void sortTheGivenNumbers() {

			int num = 741807010;
			String res = "";
			String strnum = String.valueOf(num);
			char[] charArray = strnum.toCharArray();
			Arrays.sort(charArray);
			for (char c : charArray) {
				res = res + c;

			}
			System.out.println(res);
			System.out.println(Integer.parseInt(res));
		}

		@Test
		private void findThePrimeNumber() {
			/**
			 * Condition: A prime number is a number that is greater than 1 Prime number can
			 * only divided by 1 and the number itself. Number is less than or equal to 1,
			 * it's not prime. Ex: If the number is 2 or 3, it is prime (since 2 and 3 are
			 * prime numbers).
			 */

			int sum = 4;
			if (sum < 2) {
				System.out.println("not a prime");
				return;
			}

			boolean isPrime = false;
			for (int j = 2; j <= sum / 2; j++) {
				if (sum % j == 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime == false) {
				System.out.println(sum + " = is prime");
			} else {
				System.out.println(sum + " = not a prime");
			}
		}

		@Test
		private void first10PrimeNumbers() {

			for (int i = 2; i <= 15; i++) {

				if (i < 2) {
					System.out.println("not a prime");
					return;
				}

				boolean isPrime = false;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						isPrime = true;
						break;
					}
				}
				if (isPrime == false) {
					System.out.println(i + " = is prime");
				} else {
					System.out.println(i + " = not a prime");
				}

			}

		}

		@Test
		private void sumOfTwoDigitItsAndCheckPrimeOrNot() {
			for (int i = 100; i < 1000; i++) {
				int num = i;
				int sum = 0;
				while (num > 0) {
					int digit = num % 10;
					sum += digit;
					num /= 10;
				}
				if (sum < 2) {
					continue;
				}

				boolean isPrime = true;
				for (int j = 2; j <= sum / 2; j++) {
					if (sum % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(i + " Sum of digits: " + sum + " is prime");
				}
			}
		}

		@Test
		private void factorialNumberOf1to5() {
			/**
			 * 5! Factorial number is 5*4*3*2*1
			 */

			int result = 1;
			for (int i = 1; i <= 5; i++) {
				result = result * i;
			}
			System.out.println("FACTORIAL OF 5! = " + result);

		}

		@Test
		private void findFibonacciSeriesUpto5() {
			int a = 0;
			int b = 1;
			for (int i = 1; i <= 5; i++) {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}

		}

		@Test
		private void printArmstrongNumberofGivenNumber() {
			/**
			 * Example: Let's consider the number 153. It has 3 digits. 1^3 + 5 ^3 +
			 * 3^3=153. Since the sum equals the original number, 153 is an Armstrong
			 * number.
			 */

			int given = 1634;
			int checkArmstrong = given;
			int result = 0;

			while (given > 0) {
				int num = given % 10;
				result = result + num * num * num * num;
				given = given / 10;
			}

			System.out.println(result);
			if (result == checkArmstrong) {
				System.out.println("GIVEN NUMBER IS ARMSTRONG NUMBER");

			} else {
				System.out.println("GIVEN NUMBER IS NOT A ARMSTRONG NUMBER");
			}

		}

		@Test
		private void checkGivenNumberIsPalindromeNumber() {

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

		@Test
		private void checkLeapYear() {

			int given = 2024;
			if ((given % 4 == 0 && given % 100 != 0) || given % 400 == 0) {
				System.out.println("GIVEN IS A LEAP YEAR = " + given);
			} else {
				System.out.println("NOT A LEAP YEAR = " + given);
			}

		}

		@Test
		private void checkTheGivenNumberOddOrEven() {

			int given = 1234;

			int num = given % 2;

			if (num == 0) {
				System.out.println("Given Number Is Even");

			} else {
				System.out.println("Given Number Is Odd");
			}

		}

		@Test
		private void printOddOrEvenNumberBTW1to10() {

			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0) {
					System.out.println("Even Number = " + i);

				} else {
					System.out.println("Odd Number = " + i);
				}
			}

		}

		@Test
		private void sumOfOddOrEvenNumberBTW1to10() {

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

		@Test
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

		@Test
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

		@Test
		private void squareValueOfTheGivenNumber() {
			int given = 12;

			int res = given * given;
			System.out.println(res);

		}

		@Test
		private void swapTheGivenNumberswith3rdVariable() {

			int a = 100;
			int b = 200;

			int c = a;
			a = b;
			b = c;
			System.out.println("A = " + a);
			System.out.println("B = " + b);
		}

		@Test
		private void swapTheGivenNumberswithoutVariable() {

			int a = 100;
			int b = 200;

			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("A = " + a);
			System.out.println("B = " + b);
		}

		@Test
		private void Take4DigitNumberSeriesSumEquals23() {
			// Take 4 digit num series , sum of digits wants 23
			for (int i = 1000; i < 10000; i++) {
				int sum = 0;
				int num = i; // Preserve the original value of i

				while (num > 0) {
					int digit = num % 10;
					sum = sum + digit;
					num = num / 10;
				}

				if (sum == 23) {
					System.out.println(i);
				}
			}
		}


}
