package DAY5;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		/* �������� ������ ��(1~100)�a ���ߴ� ������ �ۼ��ϼ���.
		 * ������ �Է����� �� �Է��� �������� �������� ������ ���� ũ�� UP, ������ DOWN�� ǥ��.
		 * ������ �³����ϴٶ�� ǥ��
		 * �������� ������ �� : 40
		 * �Է� : 100
		 * DOWN
		 * �Է� : 50
		 * DOWN
		 * �Է� : 25 
		 * DOWN
		 * �Է� : 40
		 * �����Դϴ�.
		 * �ݺ�Ƚ�� : 
		 * ��Ģ�� : 
		 *        �Է¹��� ����num�� �����Ѽ� r�� ������ �����Դϴ�.��� ����� �� �ݺ����� ����������,
		 *        �Է¹��� ����num�� �����Ѽ� r�� ���� �ʰ� r���� ũ�� DOWN�̶�� ����ϰ�,
		 *        �Է¹��� ����num�� �����Ѽ� r�� ���ų� ũ�� ������ UP�̶�� ���
         */
		 int min = 1, max = 100;
		 int r = (int)(Math.random() * (max-min+1) + min);
		 Scanner scan = new Scanner(System.in);
		 int num ;
		 System.out.println(r + " �������� ������ ��(1~100) : ");
	          do {	
	        	  System.out.println("1~100������ ������ �Է��ϼ��� :");
	        	   num = scan.nextInt();
	        	 if(num < 1 || num > 100) {
	        		 continue;
	        	 }
	        	   if(num > r) {
	        		  System.out.println("DOWN");
	        	 }
	        	  else if(num < r) {
	        		  System.out.println("UP");
	        	 }

	      }while(num != r);
	          System.out.println("�����Դϴ�.");
	          scan.close();
	}
	
}