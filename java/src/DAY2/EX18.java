package DAY2;

import java.util.Scanner;

public class Ex18_Scanner {

		public static void main(String[] args) {
			/* �ܼ�â���� ������ �Է¹޴� ����
			 * System.in : �ֿܼ��� �Է�
			 * */
			Scanner scan = new Scanner(System.in);
			System.out.print("������ �Է��ϼ��� : " );
			int num1 = scan.nextInt();
			System.out.println("�Է��� ������ " + num1 + " �Դϴ�.");
			scan.close();
		}

	}