package AllLogicalProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import ChracterLogicalProgramms.CharacterProgramms;
import StringLogicalProgramms.StringProgramms;

public class AllLogicalProgramms {

	/////////////////////////// array programms ///////////////////////////

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

	private void removeTheDuplicateValuesFromGivenSingleArray() {
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

	private void removeDuplicateChractersInString() {
		String name = "selenium";
		char[] given = name.toCharArray();
		char[] result = new char[given.length]; // Use char[] instead of int[] for storing characters
		int count = 0;

		for (int i = 0; i < given.length; i++) {
			boolean ans = false;
			for (int j = 0; j < count; j++) {
				if (given[i] == result[j]) {
					ans = true; // Mark as duplicate if the character already exists in result
					break;
				}
			}
			if (!ans) { // If not a duplicate, add the character to result
				result[count] = given[i];
				count++;
			}
		}

		// Print unique characters
		for (int i = 0; i < count; i++) {
			System.out.println(result[i]);

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

	@Test
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

	@Test
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

	//////////////////////// string programms /////////////////////////////

	private void reverseTheGivenString() {
		String given = "ganesh";
		String result = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			char c = given.charAt(i);
			result = result + c;
		}
		System.out.println("reverse the given string " + result);
	}

	// 18
	private void reverseTheGivenStringWithSpace() {
		String given = "ganesh kumar";
		String result = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			char c = given.charAt(i);
			result = result + c;
		}
		result = result + " ";
		System.out.println("reverse the given string with space " + result);
	}

//19
	private void reverseEachWordWithoutChangingOrder() {
		String given = "ganesh kumar";
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {

			for (int i = single.length() - 1; i >= 0; i--) {
				char c = single.charAt(i);
				result = result + c;
			}
			result = result + " ";
		}
		System.out.println("reverse Each Word Without Changing Order " + result);
	}

	// 20
	private void reverseOnlyTheSpecificWordFromTheGivenString() {
		String given = "my name is ganesh kumar";// my name is hsenag kumar
		String[] split = given.split(" ");
		String result = "";
		for (int i = 0; i < split.length; i++) {
			if (split[i].equalsIgnoreCase("ganesh")) {
				for (int j = split[i].length() - 1; j >= 0; j--) {
					char c = split[i].charAt(j);
					result = result + c;
				}
				result = result + " ";
			} else {
				result = result + split[i] + " ";
			}
		}

		System.out.println("reverseOnlyTheSpecificWordfromtheGivenString " + result.trim());
	}

//	@Test
//	private void reverseAlternateWordFromGivenString() {
//	    String given = "my_name_is_ganesh_kumar"; // Expected output: my_eman_is_hsenag_kumar
//
//	    // Split the string by underscore
//	    String[] split = given.split("_");
//	    String result = "";
//
//	    for (int i = 0; i < split.length; i++) {
//	        if (i % 2 != 0) {
//	            // Reverse the string manually
//	            String answer = "";
//	            for (int j = split[i].length() - 1; j >= 0; j--) {
//	            	char c=split[i].charAt(j);
//	            	answer = answer+c;
//	            }
//	            result = result+ answer;
//	        } else {
//	            // Append the word as is
//	            result =result+ split[i];
//	        }
//	        // Add underscore if not the last word
//	        if (i < split.length - 1) {
//	            result = result+"_";
//	        }
//	    }
//
//	    // Print the final result
//	    System.out.println(result);
//	}
	@Test
	private void reverseAlternateWordFromGivenStringOriginal() {
		String given = "my name is ganesh kumar"; // Expected output: my_eman_is_hsenag_kumar

		// Split the string by underscore
		String[] split = given.split(" ");
		String result = "";

		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				// Reverse the string manually
				String answer = "";
				for (int j = split[i].length() - 1; j >= 0; j--) {
					char c = split[i].charAt(j);
					answer = answer + c;
				}
				result = result + answer + " ";
			} else {
				// Append the word as is
				result = result + split[i] + " ";
			}

		}

		// Print the final result
		System.out.println(result);
	}

	@Test
	private void reverseGivenLongStringWithSpace() {
		String given = "I love India.I work in IT MNC.I work in IT wipro";
		String ans = "";
		String[] splits = given.split("\\.");
		for (int i = splits.length - 1; i >= 0; i--) {
			ans = ans + splits[i];
			if (i != 0) {
				ans = ans + ".";
			}
		}
		System.out.println(ans);
	}

	// 21
	private void swappingTheGivenString() {
		String given = "ganesh kumar";
		String result = "";
		String[] split = given.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			result = result + split[i] + " ";
		}
		System.out.println("swappingTheGivenString " + result);
	}

