package DAY9;

import java.util.Scanner;


public class EX3 {

	public static void main(String[] args) {
		/* 5���� �л��� ������ �Է¹޾� ������������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, �Է¹��� ������ �迭�� �����ؾ��մϴ�. */

		//�ݺ����� Scanner�� �̿��Ͽ� ������ �Է� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�(5��) : ");
		int score[] = inputCreateArray(scan, 5);

		//�ݺ����� �̿��Ͽ� ������ ����
		bubbleSort(score, false);

		//�ݺ����� �̿��Ͽ� �迭 �� ���
		printArray(score);

		scan.close();
	}

	public static void printArray(int num[]) {
		if(num == null || num.length == 0) {
			System.out.println("����� �迭�� �����ϴ�.");
			return ;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	public static int[] inputCreateArray(Scanner scan, int n) {
		if( n <= 0) {
			return null;
		}
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	/* ��� : ���� �迭�� �־����� �������� �Ǵ� ������������ �����ϴ� �޼ҵ�
	 * �Ű����� : ���� �迭, ����(Ascending)/���� ���� => int arr[], boolean asc
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : bubbleSort */
	public static void bubbleSort(int arr[], boolean asc) {
		if(arr == null) {
			return;
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				//���������� ���
				if(asc && arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				//���������� ���
				else if(!asc && arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}

	}

}
