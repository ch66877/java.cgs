package DAY4;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		/*3���� ���� ������ �Է� �޾� ������ ������ ���ϴ� �ڵ带 �ۼ��ϼ���. �ݺ��� �̿�
		 * ��, ������ ��ո� �˸� ��. => ������ ����� ���� �� �� �л��� ������ ����� �ʿ䰡 ����
		 * �ݺ��� Ȱ���� �� �ȵǸ� �ݺ��� ���� �غ���
		 * �ݺ�Ƚ�� 3��
		 * ��Ģ�� ���� �Է� �ް� ���� ����
		 *      Scanner�� �̿��Ͽ� ������ �����޾� num�� ������ ��,
		 *      sum�� num�� ���ؼ� sum�� ����
		 * �ݺ��� ���� �� : ������ ����ϰ�, ������ �̿��Ͽ� ����� ��� �� ��, ������ ���
		 *              sum�� ����ϰ�, sum�� 3���� ���� avg�� ������ ��; avg�� ���
		 */               
	     int  i, num, sum = 0;
         double avg;
			/*3���� ���� ������ �Է� �޾� ������ ������ ���ϴ� �ڵ带 �ۼ��ϼ���
 	        */
         Scanner scan = new Scanner(System.in);
 	     for(i=1; i <= 3; i++) {
 		 // Scanner�� �̿��Ͽ� ������ �����޾� num�� ������ ��,
 		 num = scan.nextInt();
         //sum�� num�� ���ؼ� sum�� ����
 		 sum = sum + num; //sum += num;
 	}
	     //sum�� ����ϰ�, sum�� 3���� ���� avg�� ������ ��; avg�� ���
         System.out.println("3�� �л��� ���� ���� :" + sum);
         avg = sum/ (double)3;
         System.out.println("3�� �л��� ���� ���� :" + avg);
         scan.close();
   }

}
