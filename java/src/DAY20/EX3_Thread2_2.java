package DAY20;

import java.awt.Toolkit;

public class EX3_Thread2_2 {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		Thread th1 = new Thread1();
		Thread th2 = new Thread2();
		th1.setName("������1");
		th2.setName("������2");
		th1.start();
		th2.start();
		System.out.println("main ������ �̸� : " + th.getName());
		System.out.println("Thread1 �̸� : " + th1.getName());
		System.out.println("Thread2 �̸� : " + th2.getName());
	}
}

class Thread1 extends Thread{
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();

		for(int i = 0 ; i<5; i++) {
			tk.beep();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i<5; i++) {
			System.out.println("��");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
