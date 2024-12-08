package BackUp_LogicalProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

import java.util.Map.Entry;

public class All_Logics {

	private void scannerClass() {

		Scanner scan = new Scanner(System.in);

		String given = scan.nextLine();

		String result = "";

		for (int i = given.length() - 1; i >= 0; i--) {
			char charAt = given.charAt(i);
			result = result + charAt;
		}

		System.out.println("Result : " + result);
	}

	// Character Program
	// 01
	private void validateBelow() {
		String test = 'a' + "b";
		System.out.println("test_1 "+ test);
//		String test ='a'+'b';// specify the error
//		System.out.println("test_2 "+test);

	}

	// 02
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

//03
	private void printOnlyUppercasefromTheGivenString() {
		String given = "GaneshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println("UpperCase " + c);
			}
		}
	}

//04
	private void printOnlyLowerCaseFromTheGivenString() {
		String given = "GaneshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLowerCase(c)) {
				System.out.println("lowercase " + c);
			}

		}
	}

//05
	private void printOnlyDigitsFromGivenString() {
		String given = "376ga467nesh3456Kum098ar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isDigit(c)) {
				System.out.println("digits " + c);
			}
		}
	}

//06
	private void printOnlyDigitAndletter() {
		String given = "dfyu34(*&^56@#$%dfgh^&cg4567fvh";
		for (int i = 0; i < given.length(); i++) {

			char c = given.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				System.out.println("letter or digit " + c);
			}
		}
	}

//07
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

//08
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

	// 09
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

//10
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

	@Test
	private void getTheOccurenceOfSpecificCharacterAndItsRepeatation() {
		String given = "ganeshkumar";
		// find the occurence of 'a'
		int totalLength = given.length();
		int afterLength = given.replaceAll("a", "").length();
		int occurence = totalLength - afterLength;
		System.out.println("occurence " + occurence);

	}

//11
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

//12
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

//13
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

//14
	private void removeAllSpacesFromGivenString() {
		String given = "ganesh kumar";
		String removeSpace = given.replaceAll(" ", "");
		System.out.println("remove space from given string " + removeSpace);
	}

//15
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

