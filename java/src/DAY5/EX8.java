package DAY5;

public class EX8 {

	public static void main(String[] args) {
		/* 1���� 100������ ��� �Ҽ��� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * 1���� 100������ ������ ������� num�� �����Ͽ� ����ϴ� �ڵ�
		 *     num�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ� 
		 * 
		 */

		for(int num = 1; num <= 100; num++) {
			// num�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ�
		int count = 0;
		//1���� num������ num�� ��� ����
		for(int i = 1; i<=num; i++) {
			//i�� num�� ����̴� => num�� i�� �������� �� �������� 0�� ����
			if(num % i == 0) {
				count++;
			}
		}
		//����� ������ �̿��Ͽ� �Ҽ����� �Ǻ�
		if(count == 2) {
			System.out.println(num + " ");
		}
	}

  }
}
