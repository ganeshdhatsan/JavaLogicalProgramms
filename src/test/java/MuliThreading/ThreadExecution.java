package MuliThreading;

public class ThreadExecution extends ThreadConcept{

	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			ThreadExecution t = new ThreadExecution();
			t.run();
		}
		
	}
}
