package DAY17;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class EX5 {

	public static void main(String[] args) {
		//�ݾ��� ����� ������ ,�� �̿��Ͽ� ǥ���ϴ� ����
	    int num = 1230000;
		DecimalFormat format = new DecimalFormat("#,###");
		String numStr = format.format(num);
		System.out.println(numStr+"��");

		//������ 1~9���̸� �տ� 0�� ���̴� ����
		int month = 1;
		format = new DecimalFormat("00");
		String monthStr = format.format(month);
		System.out.println(monthStr+"��");
		
		//ȸ�� ���̵�, �̸�, ��ȣ
		String id = "abc";
		String name = "ȫ�浿";
		String number = "010-1234-5678";
		String user1 = "���̵� : " + id + ", �̸� : " + name + ", ��ȣ : "+ number;
		System.out.println(user1);
		//���ڿ� ������ ����. ���ϴ� �������� ������ ��ġ�� {����}�� ǥ��
		String msFormat = "���̵� : {0}, �̸� : {1}, ��ȣ : {2}";
		//MessageFormat.format(���ڿ�����, ��ü��)�� �̿��Ͽ� ���ڿ� ���˿� ������ ������ �� ���ڿ� ����
		String user2 = MessageFormat.format(msFormat, id, name, number);
		System.out.println(user2);
		Object objs[] = {"abc", "ȫ�浿","010-1234-5678"};
		String user3 = MessageFormat.format(msFormat, objs);
		System.out.println(user3);
	}

}
