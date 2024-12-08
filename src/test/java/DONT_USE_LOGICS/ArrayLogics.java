package DONT_USE_LOGICS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class ArrayLogics {
	
	@Test
	private void printAllNumberFromGivenArray() {
	 int [] a = {2,1,3,7,4,9,5,0};
	 for (int i : a) {
		System.out.println("printAllNumberFromGivenArray "+i);
	}

	}
	@Test
	private void printAllNumberFromGivenArrayInAssendingOrder() {
		 int [] a = {2,1,3,7,4,9,5,0};
		 Arrays.sort(a);
		 for (int i : a) {
				System.out.println("printAllNumberFromGivenArrayInAssendingOrder "+i);
			}
	}
	@Test
	private void printODDAndEvenNumbersFromGivenArray() {
		 int [] a = {2,1,3,7,4,9,5,0,6};
		 for (int i = 0; i < a.length; i++) {
			 if(a[i]%2==0) {
				 System.out.println("even numbers "+a[i]);
			 }
		if(a[i]%2!=0) {
			System.out.println("odd numbers "+a[i]);
		}
			
		}
	}
	
	@Test
	private void printODDAndEvenIndexNumbersFromGivenArray() {
	
		 int [] a = {2,1,3,7,4,9,5,0,6};
		 for (int i = 0; i < a.length; i++) {
			 if(i%2==0) {
				 System.out.println("even index number "+a[i]);
			 }
			 if(i%2!=0) {
				 System.out.println("odd index number "+a[i]);
			 }
			
		}
	}
	@Test
	private void findOnly2DigitNumbersFromGivenArray() {
		int [] a = {2,15,37,70,4,99,5,10,17,};
		for(int i=0;i<a.length;i++) {
			
			
		}
	}
	@Test
	private void removeDuplicatesandPrintAscendingFromGivenArray() {
			int[] num = { 8,9,9,3,3,2,6,7,5,5,1,1 };
			
			Set<Integer> set = new HashSet<>();
			
			//Set<Integer> set = new TreeSet<Integer>();
			for (int duplicate : num) {
				set.add(duplicate);
			}
			System.out.println("printAllNumberFromGivenArrayInAssendingOrderAndRemoveDuplicate"+set);
	}

}
