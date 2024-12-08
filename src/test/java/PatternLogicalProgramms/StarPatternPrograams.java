package PatternLogicalProgramms;

import org.testng.annotations.Test;

public class StarPatternPrograams {
	
	
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

	
	public static void main(String[] args) {
		StarPatternPrograams s = new StarPatternPrograams();
		s.printInvertedPyramid();
	}

}
