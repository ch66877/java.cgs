package DAY4;

public class EX7 {

	public static void main(String[] args) {
		/* �����÷ο�, ����÷ο�� �������� ǥ�������� �Ѿ�� ��� �߻�*/
		byte num = 127;
		//byte�� ǥ�ð����� ���� ū ���� 127�� 1�� ���ϸ� 128�� �ƴ� -128�� ����
		//byte�� 128�� ǥ�� ���ϱ� ����
        //�̷��� ������ �����÷ο��� ��
		num = (byte)(num +1);
		System.out.println(num);
		//byte�� ǥ�� ������ ���� ���� ���� ���� =128�� 1�� ���� -129�� �ƴ� 127�� ��
		//����÷������ ��
		num = (byte)(num - 1);
		System.out.println(num);
	}

}
