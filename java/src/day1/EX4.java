package day1;

public class EX4 {

	public static void main(String[] args) {
		/* 1. �ڵ� Ÿ�Ժ�ȯ
		 *   - ���� Ÿ���� ���� ū Ÿ�Կ� �����ϴ� ��� 
		 * 2. ���� Ÿ�Ժ�ȯ : ���̳� ���� �տ� (Ÿ�Ը�) �� �� ��
		 *   - ū Ÿ���� ���� ���� Ÿ�Կ� �����ϴ� ���(�ڵ� Ÿ�Ժ�ȯ�� �Ұ����� ���)
		 *   - ����� ���� Ư������ �Ͻ������� ��ȯ�ϴ� ���( /������ ������ �� �ٽ� ���)
		 * */
		//�ڵ� Ÿ�Ժ�ȯ ��
		byte num1_1 = 1;
		int num1_2 = num1_1;
		double num1_3 = num1_2;

		//���� Ÿ�Ժ�ȯ ��
		int num2_1 = 1;
		byte num2_2 = (byte)num2_1;
		num2_1 = (int)1.23;

		//���� Ÿ�Ժ�ȯ �� : ����� ���� Ư������ �Ͻ������� ��ȯ�ϴ� ���
		double num3_1 = 1 / 2; // 1/2�� 0.5�� �ƴ϶� 0
		double num3_2 = (double)1 / 2; //1.0 / 2 �� 0.5
		System.out.println(num3_1);
		System.out.println(num3_2);

		//�ڵ� Ÿ�Ժ�ȯ �� : ���� ����
		int num4_1 = 1;
		double num4_2 = 1.23;
		//num4_1�� ���ϴ� ���� �Ǽ��̱� ������ num4_1�� �Ǽ��� �ڵ� Ÿ�Ժ�ȯ�� �� �� �Ǽ� + �Ǽ��� ����Ͽ� num4_3�� ����
		//���� �� �ڵ� Ÿ�Ժ�ȭ�� ��
		double num4_3 = num4_1 + num4_2;
		//num4_1�� ���ϴ� ���� �����̱� ������ ���� + ������ �� �� ���� ���� �Ǽ��� �ڵ� Ÿ�Ժ�ȯ�� �Ͽ� num4_3�� ����
		//�����Ŀ� �����ϱ� ���� Ÿ�Ժ�ȯ�� ��
		double num4_4 = num4_1 + 5;
		System.out.println(num4_3);
		System.out.println(num4_4);

		//55~56. ������ �Ǽ��� �ڵ�Ÿ�Ժ�ȯ�� �� ���е��� ������ �� �ִ�. int=> float
		//int =>float���� Ÿ�Ժ�ȯ�ϱ⺸�� double�� Ÿ�Ժ�ȯ�Ͽ� Ȱ���Ѵ�. 
		int num5_1 = 1234567890;
		float num5_2 = num5_1; //�ڵ� Ÿ�Ժ�ȯ
		int num5_3 = (int)num5_2; //���� Ÿ�Ժ�ȯ
		System.out.println(num5_1);
		System.out.println(num5_2);
		System.out.println(num5_3);

	}

}