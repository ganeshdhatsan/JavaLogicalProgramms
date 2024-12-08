package DONT_USE_LOGICS;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class StringLogics {
	
	@Test
	private void check() {
		String test ='a'+"b";
		System.out.println("test_1 "+test);
		int test1 ='a'+'b';
		System.out.println("test_2 "+test1);

	}
	@Test
	private void printASSCIIValuesOfGivenString() {// 01

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

	@Test
	private void printOnlyUppercasefromTheGivenString() {// 02
		String given = "GaneshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println("UpperCase " + c);
			}
		}
	}

	@Test
	private void printOnlyLowerCaseFromTheGivenString() {// 03
		String given = "GaneshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLowerCase(c)) {
				System.out.println("lowercase " + c);
			}

		}
	}

	@Test
	private void printOnlyDigitsFromGivenString() {// 04
		String given = "376ga467nesh3456Kum098ar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isDigit(c)) {
				System.out.println("digits " + c);
			}
		}
	}

	@Test
	private void printOnlyDigitAndletter() {// 05
		String given = "dfyu34(*&^56@#$%dfgh^&cg4567fvh";
		for (int i = 0; i < given.length(); i++) {

			char c = given.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				System.out.println("letter or digit " + c);
			}
		}
	}

	@Test
	private void countOnlyTheUpperCaseInGivenString() {// 06

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

	@Test
	private void countOnlyTheLowerCaseInGivenString() {// 07
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

	@Test
	private void countOnlyTheDigitsInGivenString() {// 08
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

	@Test
	private void findTheSpecificCharacterCountIntheGivenstring() {// 09
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

	@Test
	private void printOnlyVowelsFromGivenString() {// 10
		String given = "ganeshkumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			char lowerCase = Character.toLowerCase(c);
			if (lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u') {
				System.out.println("Vowel from given string " + lowerCase);
			}

		}
	}

	@Test
	private void createNewStringhavingOnlyUpperCaseFromGivenString() {// 11
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

	@Test
	private void createStringStartingWithNumericFromGivenString() {// 12
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

	@Test
	private void removeAllSpacesFromGivenString() {// 13
		String given = "ganesh kumar";
		String removeSpace = given.replaceAll(" ", "");
		System.out.println("remove space from given string " + removeSpace);
	}

	@Test
	private void removeAllSpacesFromGivenString1() {// 14
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

	@Test
	private void convertLowercaseToUppercaseAndUppercaseTolowercaseFromGivenstring() {// 15
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

	@Test
	private void reverseTheGivenString() {// 16
		String given = "ganesh kumar";
		String result = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			char c = given.charAt(i);
			result = result + c;
		}
		System.out.println("reverse the given string " + result);
	}

	@Test
	private void reverseTheGivenStringWithoutChangingTheirPlace() {// 17
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
		System.out.println("reverseTheGivenStringWithoutChangingTheirPlace " + result);
	}

	@Test
	private void swappingTheGivenString() {// 18
		String given = "ganesh kumar";
		String result = "";
		String[] split = given.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			result = result + split[i] + " ";
		}
		System.out.println("swappingTheGivenString " + result);
	}

	@Test
	private void printFirstCharacterOfEachwordFromGivenString() {// 19
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			char c = single.charAt(0);
			System.out.println("first character of each word " + c);
		}
	}

	@Test
	private void createAStringUsingFirstCharacterOfeachwordFromGivenString() {// 20
		String given = "ganesh plays criket good";
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			char c = single.charAt(0);
			result = result + c;
		}
		System.out.println("createAStringUsingFirstCharacterOfeachwordFromGivenString " + result);
	}

	@Test
	private void printFirstTwoCharactersOfGivenString() {// 21
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {

			String result = single.substring(0, 2);
			System.out.println("printFirstTwoCharactersOfGivenString " + result);
		}
	}

	@Test
	private void printOnlyAWordStartsWithCFromTheGivenString() {// 22
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.startsWith("c")) {
				System.out.println("printOnlyAWordStartsWithCFromTheGivenString " + single);
			}

		}
	}

	@Test
	private void printOnlyAWordEndsWithshFromTheGivenString() {// 23
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.endsWith("sh")) {
				System.out.println("printOnlyAWordStartsWithCFromTheGivenString " + single);
			}
		}
	}

	@Test
	private void printOnlyAwordHavingacharacterAfromTheGivenString() {// 24
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.contains("a")) {
				System.out.println("printOnlyAwordHavingacharacterAfromTheGivenString " + single);
			}

		}
	}

	@Test
	private void printOnlyAWordContainsFourcharacterfromTheGivenString() {// 25
		String given = "ganesh plays criket good";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.length() == 4) {
				System.out.println("printOnlyAWordContainsFourcharacterfromTheGivenString " + single);
			}
		}
	}

	@Test
	private void printTheSpecialwordContainsFirstAndlastCharacterSame() {// 26
		String given = "mom went to her dad home ";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.charAt(0) == single.charAt(single.length() - 1)) {
				System.out.println("printTheSpecialwordContainsFirstAndlastCharacterSame " + single);
			}

		}
	}

	@Test
	private void printTheLongestWordFromTheGivenString() {// 27
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

	@Test
	private void createANewWordFromtheGivenString() {// 28
		String given = "my name is ganesh kumar";// use manish instead of ganesh
		String replace = given.replace("ganesh", "manish");
		System.out.println("createANewWordFromtheGivenString " + replace);
	}

	@Test
	private void removeduplicateChracterfromGivenString() {// 29
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

	@Test
	private void countTheOccuranceOfcharacterFromTheString() {// 30
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

	@Test
	private void countTheOccuranceOfOnlyDuplicatecharacterFromTheString() {// 31

	}

	@Test
	private void changeCaseToAlternateWordFromGivenString() {// 32
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

	@Test
	private void reverseOnlyTheSpecificWordfromtheGivenString() {// 33
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
	private void convertEachwordFirstLetterMustbeUppercaseremainingLowerCasefromGivenString() {// 34
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

	@Test
	private void swapTheFirstAndLastCharacterOfGivenString() {// 35

		String given = "GaneshKumar";// raneshKumG
		String result = "";
		int length = given.length();
		char firstChar = given.charAt(0);
		char lastChar = given.charAt(length - 1);
		String middle = given.substring(1, length - 2);
		result = lastChar + middle + firstChar;
		System.out.println("swapTheFirstAndLastCharacterOfGivenString " + result);
	}

	@Test
	private void countOnlyTheUpperCaseInGivenString1() {// 36
		String given = "Gane4567shKumar";
		int uppercaseCount = given.replaceAll("[^A-Z]", "").length();
		System.out.println("uppercaseCount " + uppercaseCount);
		int lowerCaseCount = given.replaceAll("[^a-z]", "").length();
		System.out.println("lowerCaseCount " + lowerCaseCount);
		int numberCount = given.replaceAll("[^0-9]", "").length();
		System.out.println("numberCount " + numberCount);

	}

	@Test
	void printOnlyConsonantsFromGivenString1() {// 37
		String given = "ganeshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				System.out.println("Consonants : " + c);
			}
		}
	}

}
