package DAY6;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		/* ���ڸ� �ֿܼ��� �Է¹��� ���ڸ� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, q�� �Էµɶ����� �Է��� ��������� �޽��ϴ�.
		 *�� �� q�� �Է¹����� q�� ����ϰ� �����մϴ�.
		 *�޴��� �����ϸ� ���� 2���� �Է¹޾� �Է¹��� ���� �´� ��� ������ ����ϴ�
		 *�ڵ带 �ۼ��ϼ���.
		 *
		 *��� ������ �޴�
		 *1. ���ϱ�
		 *2. ����
		 *3. ���ϱ�
		 *4. ������
		 *5. ������
		 *q. ����
		 *�޴��� �����ϼ��� : q
		 *���α׷��� �����մϴ�.
		 *����1 �Է� : 1
		 *����2 �Է� : 2
		 *1 + 2 = 3
		 **/
		Scanner scan = new Scanner(System.in);
		/*
		//���1.
		 */
	
		for( ; ; ) {
		System.out.println("��� ������ �޴�");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		System.out.println("5. ������");
		System.out.println("q. ����");
		System.out.println("�޴��� �����ϼ��� : ");
		char ch = scan.next().charAt(0);
		if(ch == 'q') {
			break;
		}
		if(ch < '1' || ch > '5') {
			System.out.println("�߸��� �������Դϴ�.");
			continue;
		}
		System.out.println("������ ��������ڸ� �Է��ϼ���(�� 1 + 2) : ");
		int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    double res = 0.0;
	    switch(ch) {
	    case '1':
	    	res = num1 + num2;
	    	System.out.println(""+num1 + '+' + num2 + "=" +res);
	    	break;
	    case '2':
	    	res = num1 + num2;
	    	System.out.println(""+num1 + '-' + num2 + "=" +res);
	    	break;
	    case '3':
	    	res = num1 + num2;
	    	System.out.println(""+num1 + '*' + num2 + "=" +res);
	    	break;
	    case '4':
	    	res = num1 + num2;
	    	System.out.println(""+num1 + '/' + num2 + "=" +res);
	    	break;
	    case '5':
	    	res = num1 + num2;
	    	System.out.println(""+num1 + '%' + num2 + "=" +res);
	    	break;
		  
		}
	    //System.out.println(""+num1 + ch + num2 + "-"+res);
     }
   
	
		/*
		//���2.
		
		char ch = 'a';
		for( ; ch != 'q' ; ) {
		System.out.println("���ڸ� �Է��ϼ��� : ");
	    ch = scan.next().charAt(0);
	    System.out.println(ch);
		}
		*/
		/*
		//���3
		 *
		char ch= 'q';
		do {
			System.out.println("���ڸ� �Է��ϼ��� : ");
		    ch = scan.next().charAt(0);
		    System.out.println(ch);
		}while(ch != 'q');
		*/
	    // scan.close();
	}
	
}

