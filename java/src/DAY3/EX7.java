package DAY3;

public class EX7 {

	public static void main(String[] args) {
        /* Ȧ�� ¦�� �Ǻ� ����
         * num�� 2�� �������� �� �������� 0�� ������ ¦����� ����ϰ�
         *�ƴϸ� Ȧ����� ����Ѵ�
         * */
         int num = 3;
	     if(num % 2 == 0) {
	    	 System.out.println(num + "¦��") ;
	     }else {
	    	 System.out.println(num + "�� Ȧ��");
	     }
	     switch(num % 2) {
	     case 0;
	         System.out.println(num + "�� ¦��");
	     case 1;
	    	 System.out.println(num + "�� Ȧ��");
	        break; 
	     }
	     switch(num % 2) {
	     case 0;
	         System.out.println(num + "�� ¦��");
	     case 1;
	    	 System.out.println(num + "�� Ȧ��");
	        break; 
    }

}
