package DAY20;

public class EX2 {

	public static void main(String[] args) {
		//
		//Test1 t1 = new Test1();
		//Thread th1 = new Thread(t1);
		Thread th1 = new Thread(new Test1());
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		
		Thread th2 = new Test2();
		th2.setPriority(Thread.MIN_PRIORITY);
		th2.start();
		Thread th3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<10000; i++) {
					System.out.println("@");
				}
			}
		});
		th3.start();
		for(int i =0; i<10000; i++) {
			System.out.println("|");
		}


	}
}
//Runnable �������̽��� ������ ���� Ŭ������ �̿�
class Test1 implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i<10000; i++) {
			System.out.println("-");
		}
			
		}
}
//Thread Ŭ������ ��� ���� �ڽ� Ŭ������ �̿�
class Test2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10000; i++) {
			System.out.println("*");
		}
	}
}