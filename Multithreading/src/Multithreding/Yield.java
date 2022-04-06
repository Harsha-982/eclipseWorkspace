package Multithreding;

public class Yield {

	public static void main(String[] args) {
		thread t= new thread();
		t.start();
		for(int i=0;i<4;i++) {
			System.out.println("main class");
		}
	}

}

class thread extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("child");
//		Thread.yield();
	}
	}
}
