package DAY3;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		// �� ������ ��� �����ڸ� �Է¹޾� ��� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		Scanner scan = new Scanner(System.in);
        System.out.println("������ ��������ڸ� �Է��ϼ���(�� 1 + 2) : ")
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        char op1  = scan.next()charAt(0);
        System.out.println(num3 + op1 + num4);        

        if(op1 == '+') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 + num4));
        }else if(op1 == '-') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 - num4));
		}else if(op1 == '*') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 * num4));
		}else if(op1 == '/') {
			System.out.println(""+num3 + op1 + num4 + "=" + ((double)num3 / num4));
		}else if(op1 == '%') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 % num4));
		}else{
			System.out.println(op1+"�� ��� �����ڰ� �ƴմϴ�.");
	    int res = (int)(1 / 2.0);
	    double res2 = 1/2;
	    
	    scan.close();
		}

}
