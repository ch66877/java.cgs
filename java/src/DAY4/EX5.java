package DAY4;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		/*���������� �������� �Է��ϰ�, �Է��� ������ �ֿܼ� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �Է¹��� ������ �����̸� �ݺ����� ���������� �����غ�����.
		 * �ݺ�Ƚ�� : ���Ѵ�
		 * ��Ģ�� : scanner�� �̿��Ͽ� ������ �Է¹޾� num�� ����, num�� �����̸� ���� ������ �ƴϸ� num�� ���
		 * �ݺ��� ���� ��: ����
		 */
		
		int num;
		Scanner scan = new Scanner(System.in);
		//���Ѵ�
		for( ; ; ) {
			System.out.print("���� ���� �Է� : ");
			//scanner�� �̿��Ͽ� ������ �Է¹޾� num�� ����
			num = scan.nextInt();
			//num�� �����̸� ���� ������ �ƴϸ� num�� ���
 			if(num < 0) {
 				break;
 			}
			System.out.println(num);
		}
		scan.close();
	}
}