//22
	private void swapTheFirstAndLastCharacterOfGivenString() {

		String given = "GaneshKumar";// raneshKumG
		String result = "";
		int length = given.length();
		char firstChar = given.charAt(0);
		char lastChar = given.charAt(length - 1);
		String middle = given.substring(1, length - 2);
		result = lastChar + middle + firstChar;
		System.out.println("swapTheFirstAndLastCharacterOfGivenString " + result);
	}

//23
	private void printFirstCharacterOfEachwordFromGivenString() {

		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			char c = single.charAt(0);
			System.out.println("first character of each word " + c);
		}
	}

//24
	private void createAStringUsingFirstCharacterOfEachWord() {
		String given = "ganesh plays criket good";
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			char c = single.charAt(0);
			result = result + c;
		}
		System.out.println("create A String Using First Character Of Each Word " + result);
	}

//25
	private void printFirstTwoCharactersOfGivenString() {
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {

			String result = single.substring(0, 2);
			System.out.println("printFirstTwoCharactersOfGivenString " + result);
		}
	}

//26
	private void printOnlyAWordStartsWithCFromTheGivenString() {
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.startsWith("c")) {
				System.out.println("printOnlyAWordStartsWithCFromTheGivenString " + single);
			}

		}
	}

//27
	private void printOnlyAWordEndsWithshFromTheGivenString() {
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.endsWith("sh")) {
				System.out.println("printOnlyAWordStartsWithCFromTheGivenString " + single);
			}
		}
	}

//28
	private void printOnlyAwordHavingacharacterAfromTheGivenString() {
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.contains("a")) {
				System.out.println("printOnlyAwordHavingacharacterAfromTheGivenString " + single);
			}

		}
	}

//29
	private void printOnlyAWordContainsFourcharacterfromTheGivenString() {
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.length() == 4) {
				System.out.println("printOnlyAWordContainsFourcharacterfromTheGivenString " + single);
			}
		}
	}

//30
	private void printTheSpecialwordContainsFirstAndlastCharacterSame() {
		String given = "mom went to her dad home ";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.charAt(0) == single.charAt(single.length() - 1)) {
				System.out.println("printTheSpecialwordContainsFirstAndlastCharacterSame " + single);
			}

		}
	}

//31
	private void printTheLongestWordFromTheGivenString() {
		String given = "my name is ganesh kumar and working as a seniorsoftware test engineer";
		String[] split = given.split(" ");
		String ans = "";
		for (int i = 0; i < split.length - 1; i++) {
			if (split[i].length() > split[i + 1].length()) {
				ans = split[i];
			}

		}
		if (ans.length() > split[split.length - 1].length()) {
			System.out.println("printTheLongestWordFromTheGivenString " + ans);
		} else {
			System.out.println("printTheLongestWordFromTheGivenString " + split[split.length - 1]);
		}
	}

