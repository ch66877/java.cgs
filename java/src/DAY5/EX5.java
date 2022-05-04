package DAY5;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		/* �������� ������ ��(1~100)�� ���ߴ� ������ �ۼ��ϼ���.
		 * ������ �Է����� �� �Է��� �������� �������� ������ ���� ũ�� UP, ������ DOWN�� ǥ��,
		 * ������ ������ϴٶ�� ǥ��
		 * �������� ������ �� : 40
		 * �Է� : 100
		 * DOWN
		 * �Է� : 50
		 * DOWN
		 * �Է� : 25
		 * UP
		 * �Է� : 40
		 * �����Դϴ�.
		 * 
		 **/
		int min = 1, max = 100;
		int r = (int)(Math.random() * (max-min+1) + min);
		Scanner scan = new Scanner(System.in);
		int num;

		System.out.println("�������� ������ ��(1~100) : " + r);

		do {
			//������ �Է¹ް�,
			System.out.print("1~100������ ������ �Է��ϼ��� : ");
			num = scan.nextInt(); 

			//1�̸� 100�ʰ��� ��� ��ŵ
			if(num < 1 || num > 100) {
				continue;
			}
			//�Է¹��� ���� num�� �����Ѽ� r���� ũ�� DOWN�̶�� ����ϰ�,
			if(num > r) {
				System.out.println("DOWN");
			}
			//�Է¹��� ���� num�� �����Ѽ� r���� ������ UP�̶�� ��� 
			else if(num < r){
				System.out.println("UP");
			}
		}while(num != r);
		System.out.println("�����Դϴ�.");
		scan.close();
	}

}
