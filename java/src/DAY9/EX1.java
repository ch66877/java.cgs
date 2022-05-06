package DAY9;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		/* 1~4������ �ߺ��������� 3���� ���� �����Ͽ� �迭�� �����ϰ� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * contains�� printArray�� �̿� */
		 //3��¥�� �迭�� ����
		 int lotto[] = new int[3];
		 int min = 1; int max = 4;
		 //����� ������ 3���� �ɶ����� : count�� 3���� �ƴϸ� ����(count�� 3���� ������ ����)
		    int count = 0;
		    for( ; count < 3 ; ) {
			    //1~4������ ������ �� ����
		    	int r = (int)(Math.random()*(max - min + 1) + min);
		    	
		    	//�迭�� count����ŭ ������ ���� ���Ͽ� �ִ��� ������ Ȯ���ؼ� ������ �迭�� �����Ѽ� �����ϰ�, �迭 count������ �����Ѽ� �����ϰ�,
			    //count�� 1����
		    		if(!contains(lotto, count)) {
		    			lotto[count] = r;
		    			count++;
		    		}
		        }
		        //�迭�� ���
		    	printArray(lotto);
		    	//����ڰ� 1~9������ ���� 3���� �Է�
		    	int user[] = new int[3];
		    	int strike = 0, ball =0;
		    	Scanner scan = new Scanner(System.in);
		    	do {
		    		strike = 0;
		    		ball = 0;
		    		//����ڰ� 1~9������ ���� 3���� �Է�
		    		System.out.print("�Է� :");
		    		for(int i = 0; i<user.length; i++) {
		    			user[i] = scan.nextInt();
		    		}
		    		//��Ʈ����ũ ���� Ȯ��
		    		strike = getStrike(lotto, user);
		    		//���� ���� Ȯ��
		    		ball = getBall(lotto, user);
		    		//��� ���
		    		printResult(strike, ball);
		    	}while(strike < 3);
		        scan.close();
    }
	private static void printResult(int strike, int ball) {
		
	}
	/* ��� : ������ �迭���� ó������ n���߿��� ���� num�� �ִ��� ������ �˷��ִ� �޼ҵ�
	 */
	public static boolean contains(int arr[], int num) {
   	 if(arr == null || arr.length == 0) {
   		 return false;
   	 }

   	 for(int tmp : arr) {
   		 if(tmp == num) {
   			return true;
   		 }
   	 }
   	 return false;  	 
    }

    /* ��� : ������ �迭�� �־����� ��, �־��� �迭�� ���� �ֿܼ� ����ϴ� �޼ҵ�
     */ 
	  public static void printArray(int num[]) {
	    	if(num == null || num.length == 0) {
	    		System.out.println("����� �迭�� �����ϴ�.");
	    	    return;
	    	}
	        for(int i = 0; i < num.length; i++) {
	        	System.out.println(num[i] + " ");
	        }
		    System.out.println();
		 }
	  /*��� : ������ �迭 2���� �־����� ��Ʈ����ũ ����(���� �ڸ����� ��ġ�ϴ� ������ ����)�� �˷��ִ� �޼ҵ�
	   * �Ű����� : ������ �迭 2�� => int arr1 [],int arr2 []
	   * ����Ÿ�� : ��Ʈ����ũ ���� => ���� => int
	   * �޼ҵ�� : getStrike
	   */
	  public static int getStrike(int arr1[], int arr2[]) {
		  if(arr1 == null || arr2 == null) {
			  return 0;
		  }
		  int strike = 0;
		  int count = arr1.length > arr2.length ? arr2.length :arr1.length;
		  for(int i = 0; i<count; i++) {
			  if(arr1[i] == arr2[i]) {
				  strike++;
			  }
		  }
		  return strike;
	  }
	  /*��� : ������ �迭 2���� �־����� �� ����(�ٸ� �ڸ����� ��ġ�ϴ� ������ ����)�� �˷��ִ� �޼ҵ�
	   * �Ű����� : ������ �迭 2�� => int arr1 [],int arr2 []
	   * ����Ÿ�� : �� ���� => ����=> int
	   * �޼ҵ�� : getBall
	   */
	  public static int getBall(int arr1[], int arr2[]) {
		  if(arr1 == null || arr2 == null) {
			  return 0;
		  }
		  int ball = 0;
		  //��ü ��ġ�ϴ� ���� = �� + ��Ʈ����ũ�� ����
		  for(int tmp : arr1) {
			  if(contains(arr2, arr2.length)) {
				  ball++;
			  }
		  }
		  //���� ���� : ��ü��ġ�ϴ°��� - ��Ʈ����ũ ���� 
		  return ball - getStrike(arr1, arr2);
	  }
      /* ��� : ��Ʈ����ũ�� ���� ������ �־����� ����� �ֿܼ� ����ϴ� �޼ҵ�
       * �Ű����� : ��Ʈ����ũ�� ���� ���� => int strike, int ball  
       * ����Ÿ�� : ���� => void
       * �޼ҵ�� : printResult
       */
	  public static void printArray(int strike, int ball) {
		  if(strike != 0) {
			  System.out.print(strike + "S");
		  }
		  if(ball != 0) {
			  System.out.print(ball + "b");
		  }
		  if(strike == 0 && ball == 0 ) {
			  System.out.println("0");
		  }
		  System.out.println();
	  }
}
