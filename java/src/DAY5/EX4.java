package DAY5;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		/* �޴� ��� ������ do while������ �ۼ��ϼ���.*/
       
		int menu;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�޴�");
			System.out.print("1.�л������Է�");
			System.out.print("2.�л��������");
			System.out.print("3.�л���������");
			System.out.print("4.�л���������");
			System.out.print("5.���α׷� ����");
			System.out.print("�޴��� �����ϼ��� : ");
            menu = scan.nextInt();
		}while(menu != 5);
        scan.close();

	}

}
