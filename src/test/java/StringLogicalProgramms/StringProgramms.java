package StringLogicalProgramms;

import java.util.ArrayList;
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

public class StringProgramms {
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

	@Test
	private void reverseAlternateWordFromGivenString() {
		String given = "my_name_is_ganesh_kumar";

		// Split by underscore as per the input format
		String[] split = given.split("_");
		String result = "";

		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) { // Reverse every alternate word (1, 3, 5, ...)
				String reversedWord = new StringBuilder(split[i]).reverse().toString();
				result += reversedWord;
			} else {
				result = result + split[i];
			}
			// Add underscore after each word except the last one
			if (i < split.length - 1) {
				result = result + "_";
			}
		}

		System.out.println(result);
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
//		String s = "JaVA123@oracle.com*ismyDefaultemailIdforGIT&jirainMYproJect9840";
//		
//		int [] given = {1,2,4,6,7};
//		
//		Map<Character, Integer> map = new LinkedHashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (map.containsKey(c)) {
//				Integer integer = map.get(c);
//				map.put(c, integer + 1);
//			} else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);

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
	
	private void getCharacterWithRepeatedCountAsASameString() {

		String given = "abbcccdddeeee";
		String result = ""; //a1b2c3d3e4
		int count = 1;

		for (int i = 0; i < given.length() - 1; i++) {

			if (given.charAt(i) == given.charAt(i + 1)) {
				count++;
			} else {

				result = result + given.charAt(i) + Integer.toString(count);
				count = 1;
			}
		}
		result = result + given.charAt(given.length() - 1) + Integer.toString(count);

		System.out.println(result);
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
    
    public static void main(String[] args) {
    	
    	StringProgramms s = new StringProgramms();
    	s.getCharacterWithRepeatedCountAsASameString();
		
	}
}