//32
	private void createANewWordFromtheGivenString() {
		String given = "my name is ganesh kumar";// use manish instead of ganesh
		String replace = given.replace("ganesh", "manish");
		System.out.println("createANewWordFromtheGivenString " + replace);
	}

	// 33
	private void countTheOccuranceOfEachCharacterFromTheString() {
		String given = "ganeshkumar";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}

		}
		System.out.println("countTheOccuranceOfcharacterFromTheString " + map);
	}

	// 34
	private void removeDuplicateChracterfromGivenString() {
		String given = "ganeshkumar";
		String result = "";
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			set.add(c);
		}
		for (Character character : set) {
			result = result + character;
		}
		System.out.println("removeduplicateChracterfromGivenString  " + result);

	}

	// 35
	private void findTheDuplicateCharactersAndItsCountFromTheGivenString() {

	}

	// 36
	private void changeTheCaseOfEachAlternateWordFromGivenString() {
		String input = "my name is ganesh kumar";// my NAME is GANESH kumar
		String[] words = input.split(" ");
		String result = "";
		String ans = null;

		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) { // Check if index is even
				ans = words[i].toLowerCase() + " "; // Convert to lowercase
				result = result + ans;
			} else {
				ans = words[i].toUpperCase() + " "; // Convert to uppercase
				result = result + ans;
			}
		}

		System.out.println("changeCaseToAlternateWordFromGivenString " + result.trim());
	}

	// 37
	private void convertEachwordFirstLetterMustbeUppercaseremainingLowerCasefromGivenString() {
		String given = "my name is ganesh kumar";// My Name Is Ganesh Kumar
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			char upperCase = Character.toUpperCase(single.charAt(0));
			single = upperCase + single.substring(1);
			result = result + single + " ";
		}
		System.out.println("convertEachwordFirstLetterMustbeUppercaseremainingLowerCasefromGivenString " + result);

	}

	private void checkGivenStringIsPalindrom() {
		String s = "malayalam";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			s1 = s1 + c;
		}
		if (s1.equals(s)) {
			System.out.println("palin");
		} else {
			System.out.println("no palin");
		}
	}

	private void swapTwostringWithout3rdString() {// 5
		String str1 = "ganesh ";
		String str2 = "kumar ";
		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
	}

	private void swapTwostringWith3rdString() {// 6
		String str1 = "ganesh";
		String str2 = "kumar";
		String temp;
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println(str1);
		System.out.println(str2);
	}

	private void getTheSpecificCharacter() {// 7
		String s1 = "sdfghjkjhgfsruytrdxcvjjjgf";
		int indexOf = s1.indexOf('y');
		char charAt = s1.charAt(indexOf);
		System.out.println(charAt);
	}

	private void removeMiddleSpaceinString() {// 8
		String s4 = "gan esh ku mar";
		String s5 = s4.replaceAll(" ", "");
		System.out.println(s5);
	}

	private void removeNullValuesinMap() {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("RED", "#FF0000");
		map.put("BLACK", null);
		map.put("BLUE", "#0000FF");
		map.put("GREEN", "#008000");
		map.put("WHITE", null);
		map.put(null, "mani");
		/*
		 * while (map.values().remove(null)); System.out.println(map);
		 * while(map.keySet().remove(null)); System.out.println(map);
		 */
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if ((entry.getValue()) != null) {
				System.out.println(entry);
			}
		}
	}

	private void removeAllExceptAlphabetsinString() {// 9
		String str = "This#string%contains90^special*characters&.':;/<|@#";
		str = str.replaceAll("[^a-zA-Z]", " ");// to filter(^)only a-z&A-Z
		System.out.println(str);
	}

	private void removeAllExceptNumericsinString() {// 10
		String str = "This#string%contains90^special*characters&.':;/<|@#";
		str = str.replaceAll("[^0-9]", "");// to filter(^)only 0-9
		System.out.println(str);
	}

	/*
	 * private void removeSpecialCharactersinString() { String s =
	 * "gan1234567890!@#$$%^&(+_)(&-= {]|?>/esh@#$%&*&%$kumar"; String s1 = ""; for
	 * (int i = 0; i < s.length(); i++) { char c = s.charAt(i); if(c>96 &&c<122) {
	 * s1 = s1+c;}} System.out.println(s1); }
	 */
	private void removeSingleCharacterFromString() {// 11
		String s = "ganeshkumar";
		int let = s.indexOf('k');
		System.out.println(let);
		String s1 = s.substring(0, let);
		String s2 = s.substring(let + 1);
		String s3 = s1 + s2;
		System.out.println(s3);
	}

	private void remove1standLastCharacter() {// 12
		String s = "ganeshkumar";
		String substring = s.substring(1, s.length() - 1);
		System.out.println(substring);
	}

	private void remove1stand5thCharacter() {// 13
		String s = "ganeshkumar";
		String s1 = s.substring(0, 4);
		String s2 = s.substring(5);
		String s3 = s1 + s2;
		String s4 = s3.substring(1);
		System.out.println(s4);
	}

	private void removeSpacesandRemove1standlastCharacter() {// 14
		String s1 = " ganesh kumar ";
		String replaceAll = s1.replaceAll(" ", "");
		String substring = replaceAll.substring(1, replaceAll.length() - 1);
		System.out.println(substring);
	}

	private void getASingleCharacterinString() {// 15
		String s = "ganeshkumar";// get 's' only
		int s1 = s.indexOf('s');
		char c = s.charAt(s1);
		System.out.println(c);
	}

	@Test
	private void getTheDuplicateCharacters() {// 16
		System.out.println("getTheDuplicateCharacters");
		String str = "javaprogramm";
		char[] c = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					System.out.println(c[i]);

				}
			}
		}
	}

	private void removeDuplicatesInString() {// 17
		String given = "logical programm";
		String result = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (map.containsKey(c)) {
			} else {
				map.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			result = result + key;
		}
		System.out.println(result);
	}

	private void getMaximumRepetedCharInString() {// 18
		String s = "logicalprogramm";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}
		}

		Integer max = Collections.max(map.values());
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == max) {
				Character key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println("max repeated char " + key);
				System.out.println("repeated times " + value);
			}
		}
	}

	private void getMinimumRepetedCharInString() {// 19
		String s = "logicalprogramm";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}
		}
		Integer min = Collections.min(map.values());
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == min) {
				Character key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println("min repeated char " + key);
				System.out.println("repeated times " + value);
			}
		}
	}

	private void getVowelsFromTheString() {// 20
		String s = "java";
		Map<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == '0' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				if (map.containsKey(c)) {
					Integer integer = map.get(c);
					map.put(c, integer + 1);
				} else {
					map.put(c, 1);
				}
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

	private void findtheOccurancecountsofindividualcharacter() {// 21
		String s = "JaVA123@oracle.com*ismyDefaultemailIdforGIT&jirainMYproJect9840";

		int[] given = { 1, 2, 4, 6, 7 };

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

		System.out.println("************************************************");

		int[] given1 = { 1, 2, 4, 6, 7 };

		Map<Integer, Integer> map1 = new LinkedHashMap<>();

		for (int i = 0; i < given1.length; i++) {

			if (map1.containsKey(given1[i])) {

				Integer integer = map1.get(given1[i]);

				map1.put(given1[i], integer + 1);

			} else {

				map1.put(given1[i], 1);
			}
		}
		System.out.println(map1);

	}

	private void findtheOccuranceCountsofEashCasesInString() {// 22
		String s = "JaVA123@oracle.com*ismyDefaultemailIdforGIT&jirainMYproJect9840";
		int smallCount = 0;
		int capsCount = 0;
		int numberCount = 0;
		int specialCharCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				smallCount++;
			} else if (c >= 'A' && c <= 'Z') {
				capsCount++;
			} else if (c >= '0' && c <= '9') {
				numberCount++;
			} else {
				specialCharCount++;
			}
		}
		System.out.println("smallCount " + smallCount);
		System.out.println("capsCount " + capsCount);
		System.out.println("specialCharCount " + specialCharCount);
		System.out.println("numberCount " + numberCount);
	}

	private void removeAllSpacesFromGivenString() {
		String given = "ganesh kumar";
		String removeSpace = given.replaceAll(" ", "");
		System.out.println("remove space from given string " + removeSpace);
	}

	@Test
	private void getTheOccurenceOfSpecificCharacterAndItsRepeatation() {
		String given = "ganeshkumar";
		// find the occurence of 'a'
		int totalLength = given.length();
		int afterLength = given.replaceAll("a", "").length();
		int occurence = totalLength - afterLength;
		System.out.println("occurence " + occurence);

	}

	private void getTheOccurenceOfSpecificCharacterAndRepeatedTimes() {
		String s = "ganeshkumar";
		char search = 'a';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == search) {
				count++;
			}
		}
		System.out.println("search char is  " + search + "  repeated time is  " + count);
	}

