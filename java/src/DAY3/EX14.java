package DAY3;

public class EX14 {

	public static void main(String[] args) {
		/* num�� ����� �ⷫ�ϴ� �ڵ带 �ۼ��ϼ���.
		 * A�� ��� : A�� � ���� �������� �� �������� 0�� ���� ��
		 * 12�� ��� : 1 2 3 4 6 12
		 */
		
		int i;
		int num = 12;
		for(i=1; i<=num;i++) {
			if(num % i == 0 ) {
				System.out.print(i + "");
			}
		}
			
	}

}
