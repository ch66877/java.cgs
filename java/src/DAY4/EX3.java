package DAY4;

public class EX3 {

	public static void main(String[] args) {
	/* �ݺ����� �̿��Ͽ� a���� z���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	 * �ݺ�Ƚ�� : 26��
	 * ���๮ : (char) ('a'+1)�� ���	 
	 * �ݺ��� ���� �� : ����
	 */
	 int  i;	
     
	 for(i =0; i <26; i++) {
     
    	 System.out.println((char)('a'+1));
     }
	 System.out.println();
	 char j;
     
     for(j= 'a'; j <= 'z' ; i++) {
	     System.out.print(j);
     } 
     int num1 = 1;
     char ch1 = 'a' + 1;//���ͷ���� 1�� charŸ���̾ Ÿ�Ժ�ȯ�� �߻����� ����
     char ch2 = (char) ('a' + num1 );//num1�� 1�� intŸ���̾ Ÿ�Ժ�ȯ�� �߻��ϰ�, ����Ÿ�� ��ȯ�� ���� �ʴ� ��Ȳ�̾ ����
    }

}	