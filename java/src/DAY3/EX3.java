package DAY3;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
        /* �� ������ ��� ������(+-*/%)�� �Է¹޾� ����ϴ� �ڵ带 �ۼ��ϼ���
         *Scanner scan = new Scanner(System.in);
         System.out.println("����1�� �Է��ϼ��� : ")
         int num1 = scan.nextInt();
         System.out.println("����2�� �Է��ϼ��� : ")
         int num2 = scan.nextInt();
         System.out.println("����������� �Է��ϼ��� : ")
         char op  = scan.next()charAt(0);
         //���� + ���� => ����
         //+�� �����ڵ�ǥ���� ������ 43�� �ش�
         //���ڿ� + ���� => ���ڿ�
         System.out.println(num1 + op + num2);
         //���2
         Scanner scan = new Scanner(System.in);
         System.out.println("������ ��������ڸ� �Է��ϼ���(�� 1 + 2) : ")
         int num3 = scan.nextInt();
         int num4 = scan.nextInt();
         char op1  = scan.next()charAt(0);
         System.out.println(num3 + op1 + num4);        
         scan.close();
	}
	
}