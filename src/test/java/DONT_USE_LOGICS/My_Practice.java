package DONT_USE_LOGICS;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class My_Practice {


	public static void main(String[] args) {
		My_Practice m = new My_Practice();

	}

	@Test
	void printASSCIIValuesOfGivenString() {
		String given = "ganesh kumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			int ans = (int) c;
			System.out.println(c + " : " + ans);
		}
	}

	@Test
	void printOnlyUppercasefromTheGivenString() {
		String given = "GanesH KumaR";
		String result = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isUpperCase(c)) {
				result = result + c;
			}
		}
		System.out.println(result);
	}

	@Test
	void printOnlyLowerCaseFromTheGivenString() {
		String given = "GanesH KumaR";
		String result = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLowerCase(c)) {
				result = result + c;
			}
		}
		System.out.println(result);
	}

	@Test
	void printOnlyDigitsFromGivenString() {
		String given = "ganesh123Kumar4567";
		String result = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isDigit(c)) {
				result = result + c;
			}
		}
		System.out.println(result);
	}

	@Test
	void printOnlyDigitAndletter() {
		String given = "gan43567sh@#$%Ku67ma@!#$r";
		String result = "";

		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				result = result + c;
			}
		}
		System.out.println(result);
		String ans = given.replaceAll("[^1-9A-Za-z]", "");
		System.out.println(ans);
	}

	@Test
	void countOnlyTheUpperCaseInGivenString() {
		String given = "Gane4567shKumar";
		int smallcount = 0;
		int uppercount = 0;
		int numberCount = 0;
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLowerCase(c)) {
				smallcount++;
			}
			if (Character.isUpperCase(c)) {
				uppercount++;
			}
			if (Character.isDigit(c)) {
				numberCount++;
			}
		}
		System.out.println("uppercount " + uppercount);
		System.out.println("smallcount " + smallcount);
		System.out.println("numberCount " + numberCount);
	}

	@Test
	void countOnlyTheUpperCaseInGivenString1() {
		String given = "Gane4567shKumar";
		int uppercaseCount = given.replaceAll("[^A-Z]", "").length();
		System.out.println("uppercaseCount " + uppercaseCount);
		int lowerCaseCount = given.replaceAll("[^a-z]", "").length();
		System.out.println("lowerCaseCount " + lowerCaseCount);
		int numberCount = given.replaceAll("[^0-9]", "").length();
		System.out.println("numberCount " + numberCount);

	}

	@Test
	void findTheSpecificCharacterCountIntheGivenstring1() {
		String given = "GaneshKumar";
		char question = 'a';
		int count = 0;
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			char lowerCase = Character.toLowerCase(c);
			if (lowerCase == question) {
				count++;

			}
		}
		System.out.println(question + " : " + count);
	}

	@Test
	void printOnlyVowelsFromGivenString1() {
		String given = "ganeshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println("Vowels : " + c);
			}
		}
	}

	@Test
	void printOnlyConsonantsFromGivenString1() {
		String given = "ganeshKumar";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				System.out.println("Consonants : " + c);
			}
		}
	}

	@Test
	void createNewStringhavingOnlyUpperCaseFromGivenString() {
		String given = "GanesH12345KumaR";
		String uppercase = "";
		String lowercase = "";
		String number = "";

		for (int i = 0; i < given.length(); i++) {

			char c = given.charAt(i);

			if (Character.isUpperCase(c)) {
				uppercase = uppercase + c;
			}
			if (Character.isLowerCase(c)) {
				lowercase = lowercase + c;
			}
			if (Character.isDigit(c)) {
				number = number + c;

			}
		}
		System.out.println("uppercase " + uppercase);
		System.out.println("lowercase " + lowercase);
		System.out.println("number " + number);

	}

	@Test
	void removeAllSpacesFromGivenString() {
		String given = "Gan esh Kum ar";
		String result = "";
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (!Character.isWhitespace(c)) {
				result = result + c;
			}
		}
		System.out.println(" spaceremoval " + result);
	}

	@Test
	void removeAllSpacesFromGivenString1() {
		String given = "Gan esh Kum ar";
		String result = given.replaceAll(" ", "");

		System.out.println(" spaceremoval " + result);
	}

	@Test
	void convertLowercaseToUppercaseAndUppercaseTolowercaseFromGivenstring() {
		String given = "GanesHKumaR";
		String result = "";

		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (Character.isLowerCase(c)) {

				char u = Character.toUpperCase(c);
				result = result + u;
			} else {
				char l = Character.toLowerCase(c);
				result = result + l;
			}
		}
		System.out.println(result);
	}

	@Test
	void reverseTheGivenString() {

		String given = "ganesh kumar";
		String result = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			char c = given.charAt(i);
			result = result + c;
		}
		System.out.println("reverse String " + result);
	}

	@Test
	void reverseTheGivenStringWithoutChangingTheirPlace() {
		String given = "ganesh kumar";
		String result = "";
		String[] ans = given.split(" ");

		for (String single : ans) {
			for (int i = single.length() - 1; i >= 0; i--) {
				char c = single.charAt(i);
				result = result + c;

			}
			result = result + " ";

		}
		System.out.println("reverse at place " + result);

	}

	@Test
	void swappingTheGivenString() {
		String given = "ganesh kumar";
		String result = "";
		String[] ans = given.split(" ");
		for (int i = ans.length - 1; i >= 0; i--) {
			result = result + ans[i] + " ";
		}
		System.out.println(" swapping " + result);
	}

	@Test
	void printFirstCharacterOfEachwordFromGivenString() {
		String given = "My Name Is Ganesh Kumar";
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			char c = single.charAt(0);
			System.out.println("First char of " + single + " is " + c);
			result = result + c;
		}
		System.out.println("String using first char " + result);
	}

	@Test
	void printFirstTwoCharactersOfGivenString() {

		String given = "ganesh kumar world live";
		String[] ans = given.split(" ");
		for (String single : ans) {
			String result = single.substring(0, 2);
			System.out.println("first 2 letters of each " + result);
		}

	}

	@Test
	void printOnlyAWordStartsWithCFromTheGivenString() {
		String given = "apple beetroot america London";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.startsWith("a")) {
				System.out.println("print a word starts with a " + single);
			}

			if (single.contains("o")) {
				System.out.println("print only word contains o " + single);
			}
			if (single.endsWith("t")) {
				System.out.println("endswith t " + single);

			}

		}
	}

	@Test
	void printOnlyAWordContainsFourcharacterfromTheGivenString() {
		String given = "one two four five nine";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.length() == 4) {
				System.out.println("words having 4 chars " + single);
			}

		}

	}

	@Test
	void printTheSpecialwordContainsFirstAndlastCharacterSame() {

		String given = "madam school  appaa live ammaa value ";

		String[] ans = given.split(" ");

		for (String name : ans) {
			if (name.charAt(0) == name.charAt(name.length() - 1)) {
				System.out.println("words start and end char same " + name);
			}
		}
	}

	@Test
	private void printTheSpecialwordContainsFirstAndlastCharacterSame1() {

		String given = "mom uncle dad aunty ";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.charAt(0) == single.charAt(single.length() - 1)) {
				System.out.println(single);
			}
		}
	}

	@Test
	private void printTheLongestWordFromTheGivenString() {
		String given = "my name is ganesh";
		String ans = "";
		String[] split = given.split(" ");
		for (int i = 0; i < split.length - 1; i++) {
			if (split[i].length() > split[i + 1].length()) {
				ans = split[i];
			}
			if (ans.length() > split[split.length - 1].length()) {
				ans = ans;
			} else {
				ans = split[split.length - 1];
			}
		}
		System.out.println(ans);
	}

	@Test
	private void insertANewWordFromtheGivenString() {
		String given = "my name is ganesh";
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			if (single.equalsIgnoreCase("ganesh")) {
				result = result + "kumar" + " ";
				System.out.println(result);
				System.out.println("---------");
			} else {
				result = result + single + " ";
				System.out.println(result);
				System.out.println("---------");
			}

		}

	}

	@Test
	private void removeduplicateChracterfromGivenString() {
		String given = "ganeshkumar";
		String result = "";
		Set<Character> s = new LinkedHashSet<>();
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			s.add(c);
		}
		for (Character character : s) {
			result = result + character;

		}
		System.out.println(result);
	}

	@Test
	void countTheOccuranceOfcharacterFromTheString() {
		String given = "ganeshkumar";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < given.length(); i++) {
			char c = given.charAt(i);
			if (map.containsKey(c)) {
				Integer n = map.get(c);
				map.put(c, n + 1);
			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate character is " + entry.getKey() + " & count is " + entry.getValue());
			}

		}
	}

	@Test
	void changeCaseToAlternateWordFromGivenString() {
		String given = "my name is ganesh kumar";
		String result = "";
		String[] split = given.split(" ");
		for (int i = 0; i < split.length; i++) {

			if (i % 2 == 0) {
				result = result + split[i].toUpperCase() + " ";
			}

			else {
				result = result + split[i].toLowerCase() + " ";

			}

		}
		System.out.println(result);
	}

	@Test
	void reverseOnlyTheSpecificWordfromtheGivenString() {
		String given = "my name is ganesh kumar";

		String result = "";

		String[] split = given.split(" ");

		for (String single : split) {
			if (single.equalsIgnoreCase("ganesh")) {
				for (int i = single.length() - 1; i >= 0; i--) {
					char c = single.charAt(i);
					result = result + c;
				}
				result = result + " ";

			} else {

				result = result + single + " ";
			}

		}
		System.out.println(result);
	}

	@Test
	void convertEachwordFirstLetterMustbeUppercaseremainingLowerCasefromGivenString() {
		String given = "my name is ganesh kumar";
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			char c = single.charAt(0);
			char upper = Character.toUpperCase(c);
			result = result + upper + single.substring(1) + " ";
		}
		System.out.println(result);
	}

	@Test
	void swapTheFirstAndLastCharacterOfGivenString() {
		String given = "ganeshkumar";
		String result = "";
		char first = given.charAt(0);
		char last = given.charAt(given.length() - 1);
		result = last + given.substring(1, given.length() - 1) + first;
		System.out.println(result);
	}

	private void method() {
		String name1 = "ABC";
		String name2 = "ABC";
		for (int i = 0; i < name1.length(); i++) {
			char charAt = name1.charAt(i);

		}
	}

	@Test
	private void method1() {
		String name = "hello, world!   ";
		String result = "";
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!Character.isWhitespace(c)) {
				result = result + c;
			}
		}
		System.out.println("result " + result);
	}

	@Test
	private void method2() {
		String name = "hello, world!   ";
		String result = name.replaceAll(" ", "");
		System.out.println(result);
	}

	@Test
	private void method4() {
		String name = "waterbottle";// bottlewater
		String ans = "";
		String replace = name.replace("r", "r ");
		String[] split = replace.split(" ");// water bottle
		for (int i = split.length - 1; i >= 0; i--) {
			ans = ans + split[i];
		}
		System.out.println(ans);
	}

	@Test
	private void method5() {
		String name = "aaaaBBBcccccd";// 4a3B5c1d
		String result = "";
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
for (int i = 0; i < name.length(); i++) {
	char c = name.charAt(i);
	if(c=='a') {count1++;result=""+count1+'a';}
	if(c=='B') {count2++;result=result+""+count2+'B';}
	if(c=='c') {count3++;result=result+""+count3+'c';}
	if(c=='d') {count4++;result=result+""+count4+'c';}
	
}
result=result+"";
System.out.println(result);
}
}
