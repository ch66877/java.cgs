package DAY7;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		int arr [] = {1,2,3};
		/* ���� num�� �Է� �ް�, �Է¹��� ������ �迭�� ������ Ȯ���ϴ� �ڵ带 �ۼ��ϼ���. */
		Scanner scan = new Scanner(System.in);
		int num, count = 0;
		// ���� �Է�
        System.out.println("���� �Է� : "); 
        num = scan.nextInt();
		// 0������ num�� ������ Ȯ��
		if(arr[0] == num) {
			count++;
		}
		// 1������ num�� ������ Ȯ��
        if(arr[1] == num) {
			count++;
		}
		// 2������ num�� ������ Ȯ��
        if(arr[2] == num) {
			count++;
		}
        if(count >= 1) {
        	System.out.println("�迭 arr���� "+num+"�� �ֽ��ϴ�.");
        }else {
        		System.out.println("�迭 arr���� "+num+"�� �����ϴ�.");
        }
        //�ݺ��� ���2 : ù��° �ߺ� ���ڰ� ������ Ȯ�� �ߴ�
        int i;
        for(i =0; i<arr.length; i++) {
        	if(arr[i] == num) {
        	  break;
        	}
        }
        //�ݺ������� break�� ������ i�� 3���� �۰�, break�� �ȸ����� i�� 3�� Ư���� �̿� => ������ 1������ ����
        if(i < arr.length) {
        	System.out.println("�迭 arr���� "+num+"�� �ֽ��ϴ�.");
        }else {
        		System.out.println("�迭 arr���� "+num+"�� �����ϴ�.");
        }
		// ���� ���� : �迭 ��½� �ּ�
        System.out.println(arr);
        double arr2[] = new double[2];
        System.out.println(arr2);
		scan.close();
	    
	}

}