//16
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

	// String Programms

	// 17
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
	                result =result+ split[i];
	            }
	            // Add underscore after each word except the last one
	            if (i < split.length - 1) {
	                result = result+"_";
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

//Array Programms
	private void convertListToArray() {// 23
		List list = new ArrayList();
		list.add("mani");
		list.add("sani");
		list.add("gani");
		Object[] array = list.toArray();
	}
	
	@Test
	public static void findTheUnMatchingValuesFromTheGivenArray() {

	    System.out.println("Find the un-matching values from the given Array");

	    int given1[] = {9, 3, 8, 1, 7, 2};
	    int given2[] = {7, 5, 11, 2, 9, 3};

	    for (int i = 0; i < given1.length; i++) {
	    	
	        boolean isMatching = false;

	        for (int j = 0; j < given2.length; j++) {
	            if (given1[i] == given2[j]) {
	                isMatching = true;
	                break; // No need to check further once a match is found
	            }
	        }

	        if (!isMatching) {
	            System.out.println(given1[i]);
	        }
	    }
	}


	@Test
	private void findTheMissingValueFromGivenArray() {

		int[] given = { 1, 3, 5, 8 };
		int max = 10;
		ArrayList<Integer> missingValues = new ArrayList<>();
		for (int i = 1; i <= max; i++) {
			boolean answer = false;
			for (int num : given) {
				if (num == i) {
					answer = true;
					break;
				}
			}
			if (!answer) {
				missingValues.add(i);
			}
		}
		System.out.println(missingValues);
	}

	
	private void removeDuplicatesFromArray() {// 24//1
		int[] a = { 55, 45, 25, 55, 15, 55, 25, 45, 10 };
		int[] b = new int[a.length];
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[count] = a[i];
				count++;
			}
		}
		b[count] = a[a.length - 1];
		System.out.println("unique : ");
		for (int i = 0; i <= count; i++) {
			System.out.println(b[i]);
		}
	}

	private void removeSpecificValueFromArray() { // 25//2
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = new int[a.length - 1];
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != 20) {
				b[count] = a[i];
				count++;
			}
		}
		b[count] = a[a.length - 1];
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("Before deletion :" + Arrays.toString(a));
		System.out.println("After deletion :" + Arrays.toString(b));
	}

	private void removeSpecificIndexValueFromArray() {// 26//3
		int[] a = { 10, 20, 30, 40, 50 };// remove 3 rd index value
		int[] b = new int[a.length - 1];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != 3) { // 3 is index number
				b[count] = a[i];
				count++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// System.out.println("Before deletion :" + Arrays.toString(a));
		// System.out.println("After deletion :" + Arrays.toString(b));
	}

	private void findMaximumAndMinimumNumber() {// 27//4
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

	private void findMaximumNumber() { // 28//5
		int a[] = { 30, 10, 50, 70, 20, 5, 40 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

	private void find2ndMaximumNumber() {// 29//6
		int a[] = { 30, 10, 50, 70, 20, 5, 40 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]);
	}

	private void findMinimumNumber() {// 30//7
		int a[] = { 30, 10, 50, 70, 20, 5, 40 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

	private void find2ndMinimumNumber() {// 31//8
		int a[] = { 30, 10, 50, 70, 20, 5, 40 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]);
	}

	public static void findMINMAXNumber() {
		int[] given = { 1, 2, 4, 6, 7 };

		int max = given[0]; // Initialize max to the first element
		int min = given[0]; // Initialize min to the first element

		// Traverse the array
		for (int i = 1; i < given.length; i++) {
			if (given[i] > max) {
				max = given[i];
			}
			if (given[i] < min) {
				min = given[i];
			}
		}

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}

	public static void FindSecondHighestThirdLowest() {
		int[] given = { 1, 2, 4, 6, 7 };

		// Sort the array
		Arrays.sort(given);

		// Find the 2nd highest value
		int secondHighest = given[given.length - 2]; // Second last element
		// Find the 3rd lowest value
		int thirdLowest = given[2]; // Third element (index 2)

		System.out.println("Second highest value: " + secondHighest);
		System.out.println("Third lowest value: " + thirdLowest);
	}

// NumberProgramms

	private void findPrimeNumber() {
		int a = 11;
		int count = 0;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("it is prime number");
		} else {
			System.out.println("it is not prime number");
		}
	}

	private void PrimeNumberBetween1to50() {
		for (int i = 1; i <= 50; i++) {
			int count = 0;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}

	private void findPalindromeNumber() {
		int given = 585;
		int palioNum = given;
		int result = 0;
		while (given > 0) {
			int num = given % 10;
			result = (result * 10) + num;
			given = given / 10;
		}
		if (palioNum == result) {
			System.out.println("given number is palidrome");
		} else {
			System.out.println("given number is not palidrome");
		}
	}

	private void factorialNUmber() {
		System.out.println("factorialNUmber");
		// 5!=5*4*3*2*1=120;
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	private void findFibonacciSeriesUpto5() {
		System.out.println("findFibonacciSeriesUpto5");
		int a = 0;// //1//1//2//3
		int b = 1;// //1//2//3//5
		for (int i = 0; i < 5; i++) {
			int c = a + b;// 1//2//3//5//8
			System.out.println(c);
			a = b;// 1//1//2//3//5
			b = c;// 1//2//2//3//5//8
		}
	}

	private void checkGivenNumberisAmstrongNumberorNot() {
		// Armstrong number=153 ie 1*1*1+5*5*5+3*3*3
		System.out.println("checkGivenNumberisAmstrongNumberorNot");
		// given number is 153;
		int given = 153;
		int armsNo = given;
		int result = 0;
		while (given > 0) {
			int num = given % 10;
			result = result + num * num * num;
			given = given / 10;
		}
		if (armsNo == result) {
			System.out.println("given number is Amstrong");
		} else {
			System.out.println("given number is not Amstrong");
		}
	}

	private void findOddEvenNumbers(int num) {
		System.out.println("findOddEvenNumbers");
		if (num % 2 == 0) {
			System.out.println("The given Number is Even " + num);
		} else {
			System.out.println("The given Number is Odd " + num);
		}
		System.out.println();
	}

	private void findOddEvenNumbersfrom1to10() {
		System.out.println("findOddEvenNumbersfrom 1 to 10 ");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("The given number is Even " + i);
			} else {
				System.out.println("The given number is Odd " + i);
			}
		}
		System.out.println();
	}

	private void findOddEvenNumbersAndItsCount() {
		System.out.println("findOddEvenNumbersAndItsCount");
		int oddNumbersCount = 0;
		int evenNumberCount = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNumberCount = evenNumberCount + 1;
			} else {
				oddNumbersCount = oddNumbersCount + 1;
			}
		}
		System.out.println("evenNumberCountis " + evenNumberCount);
		System.out.println("oddNumbersCountis " + oddNumbersCount);
	}

	private void sumofOddEvenNumbers() {
		System.out.println("sumofOddEvenNumbersfrom1to10");
		int sumOfoddNum = 0;
		int sumOfEvenNum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sumOfEvenNum = sumOfEvenNum + i;
			} else {
				sumOfoddNum = sumOfoddNum + i;
			}
		}
		System.out.println("sumOfEvenNum " + sumOfEvenNum);
		System.out.println("sumOfoddNum " + sumOfoddNum);
		System.out.println();
	}

	private void sumOfGivenNumber() {
		System.out.println("sum of given number");
		System.out.println("given number : 123 ");
		int given = 123;
		int result = 0;
		while (given > 0) {
			int num = given % 10;
			result = result + num;
			given = given / 10;
		}
		System.out.println(result);
	}

	private void productOfGivenNumber() {
		System.out.println("product of given number");
		System.out.println("given number : 123 ");
		int given = 123;
		int result = 1;
		while (given > 0) {
			int num = given % 10;
			result = result * num;
			given = given / 10;
		}
		System.out.println(result);
	}

	private void swappingOf2Numberswith3rdvariable() {
		System.out.println("swapping Of 2 Numbers with the help of 3rd variable");
		int a = 20;// swapping means to interchange the values between the variables
		int b = 10;
		int c = a;// 20
		a = b;// 10
		b = c;// 20
		System.out.println("value of a " + a);
		System.out.println("value of b " + b);
	}

	private void swappingOf2Numberswithout3rdvariable() {
		System.out.println("swappingOf2Numberswithout3rdvariable");
		int a = 20;
		int b = 10;
		a = a + b;// 30
		b = a - b;// 20
		a = a - b;
		System.out.println("value of a " + a);
		System.out.println("value of b " + b);
	}

	private void reverseTheGivenNumber1() {
		System.out.println("reverseTheGivenNumber");
		System.out.println("givenNumber : 123 ");
		int given = 123;
		int result = 0;// to store the output
		while (given > 0) {
			int num = given % 10;
			result = (result * 10) + num;
			given = given / 10;
		}
		System.out.println(result);
	}

	private void findTheDigitsofGivenNumber() {
		System.out.println("findTheDigitsofGivenNumber");
		System.out.println("given number : 12345 ");
		int given = 12345;
		int result = 0;
		while (given > 0) {
			int num = given % 10;
			result = result + 1;
			given = given / 10;
		}
		System.out.println(result);
	}

	private void sortGivenInteger() {
		int a = 543210;
		String valueOf = String.valueOf(a);

		char[] b = new char[valueOf.length()];
		int count = 0;
		for (int i = 0; i < valueOf.length(); i++) {
			char c = valueOf.charAt(i);
			b[count] = c;
			count++;
		}
		Arrays.sort(b);
		System.out.println(b);
	}

	@Test
	public void CheckLeapYear() {
		int year = 2024;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year");
				}
			} else {
				System.out.println(year + " is not a leap year");
			}
		}
	}

	@Test
	private void getCharacterWithRepeatedCountAsASameString() {

		String given = "abbcccdddeeee";
		String result = "";
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
	
 
	@Test
	private void m1() {
		 String[] temp = { "Abc", "Def", "Ghi", "Jkl" };
		 
		 System.out.println(temp);

	}

}