//	@Test
//	private void getCharacterWithRepeatedCountAsASameString() {
//		String given = "abbcccdddeeee";// a1b2c3d3e4
//		String result = "";
//		int count = 1;
//
//		for (int i = 0; i < given.length() - 1; i++) {
//
//			if (given.charAt(i) == given.charAt(i + 1)) {
//				count++;
//			} else {
//
//				result = result + given.charAt(i) + Integer.toString(count);
//				count = 1;
//			}
//		}
//		result = result + given.charAt(given.length() - 1) + Integer.toString(count);
//
//		System.out.println(result);
//	}

	@Test
	private void method() {
		String name = "adbccbdacb";
		String res = "";
		for (int i = 0; i < name.length(); i++) {
			char currentChar = name.charAt(i);
			if (currentChar == ' ') {
				continue; // Skip already processed characters (replaced with spaces)
			}
			int count = 1;
			for (int j = i + 1; j < name.length(); j++) {
				if (currentChar == name.charAt(j)) {
					count++;
					name = name.substring(0, j) + " " + name.substring(j + 1);
					// Replace with space for already matched character
					// By replacing the character with a space, the string length remains the same,
					// which avoids complications with index adjustments in the loops.
				}
			}
			res = res + currentChar + Integer.toString(count); // Append character and its count
		}

		System.out.println(res);
	}

	public void sortTheMapByValueNotByKey() {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 50);
		map.put("banana", 20);
		map.put("cherry", 70);
		map.put("date", 30);

		// Create a list from the map's entry set
		List<Map.Entry<String, Integer>> entryList = new ArrayList(map.entrySet());

		// Sort the list based on values using a custom comparator
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
				return entry1.getValue().compareTo(entry2.getValue());
			}
		});

		// Create a LinkedHashMap to store the sorted entries
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		// Print the sorted map
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	/////////////////////// character programms
	/////////////////////// ////////////////////////////////////////

	private void validateBelow() {
		String test = 'a' + "b";
		System.out.println("test_1 " + test); // ab
//		String test ='a'+'b';// specify the error
//		System.out.println("test_2 "+test);
	}

	@Test
	private void printASSCIIValuesOfGivenString() {
		String given = "GaneshKumar";
		int countOfASSCII = 0;
		for (int i = 0; i < given.length(); i++) {
			char singleChars = given.charAt(i);
			int asscii = (int) singleChars;
			System.out.println("ASSCII of " + singleChars + " " + asscii);
			// count
			countOfASSCII = countOfASSCII + asscii;
		}
		System.out.println("countOfASSCII " + countOfASSCII);
	}

	private void printOnlyUppercasefromTheGivenString() {
		String given = "GaneshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println("UpperCase " + c);
			}
		}
	}

	private void printOnlyLowerCaseFromTheGivenString() {
		String given = "GaneshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLowerCase(c)) {
				System.out.println("lowercase " + c);
			}

		}
	}

	private void printOnlyDigitsFromGivenString() {
		String given = "376ga467nesh3456Kum098ar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isDigit(c)) {
				System.out.println("digits " + c);
			}
		}
	}

	private void printOnlyDigitAndletter() {
		String given = "dfyu34(*&^56@#$%dfgh^&cg4567fvh";
		for (int i = 0; i < given.length(); i++) {

			char c = given.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				System.out.println("letter or digit " + c);
			}
		}
	}

	private void countOnlyTheUpperCaseInGivenString() {

		String given = "GaneSHkuMaR";
		int count = 0;
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println("Count of Uppercase from the given string " + count);
	}

	private void countOnlyTheLowerCaseInGivenString() {
		String given = "GaneSHkuMaR";
		int count = 0;
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLowerCase(c)) {
				count++;
			}
		}
		System.out.println("Count of Lowercase from the given string " + count);
	}

	private void countOnlyTheDigitsInGivenString() {
		String given = "dfyu34(*&^56@#$%dfgh^&cg4567fvh";
		int count = 0;
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isDigit(c)) {
				count++;
			}

		}
		System.out.println("count Only TheDigits In Given String " + count);

	}

	private void findTheSpecificCharacterCountIntheGivenstring() {
		String given = "Ganesh Kumar is A Senior Automation Test Engineer";
		int count = 0;
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			char upperCase = Character.toUpperCase(c);
			if (upperCase == 'S') {
				count++;
			}
		}
		System.out.println("Occurence Count of given character s is " + count);
	}

	private void printOnlyVowelsFromGivenString() {
		String given = "ganeshkumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			char lowerCase = Character.toLowerCase(c);
			if (lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u') {
				System.out.println("Vowel from given string " + lowerCase);
			}

		}
	}

	private void createNewStringhavingOnlyUpperCaseFromGivenString() {
		String given = "My Name Is Ganesh Kumar 786";
		String result = "";
		String ans = "";
		String digit = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isUpperCase(c)) {
				result = result + c;
			}
			if (Character.isLowerCase(c)) {
				ans = ans + c;
			}
			if (Character.isDigit(c)) {
				digit = digit + c;
			}
		}
		System.out.println("New String Created with only Uppercase " + result);
		System.out.println("New String Created with only Lowercase " + ans);
		System.out.println("New String Created with only Digits " + digit);
	}

	private void createStringStartingWithNumericFromGivenString() {
		String given = "My Name Is Ganesh Kumar 786";
		String alpha = "";
		String digit = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isDigit(c)) {
				digit = digit + c;
			} else {
				alpha = alpha + c;
			}
		}
		String ans = digit + " " + alpha;
		System.out.println("create String Starting With Numeric From Given String  " + ans);
	}

	private void removeAllSpacesFromGivenString1() {
		String given = "ganesh kumar";
		String ans = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (!Character.isWhitespace(c)) {
				ans = ans + c;
			}
		}
		System.out.println("remove space from given string " + ans);
	}

	private void convertLowercaseToUppercaseAndUppercaseTolowercaseFromGivenstring() {
		String given = "GaneshKumarSoftwareEngineer";
		String result = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isUpperCase(c)) {
				char lowerCase = Character.toLowerCase(c);
				result = result + lowerCase;
			} else {
				char upperCase = Character.toUpperCase(c);
				result = result + upperCase;
			}

		}
		System.out.println("convertLowercaseToUppercaseAndUppercaseTolowercaseFromGivenstring " + result);
	}

	////////////////////// number programms ///////////////////////////////

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

	@Test
	private void findPrimeNumbersUpTo10() {
		for (int i = 2; i <= 10; i++) {
			int count = 0;
			System.out.println("main count " + count);
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break; // Exit the loop as soon as a divisor is found
				}
			}
			if (count == 0) {
				System.out.println("Prime number: " + i);
			} else {
				System.out.println("Not a prime number: " + i);
			}
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

