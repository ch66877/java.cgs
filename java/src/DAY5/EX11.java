package DAY5;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		/* ���� �߱� ������ �ۼ��ϼ���.
		 * �ߺ����� ���� 1~9������ �� ������ �Է¹ھ� ���ߴ� ����
		 * �Է� : 1 2 3   
		 * 1             
		 * �Է� : 4 5 6   
		 * O            
		 * �Է� : 7 8 9
		 * 2S
		 * �Է� : 8 3 9
		 * 1S2B
		 * �Է� : 3 8 9
		 * 3S
		 * ���α׷� ����
		 * �ݺ�Ƚ�� : s�� 3���� ���������� �ݺ�;
		 * ��Ģ�� : ���� 3���� �Է� ����
         *        com1�� user1�� ������ s�� 1����
         *        com2�� user2�� ������ s�� 1����
         *        com3�� user3�� ������ s�� 1����
         *        com1�� user2�� ���ų� com1�� user3�� ������ b�� 1����
         *        com2�� user1�� ���ų� com2�� user3�� ������ b�� 1����
         *        com3�� user1�� ���ų� com3�� user2�� ������ b�� 1����
         *        s�� 0�� �ƴϸ� s�� ������ s�� ���
         *        b�� 0�� �ƴϸ� b�� ������ b�� ���
         *        s�� 0�ư� b�� 0�̸� o�� ���
         *        ����
         */
      
		int com1 = 3, com2 = 8, com3 = 9;
        int user1, user2, user3;
	    int s= 0, b = 0;
	    Scanner scan = new Scanner(System.in);
	    	while(s<3) {
	    	    System.out.print("1~9������ ������ �ߺ����� �ʰ� �Է��ϼ���(��:1 2 3) : ");
	    	    user1 = scan.nextInt();
				user2 = scan.nextInt();
				user3 = scan.nextInt();
	    	   	//���� 3���� �Է� ����
	    	s = 0;
	    	b = 0;
	    //s�� b�� ���� 0���� �ʱ�ȭ
	    if(com1 == user1) {	
	    	s++;
	    //com1�� user2�� ���ų� com1�� user3�� ������ b�� 1����
	    }
	    if(com2 == user2) {	
	    	s++;
	    //com2�� user1�� ���ų� com2�� user3�� ������ b�� 1����
	    }
	    if(com3 == user3) {	
	    	s++;
	    //com3�� user1�� ���ų� com3�� user2�� ������ b�� 1����
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
	    }
    }
}
