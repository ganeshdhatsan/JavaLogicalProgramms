package ImportantLogicalProgramms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class ImportantArrayLogicals {
	
		@Test
		private void getCommonValueFromGivenTwoArrayUsingForLoop() {

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

		@Test
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
				if (f == true) {
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

		@Test
		public void findTheMissingValuesInGivenArray() {
			int given[] = { 2, 4, 6, 8 };
			int maxValue = 10;

			for (int i = 1; i <= maxValue; i++) {
				boolean f = false;

				for (int j = 0; j < given.length; j++) {
					if (given[j] == i) {
						f = true;
						break;
					}
				}

				if (f == false) {
					System.out.println("Missing value: " + i);
				}
			}

		}

		@Test
		private void removeTheDuplicateValuesFromGivenSingleArray2() {
			int[] given = { 8, 9, 6, -1, 6, 4, 3, 7, 6, 1, 6 };
			int[] ans = new int[given.length];
			int count = 0;
			Arrays.sort(given);
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

		@Test
		private void getDuplicateValueFromGivenArray() {
		    int[] arr = { 3, 0, 4, 1, 2, 3, 4, 4, 7, 3, 8 };
		    Set<Integer> seen = new HashSet();
		    Set<Integer> duplicates = new HashSet();

		    for (int value : arr) {
		        if (seen.contains(value)) {
		            duplicates.add(value);
		        } else {
		            seen.add(value);
		        }
		    }
		  
		        System.out.println(duplicates);
		}
		
		@Test
		private void getDuplicatesWithoutUsingSet() {
		    int[] arr = { 3, 0, 4, 1, 2, 3, 4, 4, 7, 3, 8 };
		    
		    Map<Integer, Integer> map = new HashMap();
		    
		    for (int num : arr) {
		        map.put(num, map.getOrDefault(num, 0) + 1);
		    }
		    
		    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		        if (entry.getValue() > 1) {
		            System.out.println("Duplicate: " + entry.getKey());
		        }
		    }
		}

		
		

		@Test
		private void findMinandMaxvalue() {

//			int given [] = {5,4,3,2,1,6,7,9,8,0};
			int given[] = { 1, 0, 1, 0, 1, 1, 1 };

			int min = given[0];
			int max = given[0];

			for (int i = 0; i < given.length; i++) {
				if (given[i] < min) {
					min = given[i];
				}
				if (given[i] > max) {
					max = given[i];
				}
			}
			System.out.println("min " + min);
			System.out.println("max " + max);
		}

		@Test
		private void sortArrayAscending() {
			int[] arr = { 0, 1, -1, 0, 1, 0, 1, 1, 1, 0 };
			int tmp = 0;

			for (int i = 0; i < arr.length; i++) {

				for (int j = 0 + i; j < arr.length; j++) {

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

		@Test
		private void sortArrayDescending() {
			int[] arr = { 0, 1, -1, 0, 1, 0, 1, 1, 1, 0 };
			int tmp = 0;

			for (int i = 0; i < arr.length; i++) {

				for (int j = 0 + i; j < arr.length; j++) {

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

		@Test
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

		@Test
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

		@Test
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

		@Test
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

		@Test
		public void checkGivenTwoArrayAreEqualOrNot() {
			int[] array1 = { 1, 2, 3, 4, 8 };
			int[] array2 = { 8, 1, 2, 3, 4, 6 };
			Arrays.sort(array1);
			Arrays.sort(array2);
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

		@Test
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

}
