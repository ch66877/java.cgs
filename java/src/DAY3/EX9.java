package DAY3;

import java.util.Scanner;

public class EX9 {

	public static void main(String[] args) {
        /* �� ������ ��� �����ڸ� �Է¹޾� ��� ���� ����� ����ϴ� �ڵ带 switch������ �ۼ��ϼ���.
         * ��� �����ڰ� �ƴ� ��� ??�� ��������ڰ� �ƴմϴٷ� ���
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("�� ������ ��������ڸ� �Է��ϼ���(�� : 1 / 2) : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        char op  = scan.next().charAt(0);
        System.out.println(num1 + op + num2);
        
        switch(op) {
        case '+':
        	System.out.println(
           break;
        case '-':
        	System.out.println(
           break;
        case '/':
        	System.out.println(
           break;
        case '*':
        	System.out.println(
           break;
        case '%':
        	System.out.println(
           break;
        default:
        	System.out.println(op+"�� ��� �����ڰ� �ƴմϴ�.")
        }
	}

}