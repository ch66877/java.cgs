package DAY5;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		/* ���� ������ �Է¹޾� �Է¹��� ������ ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * 1230 => 0�� ���, 1230 => 123
		 * 123 => 3�� ���, 123 => 12
		 * 12 => 2�� ���, 12 => 1
		 * 1 => 1�� ���, 1 => 0
		 * 
		 * 945 => 5�� ���, 945 => 94
		 * 94 => 4�� �߷�, 94 => 9
		 * 9 => 9�� ���, 9=>0
		 * 
		 * �ݺ�Ƚ�� : num�� 0�� �ƴҶ�����
		 * ��Ģ�� : num�� ���� �ڸ��� ��� �� �� num�� 10���� ���� ���� num�� ����
		 * */
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		while(num != 0 ) {
			System.out.print(num%10);
			num = num / 10;
		}
        scan.close();
      }


}
