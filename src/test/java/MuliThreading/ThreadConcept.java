package MuliThreading;

public class ThreadConcept extends Thread {

	public void m1(){
		
		System.out.println("Task m1 completed "+ThreadConcept.currentThread().getId());
	}

	public void m2() throws InterruptedException {
		Thread.sleep(20000);
		System.out.println("Task m2 completed "+ThreadConcept.currentThread().getId());
	}

	public void m3() {
		
		System.out.println("Task m3 completed "+ThreadConcept.currentThread().getId());
	}

	public void m4() throws InterruptedException {
		
		Thread.sleep(5000);
		System.out.println("Task m4 completed "+ThreadConcept.currentThread().getId());
	}

	
@Override
public void run() {
	m1();
	try {
		m2();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	m3();
	try {
		m4();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
