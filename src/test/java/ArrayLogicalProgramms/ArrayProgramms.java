package ArrayLogicalProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayProgramms {

	private void getCommonValuesFromGivenTwoArrayUsingForLoop() {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr1.length; j++) {

				if (arr2[i] == arr1[j]) {

					System.out.print(arr2[i] + " ");
				}
			}
		}
		System.out.println();
	}

	private void getUnCommonValueFromGivenTwoArrayUsingForLoop() {
		int[] arr1 = { 1, 2, 3, 4, 5, 9 };
		int[] arr2 = { 5, 8, 4, 6, 2, 7 };

		for (int i = 0; i < arr1.length; i++) {
			boolean f = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					f = true;
				}

			}
			if (f == false) {
				System.out.println(arr1[i]);

			}
		}
		System.out.println("------");
		for (int i = 0; i < arr2.length; i++) {
			boolean f = false;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					f = true;
				}
			}
			if (f == false) {
				System.out.println(arr2[i]);
			}
		}

	}

	private void removeTheDuplicateValuesFromGivenSingleArray2() {
		int[] given = { 8, 9, 6, -1, 6, 4, 3, 7, 6, 1 };
		int[] ans = new int[given.length];
		int count = 0;

		for (int i = 0; i < given.length; i++) {
			boolean f = false;
			for (int j = 0; j < count; j++) {
				if (given[i] == ans[j]) {
					f = true;
					break;
				}
			}

			if (f == false) {
				ans[count] = given[i];
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.println(ans[i]);
		}
	}

	private void getTheDuplicateValuesFromGivenSingleArray() {
		int[] given = { 8, 9, 6, -1, 6, 4, 3, 6, 7, 6, 1 };
		Arrays.sort(given);
		int i, j, frequency;

		for (i = 0; i < given.length; i++) {
			frequency = 1;
			for (j = i + 1; j < given.length; j++) {
				if (given[j] == given[i]) {
					frequency++;
				} else {
					break;
				}
			}
			i = j - 1;
			if (frequency > 1) {
				System.out.println(given[i] + " --> " + frequency);
			}

		}
	}

	private void getDuplicateValueFromGivenArray_DontUse() {

		int[] arr = { 5, 8, 2, 3, 4, 1, 9, 7, 5, 2, 3, 1 };
		List<Integer> li = new ArrayList<>();
		for (Integer value : arr) {

			if (!li.contains(value)) {
				li.add(value);
			} else {
				System.out.println(value);
			}

		}

	}

	private void sortTheGivenArrayInAscendingOrder() {
		int[] arr = { 0, 1, -1, 0, 1, 0, 1, 1, 1, 0 };
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 0; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	private void sortTheGivenArrayInDescendingOrder() {
		int[] arr = { 0, 1, -1, 0, 1, 0, 1, 1, 1, 0 };
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 0; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	private void sortArrayAscendingExplanation() {

//		int[] arr = { 0, 1, 1, 0, 1, 0, 1, 1, 1, 0 };

		int[] arr = { 8, 9, 6, -1, 6, 4, 3, 7, 6, 1 };
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("---outer loop " + i + "-----");
			for (int j = i + 0; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					System.out.println("inner loop " + j);
					System.out.println("arr[i] " + arr[i]);
					System.out.println("arr[j] " + arr[j]);
					tmp = arr[i];
					System.out.println("temp " + arr[i]);
					arr[i] = arr[j];
					System.out.println("arr[i] " + arr[i]);
					arr[j] = tmp;
					System.out.println("arr[j] " + arr[j]);

				}
			}
			System.out.println("---outer ends-----");
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	private void findMaximumAndMinimumNumberFromGivenArray() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int maxvalue = a[0];
		int minvalue = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxvalue) {
				maxvalue = a[i];
			}
			if (a[i] < minvalue) {
				minvalue = a[i];
			}
		}
		System.out.println(maxvalue);
		System.out.println(minvalue);
	}

	private void findSecondMinimumFromGivenArray() {

		int[] arr = { 5, 9, 3, 7, 6, 4 };
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 0; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr[1]);

	}

	private void findSecondMaximumFromGivenArray() {

		int[] arr = { 5, 9, 3, 7, 6, 4 };
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 0; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);

	}

	private void removeSpecificValueFromArray() {

		int[] given = { 10, 20, 30, 40, 50, 60, 70 };

		int[] ans = new int[given.length - 1];

		int count = 0;
		for (int i = 0; i < given.length; i++) {
			if (given[i] != 70) {
				ans[count] = given[i];
				count++;
			}

		}
		for (int i = 0; i < count; i++) {
			System.out.println(ans[i]);
		}
	}

	private void removeSpecificIndexValueFromArray() {
// 2nd index remove
		int[] given = { 10, 20, 30, 40, 50, 60, 70 };

		int[] ans = new int[given.length - 1];

		int count = 0;
		for (int i = 0; i < given.length; i++) {
			if (i != 2) {
				ans[count] = given[i];
				count++;
			}

		}
		for (int i = 0; i < count; i++) {
			System.out.println(ans[i]);
		}
	}

	private void MergeTwoGivenArray() {

		int given1[] = { 4, 5, 8, 2, 7 };
		int given2[] = { 4, 6, 3, 9, 1 };

		int result[] = new int[given1.length + given2.length];

		int count = 0;
		for (int ans1 : given1) {

			result[count] = ans1;
			count++;
		}
		for (int ans2 : given2) {
			result[count] = ans2;
			count++;
		}
		Arrays.sort(result);
		for (int x : result) {
			System.out.println(x);
		}

	}

	public void findTheMissingValuesInGivenArrayUpto_10_Numbers() {
		int given[] = { 2, 4, 6, 8 };
		int maxValue = 10;

		for (int i = 1; i <= maxValue; i++) {
			boolean found = false;

			for (int j = 0; j < given.length; j++) {
				if (given[j] == i) {
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Missing value: " + i);
			}
		}

	}

	public void checkGivenTwoArrayAreEqualOrNot() {
		int[] array1 = { 1, 2, 3, 4, 8 };
		int[] array2 = { 1, 2, 3, 4, 8 };

		if (array1.length == array2.length) {

			for (int i = 0; i < array1.length; i++) {

				if (array1[i] != array2[i]) {
					System.out.println("Given two arrays are not equal.");
					return; // Exit the method early
				}
			}

			System.out.println("Given two arrays are equal.");
		} else {

			System.out.println("Given two arrays are not equal.");
		}
	}

	private void findTheSecondMostSignificantValueFromGivenArray() {

		int[] sortedArray = { 1, 2, 3, 4, 5 };

		int[] sortedArray2 = { 10, 20, 30 };

		// Check if the array has less than 2 elements
		if (sortedArray == null || sortedArray.length < 2) {
			System.out.println("Array doesn't have enough elements to find the second most significant.");
			return;
		}

		// In a sorted array, the second most significant element is the second to last
		// element
		int secondMostSignificant = sortedArray[sortedArray.length - 2];

		// Print the second most significant element
		System.out.println("Second most significant element: " + secondMostSignificant);

	}
}
