package DAY2;

public class EX17 {

	public static void main(String[] args) {
		/* num�� 2�� ����̸� 2�� ������ ����ϰ�,
		 * num�� 3�� ����̸� 3�� ������ ����ϰ�,
		 * num�� 6�� ����̸� 6�� ������ ����ϰ�
		 * num�� 2,3,6�� ����� �ƴϸ� 2,3,6�� ����� �ƴ϶�� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * n�� ��� : num�� n���� �������� �� �������� 0�� ����
		 * ��, num�� 6�̸� 6�� ������ ����ؾ��մϴ�. 2�ǹ��, 3�ǹ�� ����� ������ �ȵ˴ϴ�.
		 * ��Ʈ1 : 6�ǹ���� ���� üũ
		 * ��Ʈ2 : 2�� ����� Ȯ���� �� 3�� ����� �ƴ� ���ڸ� Ȯ��
		 * */
		int num = 6;

		if(num % 6 == 0) {
			System.out.println(num + "�� 6�� ���");
		}else if(num % 3 == 0) {
			System.out.println(num + "�� 3�� ���");
		}else if(num % 2 == 0) {
			System.out.println(num + "�� 2�� ���");
		}else {
			System.out.println(num + "�� 2,3,6�� ����� �ƴ�");
		}


		if(num % 2 == 0 && num % 3 != 0) {
			System.out.println(num + "�� 2�� ���");
		}else if(num % 3 == 0 && num % 2 != 0) {
			System.out.println(num + "�� 3�� ���");
		}else if(num % 6 == 0) {
			System.out.println(num + "�� 6�� ���");
		}else {
			System.out.println(num + "�� 2,3,6�� ����� �ƴ�");
		}
	}

}