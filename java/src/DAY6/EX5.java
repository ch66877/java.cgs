package DAY6;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		/* �л� 3���� ���� ������ �Է¹ް� ������ ����� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, �л� 3���� ������ ������ ����� ����� ��, �л� 3���� ������ ����ϼ���.
		 */
		//��� ���� : �??
		
		//�ݺ��� : ���??
		    //�л��� ������ �Է�
		//�󺹹��� �̿��Ͽ� ������ ���
		//������ �̿��Ͽ� ����� ���
		//������ ����� ���
		//�ݺ����� �̿��Ͽ� �л� ������ ���
		int [] score = new int [3];
		Scanner scan = new Scanner(System.in);
		//��� ���� : �??
		int sum = 0;
		double avg = 0;
		for(int i = 0;i<score.length; i++) {
			//�ݺ��� : ���??
			System.out.print(i+1+"��° �л� ���� : ");
			score[1] = scan.nextInt();
			//�л��� ������ �Է�
		}
		for(int i = 0;i<score.length; i++) {
			sum += score[1];
			//�󺹹��� �̿��Ͽ� ������ ���
		}
		avg = sum / (double)score.length;
		//������ �̿��Ͽ� ����� ���
		System.out.println("�л� 3���� ������ " +sum+"���̰�, �����"+avg+"���Դϴ�.");
		//������ ����� ���
		for(int i = 0;i<score.length; i++) {
			System.out.print(i+1+"��° �л� ���� : " + score[1]);
			//�ݺ����� �̿��Ͽ� �л� ������ ���
		}
		
	}

}

