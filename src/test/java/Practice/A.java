package Practice;

public class A {
	
	private static int value;
	
	public static void setValue(int x) {
		if(x>18 && x<60) {
			value=x;	
		}
		else {
			System.out.println("candidate not elegible");
		}
		
	}
	
	public static int getValue() {
		
		return value;
	}

	
	public static void main(String[] args) {
		setValue(10);
		System.out.println(getValue());
		
	}
	
	
}
