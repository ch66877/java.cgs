package DAY17;

import java.util.ArrayList;

public class EX1 {

	public static void main(String[] args) {
		/* WrapperŬ������ ���׸� Ŭ�������� �⺻Ÿ������ �� ���׸��� ����� ������
		 * ���׸��� �⺻ Ÿ���� �� �� ���� Ŭ������ �ʿ��ϴ�. 
		 * �׷��� �⺻ Ÿ������ ���� Wrapper Ŭ �̿��ؾ� �Ѵ�.
		 * WrapperŬ������ �⺻ Ÿ���� ����
		 *   Wrapper Ŭ������ ��ü�� �⺻Ÿ�԰��� null�� ����
		 *   => ��ڽ��� �� �����ؾ���. null�� ���� �ֱ� ����
		 *   �⺻Ÿ���� �⺻Ÿ�԰��� ���� �� �ִ�
		 *   �� �⺻Ÿ�� ������ ==�� �� ����
		 *   �⺻ Ÿ�Ժ����� WrapperŬ���� ��ü�� ==�� ���� �� �ִ�
		 *   => WrapperŬ���� ��ü�� �ڵ� ��ڽ��� �Ǿ ==�� ��
		 *   �� WrapeerŬ���� ��ü�� ==�� ���ϸ� �ȵ� */
		//List<Integer> list = new ArrayList<Integer>();

		Integer num1 = 1;//�ڵ� �ڽ�
		int num2 = num1;//�ڵ� ��ڽ�
		Integer num3 = null;
		//int num4 = num3;//���� �߻�. null�� �⺻Ÿ������ �ٲܼ� ����
		int num5 = 1, num6 = 2;
		System.out.println("�� �⺻Ÿ�Ժ��� == �� ��        : ");
		if(num5 == num6) {
			System.out.println(num5+"��" + num6 + "�� ����");
		}else {
			System.out.println(num5+"��" + num6 + "�� �ٸ���");
		}
		
		Integer num7 = 1, num8 = new Integer(1);
		System.out.println("�� Wrapper ��ü == �� ��      : ");
		if(num7 == num8) {
			System.out.println(num7+"��" + num8 + "�� ����");
		}else {
			System.out.println(num7+"��" + num8 + "�� �ٸ���");
		}
		
		if(num7 == (int)num8) {
			System.out.println(num7+"��" + num8 + "�� ����");
		}else {
			System.out.println(num7+"��" + num8 + "�� �ٸ���");
		}
		
		String str1 = "1000";
		int num9 = Integer.parseInt(str1);
		System.out.println("���ڿ�: " + str1 + ", ���� : " +num9);
		String str2 = "1.23";
		double num10 = Double.parseDouble(str2);
		System.out.println("���ڿ�: " + str2 + ", �Ǽ� : " +num10);
	}

}
