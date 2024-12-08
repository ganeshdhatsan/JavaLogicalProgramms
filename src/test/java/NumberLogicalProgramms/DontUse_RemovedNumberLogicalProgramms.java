package NumberLogicalProgramms;

import java.util.Arrays;

public class DontUse_RemovedNumberLogicalProgramms {
	private void sortTheGivenNumbers() {

		int num = 741807010;
		String strnum = String.valueOf(num);
		char[] charArray = strnum.toCharArray();
		Arrays.sort(charArray);
		for (char c : charArray) {
			System.out.println(c);
		}

	}

private void findThePrimeNumberCopy() {
		/**
		 * Condition: A prime number is a number that is greater than 1 Prime number can
		 * only divided by 1 and the number itself. Number is less than or equal to 1,
		 * it's not prime. Ex: If the number is 2 or 3, it is prime (since 2 and 3 are
		 * prime numbers).
		 */

		int given = 1;
		int count = 0;
		for (int i = 2; i * i <= given; i++) {
			if (given % i == 0) {
				count++;
				break;
			}

		}
		if (count == 0) {
			System.out.println("GIVEN NUMBER IS PRIME NUMBER = " + given);

		} else {

			System.out.println("GIVEN NUMBER IS NOT A PRIME NUMBER = " + given);
		}

	}

}
