package Multithreding;
//method level lock, object level lock;
public class Synchronized {
	public static void main(String[] args) {
//		Output out=new Output();
//		Output out1=new Output();
		Mythread thread=new Mythread(/*out*/"Usha","thread1");
		Mythread thread1=new Mythread(/*out1*/"harsha","thread2");
		thread.start();
		thread1.start();
	}
}

class Mythread extends Thread{
//	Output o;
	String name;
	String t;
	Mythread(/*o*/String name,String t){
//		this.o=o;
		this.name=name;
		this.t=t;
	}
	public void run() {
		//o.wish(name.t);
		Output.wish(name,t);
	}
}

class Output{
	synchronized static public void wish(String name,String t){
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Good Morning"+t);
				Thread. sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}