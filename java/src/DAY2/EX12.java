package DAY2;

public class EX12 {

	public static void main(String[] args) {
		/* num�� ¦���̸� ¦����� ����ϰ�, ¦���� �ƴϸ� Ȧ����� ����ϴ� �ڵ带 if���� �̿��Ͽ� �ۼ��غ�����. */
		int num = 5;
		//if���� �ι��� ������ num�� Ȧ��/¦���� ������� ������ 2�� �񱳸� �մϴ�.
		if(num % 2 == 0) {
			System.out.println(num + "�� ¦��");
		}
		if(num % 2 != 0) {
			System.out.println(num + "�� Ȧ��");
		}

		//if else���� �̿��� ������ num�� ¦���̸� 1�� ���ϰ�, Ȧ���̸� 2�� ���դ���.
		if(num % 2 == 0) {
			System.out.println(num + "�� ¦��");
		}
		else {
			System.out.println(num + "�� Ȧ��");
		}
	}
}