////////////pattern programms ////////////////////
	private void rightAngledTriangleStarPattern_1_10() {
		int n = 10;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); // Print stars on the same line
			}
			System.out.println(); // Move to the next line after printing each row
		}
	}

	private void invertedRightAngledTriangleStarPattern_10_1() {
		int n = 10;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* "); // Print stars on the same line
			}
			System.out.println(); // Move to the next line after printing each row
		}
	}

	private void diamondORSandglassStarPattern() {
		int n = 10;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); // Print stars on the same line
			}
			System.out.println(); // Move to the next line after printing each row
		}
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("* "); // Print stars on the same line
			}
			System.out.println(); // Move to the next line after printing each row
		}

	}

	private void leftAngledTriangleStarPattern_1_10() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			// Print leading spaces
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Move to the next line after printing stars for the current row
			System.out.println();
		}
	}

	private void invertedLeftAngledTriangleStarPattern_1_10() {

		int n = 10;
		for (int i = n; i >= 1; i--) {
			// Print leading spaces
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Move to the next line after printing stars for the current row
			System.out.println();
		}
	}

	private void printRightPyramid() {

		int n = 10;
		for (int i = 1; i <= n; i++) {
			// Print leading spaces
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Move to the next line after printing stars for the current row
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			// Print leading spaces
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Move to the next line after printing stars for the current row
			System.out.println();
		}
	}

	private void printPyramidPattern() {
		int n = 10; // Total number of rows for the pyramid

		// Print the pyramid
		for (int i = 1; i <= n; i++) {
			// Print leading spaces to center the stars
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars with spaces in between to create the pyramid shape
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after printing each row
			System.out.println();
		}
	}

	private void printInvertedPyramid() {
		int n = 10;
		// Print the inverted pyramid
		for (int i = n; i >= 1; i--) {
			// Print leading spaces to center the stars
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars to create the inverted pyramid shape
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after printing each row
			System.out.println();
		}

	}

	private void printPyramidAndInvertedPyramid() {
		int n = 10; // Total number of rows for the pyramid

		// Print the regular pyramid
		for (int i = 1; i <= n; i++) {
			// Print leading spaces to center the stars
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars to create the pyramid shape
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after printing each row
			System.out.println();
		}

		// Print the inverted pyramid
		for (int i = n; i >= 1; i--) {
			// Print leading spaces to center the stars
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Print stars to create the inverted pyramid shape
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after printing each row
			System.out.println();
		}
	}

	private void printSandGlassStarPattern() {
		int n = 5; // Number of rows for each half of the diamond

		// Print the upper half of the inverted diamond
		for (int i = n; i >= 1; i--) {
			// Print leading spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after printing each row
			System.out.println();
		}

		// Print the lower half of the inverted diamond
		for (int i = 2; i <= n; i++) {
			// Print leading spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after printing each row
			System.out.println();
		}
	}
///////////////// additional prograam /////////////

}
