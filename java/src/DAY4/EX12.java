package DAY4;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		/* ������ ���� �޴��� ��µǰ�, ���� �޴��� �Է��� ������ �ݺ��ϴ� �ڵ带 while������ �ۼ��ϼ���
	    
	    
	    *�޴�
	    *1.�л������Է�
        *2.�л��������
        *3.�л���������
        *4.�л���������
        *5.���α׷� ����
        *�޴��� �����ϼ��� :
        *
        *�ݺ�Ƚ�� : menu�� 5�� �ƴ� ������
        *��Ģ�� : �޴��� ����ϰ� Scanner�� ���� �޴��� �Է¹޾� menu�� ����
        *�ݺ��� ���� �� : ����
        */	

		int menu = -1;
		Scanner scan = new Scanner(System.in);
		//menu�� 5�� �ƴ� ������
		while(menu != 5) {
			System.out.print("�޴�");
			System.out.print("1.�л������Է�");
			System.out.print("2.�л��������");
			System.out.print("3.�л���������");
			System.out.print("4.�л���������");
			System.out.print("5.���α׷� ����");
			System.out.print("�޴��� �����ϼ��� : ");
			//�޴��� ����ϰ� Scanner�� ���� �޴��� �Է¹޾� menu�� ����
			menu = scan.nextInt();
		
			System.out.print("��� 1 ����");
		while(true) {
			System.out.print("�޴�");
			System.out.print("1.�л������Է�");
			System.out.print("2.�л��������");
			System.out.print("3.�л���������");
			System.out.print("4�л���������");
			System.out.print("5.���α׷� ����");
			System.out.print("6.�޴��� �����ϼ��� : ");
			//�޴��� ����ϰ� Scanner�� ���� �޴��� �Է¹޾� menu�� ����
			menu = scan.nextInt();
			if(menu == 5) {
				break;
			}
		}	
	
		scan.close();
	}

  }
	
}