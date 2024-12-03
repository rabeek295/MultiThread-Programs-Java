package Thread;

class Thread1
{
	synchronized public static void method1()
	{
		String name ="Rabeek Rajan";
		for (int i = 0; i < name.length(); i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.print(name.charAt(i));
		}
	
	}
}

class Thread2
{
	synchronized public static void method2()
	{
		String name ="Allwin Rajan";
		for (int i = 0; i < name.length(); i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.print(name.charAt(i));
		}
	}
}

class A extends Thread
{
	public void run() {
		Thread1.method1();
	}
}

class B extends Thread
{
	public void run() {
		Thread2.method2();
	}
}
public class Tester1{
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		t1.start();
		
		Thread t2 = new Thread(new B());
		t2.start();
		
	}
}