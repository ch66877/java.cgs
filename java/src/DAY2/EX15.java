package DAY2;

public class EX15 {

	public static void main(String[] args) {
		/* month�� �־��� �� �ش� ���� ������ ���� ����ϴ� �ڵ带 if������ �ۼ��ϼ���.
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * �� ���� ���� �߸��� ���Դϴٶ�� ���
		 * month�� 1�̰ų� month�� 3�̰ų� month�� 5�̰ų� month�� 7�̰ų� month�� 8�̰ų� month�� 10�̰ų�
		 * month�� 12�̸� 31���̶�� ����ϰ�
		 * month�� 4�̰ų� month�� 6�̰ų� month�� 9�̰ų� month�� 11�̸� 30���̶�� ����ϰ�
		 * month�� 2�̸� 28���̶�� ����ϰ�
		 * �ƴϸ� �߸��� ���Դϴٶ�� ���
		 * */
		int month = 13;
		if(month < 1 || month > 12) {
			System.out.println(month + "���� �߸��� ���Դϴ�.");
		}else if(month == 2) {
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
		}else if(month == 4 || month == 6 || month == 9 || month == 11 ) {
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
		}else {
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
		}
	}

}