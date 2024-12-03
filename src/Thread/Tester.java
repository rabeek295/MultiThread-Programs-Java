package Thread;
public class Tester {
  public static void main(String[] args) {
		Thread t2 = new Thread(new Sample2());
		t2.start();
		Thread t1 = new Thread(new Sample1());
		t1.start();
	}
}
 class Demo extends Thread {
	public static void m1() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
 
  public static void m2() {
		for (int i = 101; i < 111; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
  }
	class Sample1 extends Thread {
		public void run() {
			Demo.m1();
		}
	}
	class Sample2 extends Thread {
		public void run() {
			Demo.m2();
		}
	}



