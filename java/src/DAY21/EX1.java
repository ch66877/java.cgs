package DAY21;

public class EX1 {

	public static void main(String[] args) {
		//���ٽ��� �Ⱦ��� ������ ������ �׽�Ʈ
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("�ȳ�");
			}
		});
        th1.start();
        
        //���ٽ��� �̿��Ͽ� ������ ������ �׽�Ʈ
        Thread th2 = new Thread(()->System.out.println("Hi"));
        th2.start();
        
        Thread th3 = new Thread(()->{
        	System.out.println("Hello");
        });
        th3.start();
	}

}

