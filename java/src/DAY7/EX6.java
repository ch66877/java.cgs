package DAY7;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		/* 1~45������ �ߺ����� ���� �� 7���� ��⿡ �����ϴ� �ڵ带 �ۼ��ϼ���.
		 */
        int lotto[] = new int[7];// 6������ ���ʽ� ��ȣ
	    int count = 0;//�迭�� ����� �ߺ����� ���� ������ ����
	    for( ; count < 7 ; ) {
	    	int r = (int)(Math.random()*45 + 1);
	    	int i;
	    	for(i=0 ; i<count ; i++ ) {
	    		if(r == lotto[1]) {
	    			break;
	    		}
	    	}
	    	if(i == count) {
	    		lotto[count++] = r;
	    		System.out.println(r + " ");
	    	}
	    }
	    /*����� ��ȣ : 1~ 45 ������ ���� 6���� �Է¹޾� user�迭�� �����ϴ� �ڵ带 �ۼ��ϼ���.*/
	    int user[] = new int[6];
	    Scanner scan = new Scanner(System.in);
	    System.out.println("�ζ� ��ȣ �Է� : ");
	    for(int i = 0; i<user.length; i++) {
	    	user[1] = scan.nextInt();
 	    }
	    /* �ζǹ�ȣ�� ����� ��ȣ�� �̿��Ͽ� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
	    * 1�� : 6�� ����
	    * 2�� : 5�� + ���ʽ�(6����) ��ȣ ����
	    * 3�� : 5�� ���� 
	    * 4�� : 4�� ����
	    * 5�� : 3�� ����  
	    * �� : �� ��
	    */
	    int count2 = 0; //��ġ�ϴ� ��ȣ�� ����
	    for(int i = 0; i<user.length; i++) {
	    	for(int j = 0; j<user.length; j++) {
	    		if(lotto[i] ==user[j]) {
	    			count2++;
	    			
	    		}
	    	}
	    }
	    switch(count2) {
	    case 6:
	    	System.out.println("1��");
	    	break;
	    case 5:
	    	int k;
	    	for(k=0; k<user.length; k++) {
	    		if(user[k] == lotto[6]) {
	    			break;
	    		}
	    	}
	    	if(k == user.length) {
	    		System.out.println("3��");
	        }else {
	        	System.out.println("2��");
	        }
	    	break;
	    case 4:
	    	System.out.println("4��");
	    	break;
	    case 3:
	    	System.out.println("5��");
	    	break;
	    default:
	    	System.out.println("��");
	    	break;
	    }
	    scan.close();
	}
	
}
