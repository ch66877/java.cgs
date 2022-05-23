package DAY20;

public class EX4 {

	public static void main(String[] args) {
		/* �� ���¿� ���ÿ� 2���� �����ؼ� õ���� ������ ���� �� �ִ� ������
		 * �� ���̻��� �����尡 �ϳ��� �ڿ��� ���� �̿��ϴ�
		 * */

		BankBook book = new BankBook(10000);
		User user1 = new User(book);
		user1.start();
		
		User user2 = new User(book);
		user2.start();
	}

}
class User extends Thread{
	   BankBook book;
	
	   public User(BankBook book) {
		   this.book = book;
	   }
	
	   @Override
	   public void run() {
		   book.withdraw(1000);
	  }
}

class BankBook{
    private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
    //���
	//synchronized : ����ȭ
	//�޼ҵ带 ����ȭ �ϸ� � �����尡 ����ȭ �޼ҵ带 �����ϰ� ������
	//�ٸ� �����忡�� �ش� �޼ҵ带 ������ ��, ������ �� ���������� �Ͻ������ߴٰ�(Blocked)
	//�� ������ �������� ����� �� �� �ִ�.
	public synchronized void withdraw(int money) {
		this.money -= money;
		try {
			Thread.sleep(1000);
			System.out.println("���� �ܾ� : " + this.money);
		} catch (InterruptedException e) {}
	}
	public void withdraw2(int money) {
		synchronized (this) {
			this.money -= money;
			try {
				Thread.sleep(1000);
				System.out.println("���� �ܾ� : " + this.money);
			} catch (InterruptedException e) {}
		}
	}
	public BankBook(int money) {
		this.money = money;
	}
}