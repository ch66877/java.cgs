package DAY13;

public class EX1 {

	public static void main(String[] args) {
		//Controller con = new Controller();//���� �߻� : �������̽��� ��ü���� ������ �� ����
		RemoteController rc = new RemoteController();
		rc.print();
		rc.run();
		rc.print();
		rc.stop();
		rc.print();
		//�͸� ���� ��ü : �͸� Ŭ������ �̿��Ͽ� ��ü�� ���� => �������̽��� �̿��Ͽ� ���� ������ ��ü�� 1���� ����� �ɋ� ���
		Controller rc2 = new Controller() {
			@Override
			public void stop() {
				System.out.println("����");
		}
		@Override
		public void run() {
			System.out.println("����");
		}
		@Override
		public void print() {
			System.out.println("���");
		}
	};
	rc.print();
	rc.run();
	rc.print();
	rc.stop();
	rc.print();
  }
}