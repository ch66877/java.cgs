package TEST3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telephon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		ArrayList name = new ArrayList();
		// �̸��� ������ ArrayList name ����
		ArrayList num = new ArrayList();
		// ��ȣ�� ������ ArrayList num ����
		String na, nu;
		// �̸�, ��ȣ�� �Է¹��� ���� ����

		int menu;
		do {
			System.out.println("�޴�");
			System.out.println("1. ��ȭ��ȣ �߰�");
			System.out.println("2. ��ȭ��ȣ Ȯ��");
			System.out.println("3. ��ȭ��ȣ �˻�");
			System.out.println("4. ���α׷� ����");
			System.out.print("�޴��� �����ϼ��� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("�߱��� �̸��� �Է��ϼ���");
                na = scan.next();
                // �̸��� ��ϵǾ� ���� �ʴٸ� ����ó ����
                // indexOf�� ��ü�� ���ٸ� -1 ������ �� ��ġ�� ��ȯ
                // -1�� ��ȯ�ȴٴ°� �ߺ��� ���ٴ� ���̴�.
                if(name.indexOf(na) == -1) {
                    name.add(na);
                    System.out.println("�߱��� ��ȣ�� �Է��ϼ���");
                    nu = scan.next();
                    // �Է¹��� ��ȣ�� ArrayList num�� �߰�
                    num.add(nu);
                    System.out.println("����� �̸��� : " + na + " / ��ȣ�� : " + nu + "�Դϴ�.");
                    // �̸��� ����Ǿ� �ִٸ� �ߺ��� �̸��� �ִٰ� ��ȯ
                } else {
                    System.out.println("�ߺ��� �̸��� �ֽ��ϴ�.");
                }
				break;
			case 2:
				 System.out.println("������ ��ȭ��ȣ�� Ȯ���Ͻðڽ��ϱ�?");
	                // ����Ǿ� �ִ� ��� �̸��� Ȯ��
	                for(int i=0; i<name.size(); i++) {
	                    System.out.println("�̸� : " + name.get(i));
	                }
	                na = scan.next();
	                // Ȯ���� �̸��� �ε��� ��ȣ Ȯ��
	                // name.indexOf(na);
	                
	                // ����Ǿ� �ִ� ���� ������ -1�� ���
	                if(name.indexOf(na) == -1) {
	                    System.out.println("��Ͽ� �����ϴ�.");
	                } else {
	                    System.out.println(na + "�� ��ȣ�� " + num.get(name.indexOf(na)));
	                    
	                }
				break;
			case 3:
				System.out.print("�˻��� : ");
				String search = scan.next();
				int index = 0;
				for(String tmp : list) {
					//indexOf �̿�
					index = tmp.indexOf(search);
					if(index >= 0 ) {
						break;
					    }
				    }	
				    if(index >= 0) {
					System.out.println(name.get(index)+":"+ num.get(index));
				}
				break;
			case 4:
				System.out.println("4. ���α׷��� �����մϴ�. ");
				break;
			}
		}while(menu != 4);
		
		scan.close();
	}

}