package DAY7;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		/*���� 3��¥�� �迭 com�� ���� �� �� �������� 1~9������ �� ������ �����
		 *  �迭�� �����ϴ� �ڵ带 �ۼ��ϼ���. (�ߺ� ����)*/

		int min = 1, max = 3;
		int com[] = new int[3];
		int user[] = new int[3];
	    Scanner scan = new Scanner(System.in);
	    /*�������� ������ ���� �迭�� ����� ������ ���Ͽ� �ߺ��� ���� ������ �迭�� ����, ������ �ǳʶ�
	    * [0, 0, 0] : 0
	    * 1 => [1, 0, 0] : 1
	    * 1
	    * 5 => [1, 0, 0] : 2
	    * 5
	    * 2 => [1, 0, 0] : 3
	    */
	    int count = 0;
		for( ; count < 3; ) {
			//������ �� ����
			int r = (int)(Math.random() * (max-min+1) + min);
			//������ ���� ����� �迭������ ���Ͽ� �ߺ��� �ȵǸ� ����
			int i=0;
			for(; i < count; i++) {
				if(r == com[1]) {
					break;
				}
			}
		    //�ݺ��� ���� �� i�� count�� ���ٴ� �ǹ̴� �ߺ��� ���� ���ٴ� �ǹ�
	        if(i == count) {
	        	com[count] = r ;
	          System.out.println(com[count] + " ");
	          count++;
	        }
		}
		System.out.println();
	    /* ����ڰ� ���� 3���� �Է��Ͽ� 3s�� �ɶ����� ������ �����ϵ��� �ڵ带 �ۼ��ϼ���.
        * ��, ����ڰ� �Է��� ������ �迭�� ����.
        */	
	    int s, b;
	    do {
	    	s = 0;
	    	b = 0;
	    	//���� 3���� �Է� ����
	    	System.out.println("1~9������ ������ �ߺ����� �ʰ� �Է��ϼ���(��:1 2 3 : ");
	        for(int i = 0; i<user.length; i++) {
	    	        user[i] = scan.nextInt();
	        }	
	    
	    //��Ʈ����ũ ���� Ȯ��
	    for(int i = 0; i < com.length; i++) {
	    	if(com[i] == user[i]) {
	    		     s++;
	    	}
	    }
	    //�� ���� Ȯ��
	    for(int i = 0; i < com.length; i++) {
	            for(int j = 0; j<user.length; j++) {
	    	   if(i ==j) {
	    		   continue;
	    	   }
	    	   if(com[i] == user[j]) {
	    		   b++;
	    	   }
	       }
	    }
	    s = 0;
    	b = 0;
    	//��Ʈ����ũ�� �� ������ ���� Ȯ��
    	for(int i = 0; i < com.length; i++) {
 	            for(int j = 0; j<user.length; j++) {
 	        	        //���� ���ڰ� ������
 	    	           if(com[i] == user[j]) {
 	    		               //���� �ڸ��̸� ��Ʈ����ũ,�ٸ� �ڸ��� ��
 	    	        	       if(i ==j) {
 	    	        	    	      s++;
 	    	        	       }else {
 	    	        	    	      b++;
 	    	                   }
 	    	           }
 	            }
    	}        
	    if(s !=0 ) {
	         System.out.print(s + "S");
	    }
        //s�� 0�� �ƴϸ� s�� ������ s�� ���
        if(b !=0 ) {
              System.out.print(b + "b");
       	//b�� 0�� �ƴϸ� b�� ������ b�� ���
        }
        if(s == 00 && b == 0 ) {
       	      System.out.print("0");
        //s�� 0�ư� b�� 0�̸� o�� ���
        }  
       	System.out.println();
 	  }while(s < 3);
 	   scan.close();    
     }
	
}