package ChracterLogicalProgramms;

import org.testng.annotations.Test;

public class CharacterProgramms {

	public static void main(String[] args) {
		CharacterProgramms c = new CharacterProgramms();
		c.validateBelow();
	}
	private void validateBelow() {
		String test = 'a' + "b"; 
		System.out.println("test_1 " + test); // ab
//		String test ='a'+'b';// specify the error
//		System.out.println("test_2 "+test);
	}

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


}
