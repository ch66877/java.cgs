package DAY4;

public class EX10 {

	public static void main(String[] args) {
		/* 1���� 5������ ���� ���ϴ� �ڵ带 while���� �̿��Ͽ� �ۼ��ϼ���.
         *
         * �ݺ�Ƚ�� : i�� 1���� 5���� 1�� ����
         * ��Ģ�� : sum�� i�� ���� �� sum�� ����
	     * �ݺ��� ���� �� : sum�� ���*/
	          int i = 1, sum = 0;
	          while(i <=5) {
	          sum = sum + i;//sum += i;
	          i++;
              }   
              System.out.println("1���� 5���� �� : " + sum);
    		  i = 1;
    		  sum = 0;
    		  while(i <= 5) {
    			  sum += i++;
    		  }
    		  System.out.println("1���� 5���� �� : " + sum);
	}

	
}