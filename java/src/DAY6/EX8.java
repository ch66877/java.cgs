package DAY6;

import java.util.Scanner;

public class EX8 {

	public static void main(String[] args) {
		/* ���� num�� ����� �迭�� ���� �� ��, ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ����� �ִ� 10���� ����
		 * num = 10
		 */
		Scanner scan = new Scanner(System.in);
	    int num = 144000;
	    int max = 10;
	    int div[] = new int[max];
	    int index = 0;
	    for(int i = 1; i<=num; i++) {
	    	if(num % i ==0) {
	    		//System.out.print(i + " ");
	    		//?������ 10���٤� ������ Ȯ���Ͽ� 10���� ������ �迭 ?������ i�� ����
	    		if(index < max) {
	    			div[index] = i;
	    			//?�� 1����
	    			index++;
	    		}
	    		
	    	}
	    }
	    //���
	    for(int i = 0; i<index; i++) {
	    	System.out.print(div[i] + " ");	
	}

  }
}