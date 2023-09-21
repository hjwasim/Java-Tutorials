package multithreading;

class Runner1 {
	void execute() {
		for(int i=0;i<10;i++) {
			System.out.println("Runner 1 - i ="+i);
		}
	}
}

class Runner2 {
	void execute() {
		for(int i=0;i<10;i++) {
			System.out.println("Runner 2 - i ="+i);
		}
	}
}

public class SequentialProcessingDemo {
	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		Runner2 r2 = new Runner2();
		
		r1.execute(); // execute first
		r2.execute(); // execute secondly
	}
}
