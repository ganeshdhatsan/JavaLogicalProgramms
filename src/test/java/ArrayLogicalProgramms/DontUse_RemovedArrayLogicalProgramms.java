package ArrayLogicalProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DontUse_RemovedArrayLogicalProgramms {

	
	private void getCommonValueFromGivenTwoArrayUsingSet() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		Set<Integer> commonElements = new HashSet<Integer>();

		Set<Integer> set1 = new HashSet<Integer>();

		for (int num : arr1) {
			set1.add(num);
		}

		for (int num : arr2) {
			if (set1.contains(num)) {
				commonElements.add(num);
			}
		}

		System.out.println("Common elements: " + commonElements);
	}

private void removeTheDuplicateValuesFromGivenSingleArray() {

		int[] given = { 8, 9, 6, -1, 6, 4, 3, 7, 6, 1 };
		int temp = 0;
		int[] ans = new int[given.length];
		Arrays.sort(given);// -1134666789

		for (int i = 0; i < given.length - 1; i++) {
			if (given[i] != given[i + 1]) {
				ans[temp] = given[i];
				temp++;
			}

		}
		ans[temp] = given[given.length - 1];

		for (int i = 0; i <= temp; i++) {
			System.out.println(ans[i]);
		}

	}

	

	private void sortArrayAscendingDuplicate() {
		int[] g = { 8, 9, 6, -1, 6, 4, 3, 7, 6, 1 };

		for (int i = 0; i < g.length -1; i++) {
			for (int j = 0; j < g.length -1 - i; j++) {
				if (g[j] > g[j + 1]) {
					// Swap if the current element is greater than the next
					int temp = g[j];
					g[j] = g[j + 1];
					g[j + 1] = temp;
				}
			}
		}
		for (int num : g) {
			System.out.print(num + " ");
		}

	}
	private void findSecondMinimumFromGivenArrayIfDuplicates() {
		// int[] arr = { 0, 1, -1, 0, 1, 0, 1, 1, 1, 0 };
		int[] arr = { 5, 8, 2, 3, 4, 1, 9, 7, 5, 2, 3, 1 };
		List<Integer> li = new ArrayList<>();

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
		for (Integer value : arr) {
			if (!li.contains(value)) {
				li.add(value);

			}

		}
		System.out.println(li);
		System.out.println(li.get(1));

	}

	private void FindMaximumAndMinimumFromGivenArray() {

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
		System.out.println("MINIMUM = " + arr[0]);
		System.out.println("MAXIMUM = " + arr[arr.length - 1]);

	}

}
