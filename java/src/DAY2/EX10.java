package DAY2;

public class EX10 {

	public static void main(String[] args) {
		/* num�� ¦������ �ƴ��� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���. 
		 * A���� ����ϴ� ������ Ȱ��
		 * ¦���� num�� 2�� (�������� �� ������)�� 0�� ���� 
		 * num 2 % 0 ==
		 * num % 2 == 0
		 * */
		int num = 3;

		System.out.println(num + "�� ¦���ΰ�?" + (num % 2 == 0));
		/* num�� ¦���̸� num�� ¦����� ����ϰ�,
		 * num�� ¦���� �ƴϸ� num�� Ȧ���̶�� ����ϵ��� �ڵ带 �ۼ��غ�����.*/
		String str = (num % 2 == 0)?"¦��" : "Ȧ��"; 
		System.out.println(num + "�� " + str);
	}

}