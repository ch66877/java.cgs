package DAY15;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		/* 5��¥�� ���� �迭�� ���� �� ��, 
		 * ������ �Է¹޾� �Է¹��� ������ �迭�� �����ϰ�, ����ϴ� �ڵ带 �ۼ��ϼ���. 
		 * ��, �߰��� �߸��� ���� �Է��ϸ� �ٽ� �Է¹޵��� �ڵ带 �ۼ�.
		 *  */
		Scanner scan = new Scanner(System.in);
		int max = 5;
		int arr[] = new int[max];
		int count = 0;
		//1 2 3 4 a 5
		//1 a 2 3 4 5
		while(count < 5) {
			try {
				System.out.print(count+1 +"��° ���� �Է� : ");
				arr[count] = scan.nextInt();
				count++;
			}catch(Exception e) {
				System.out.println("�Է��� ���� ������ �ƴմϴ�.");
				/* - ���� �Ǵ� ���ڿ��� �Է��ϰ� ���͸� ģ ���
				 * 	 �Է¹��ۿ� �ش� ������ ������ �����־ scan.next()��
				 * 	 ó���� ���� ������ ���ѷ����� ����
				 * - �����ִ� ������ �����ؼ� ���ѷ����� ������ �ʰ��ϱ� ����
				 * 	 scan.next()�� ���� */
				scan.next();
			}
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("���α׷� ����");
		scan.close();
	}

}
