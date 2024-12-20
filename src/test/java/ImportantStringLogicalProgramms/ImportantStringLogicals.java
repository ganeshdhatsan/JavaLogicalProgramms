package ImportantStringLogicalProgramms;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ImportantStringLogicals {

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

	private void reverseAlternateWordFromGivenStringOriginal() {
		String given = "my name is ganesh kumar"; // Expected output: my_eman_is_hsenag_kumar

		// Split the string by underscore
		String[] split = given.split(" ");
		String result = "";

		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				String answer = "";
				for (int j = split[i].length() - 1; j >= 0; j--) {
					char c = split[i].charAt(j);
					answer = answer + c;
				}
				result = result + answer + " ";
			} else {
				result = result + split[i] + " ";
			}

		}
		System.out.println(result);
	}

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

	private void swappingTheGivenString() {
		String given = "ganesh kumar";
		String result = "";
		String[] split = given.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			result = result + split[i] + " ";
		}
		System.out.println("swappingTheGivenString " + result);
	}

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

	private void swapTwostringWithout3rdString() {// 5
		String str1 = "ganesh ";
		String str2 = "kumar ";
		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
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

	private void getVowelsFromTheString() {// 20
		String s = "java";
		Map<Character, Integer> map = new TreeMap();
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

	private void findtheOccuranceCountsofEachCasesInString() {// 22
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

	private void method() {
		String name = "aabbbccccdddd";// a2b3c4d4
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

	private void swapPairsFromGivenString() {
		String given = "logical"; // oligacl
		String result = "";
		char[] chars = given.toCharArray();

		for (int i = 0; i < chars.length - 1; i = i + 2) {
			char temp = chars[i];
			chars[i] = chars[i + 1];
			chars[i + 1] = temp;
		}

		for (char c : chars) {
			result = result + c;
		}
		System.out.println("result " + result);

	}

	public void findFirstNonRepeatedCharacterFromGivenString() {
		String input = "aadffggrrtt";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repeating character: " + entry.getKey());
				return;
			}
		}
	}

	private void sortMapByValueWithoutUsingStream() {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 50);
		map.put("banana", 20);
		map.put("cherry", 70);
		map.put("date", 30);

		Entry<String, Integer>[] entries = map.entrySet().toArray(new Entry[map.size()]);

		for (int i = 0; i < entries.length; i++) {
			for (int j = 0 + i; j < entries.length; j++) {
				if (entries[i].getValue() > entries[j].getValue()) {
					Entry<String, Integer> temp = entries[i];
					entries[i] = entries[j];
					entries[j] = temp;
				}
			}
		}

		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		for (Entry<String, Integer> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		for (Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}

	private void sortMapByValueUsingStream() {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 50);
		map.put("banana", 20);
		map.put("cherry", 70);
		map.put("date", 30);

		Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((key, value) -> System.out.println(key + " -> " + value));

	}

}
