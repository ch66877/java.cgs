package DAY23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX1_UpDownGame {

	public static void main(String[] args) {
		/* - 1~100������ ������ ���� ���ߴ� Up Down ���� ���α׷��� �ۼ��ϼ���.
		 * - ����� �����ϴ� ����� �߰�
		 * - ����� �ִ� 5�����
		 * - 5���̳��� ����� �̸��� ����Ͽ� ����
		 * - �� ����� ���� ����� ���� �� �ִ�
		 * - ���� ��Ȥ�� ��� ��ϵ� �������
		 * 1. �÷���
		 * 2. ���Ȯ��
		 * 3. ���� 
		 * */
        List list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		int max = 100, min = 1;
		list.add(new Record(1, "�ϱ浿"));
		list.add(new Record(7, "�̱浿"));
		list.add(new Record(8, "��浿"));
		//list.add(new Record(9, "��浿"));
		//list.add(new Record(10, "�ϱ浿"));
		
		do {
			System.out.println("1. �÷���");
			System.out.println("2. ���Ȯ��");
			System.out.println("3. ����");
			System.out.println("�޴� Ȯ��");
			int menu1 = scan.nextInt();
	   
		switch(menu) {
		case 1:
			//���� �÷���
			//������ �� ����
			int r = (int)(Math.random()*(max-min+1)+min);
			int count = 0;//�õ� Ƚ��
			//���⶧���� ������ �ݺ�
			while(true) {
				//���ڸ� �Է¹޾Ƽ� ��
				System.out.println("���� �Է�(1~100) : ");
				int num = scan.nextInt();
				count++;
				if(num > r)
					System.out.println("DOWN");
				else if(num < r)
					System.out.println("UP");
				else
					break;
			}
		    System.out.println("�����Դϴ�.");
			//�� ��� Ȯ��
			//�� ����̸�(5���̳��̸�)
			//�̸� �Է��ϰ� ����
		    int i;
			for(i = 0; i<list.size(); i++) {
				if(((Record) list.get(i)).getCount() > count) {
			             break;
				}
			}
			//list.size() < 5 : ����� ����� 5�� �̸�
			//i < list.size() : ����� ����� 5�� �̻� �߿� ���� �÷����� Ƚ����
			//					����� ���Ե� ��
			//					������ break�� �����ϸ� i�� list.size()���� �۰�
			//					break�� ���� ���ϸ� i�� list.size()
			if(list.size() < 5 || i < list.size() ) {
				System.out.println("���ο� ����� �޼��ƽ��ϴ�. ����� �����ϼ���.");
				System.out.print("�̸� : ");

				list.add(i, new Record(count, scan.next()));
				list = list.subList(0, list.size() > 5 ? 5 : list.size());
			}
			break;
		case 2:
			for(int j = 0; j<list.size(); j++) {
				System.out.println(j+1+". " + list.get(j));
			}
			break;
		case 3:
			//���α׷� ����
			System.out.println("���� ����. ");
			break;
		default : 
			}
	}while(menu != 3);
			
	scan.close();
  }
		
}
class Record{
		private int count;
		private String name;

		public Record(int count, String name) {
				this.count = count;
				this.name = name;
			}

		public int getCount() {
			    return count;
				}

		@Override
		public String toString() {
				return "[ " + name + " : " + count + "]";
			}

}