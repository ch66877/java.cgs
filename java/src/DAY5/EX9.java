package DAY5;

public class EX9 {

	public static void main(String[] args) {
		/* ������ 7���� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * 7 X 1 =7   7 X ? =
		 * 7 x 2 =14
         * 7 X 3 =21
         * ...	
	     * 7 X 9 =63
	     *
	     *�ݺ�Ƚ�� : i�� 1���� 9���� 1�� ����
	     *��Ģ�� : 7 x i = (7*i) �� ���
	     *�ݺ������� �� : ����
	     */
		
		int num =7;
	
		for(int i = 1; i <=9; i++ ) {
						//System.out.println(num + "x" + i + "="+num * i};
		}
        /* ������ 2�� ~ 9�ܱ��� ����ϴ� �ڵ带 �ۼ��ϼ���. */
	    
	    for (num = 2; num <=9; num++) {
	    for(int i = 1; i <=81; i++ ) {
	    	System.out.println(num + "x" + i + "=" + num * i); 
	   }
   }
 }
}