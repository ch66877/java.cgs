package DAY5;

public class EX10 {

	public static void main(String[] args) {
		/* a              'a'���� 'a'����
		 *                'a'���� 'b'����
		 * ab
		 * abc
		 * ...
		 * abcdfg...xyz   'a���� 'z'����
		 * �ݺ�Ƚ�� : end�� 'a'���� 'z'���� 1�� ����
		 * ��Ģ�� : ch�� 'a'���� end���� 1�� �����ϸ� ch�� ���
		 */

		for(char end = 'a'; end <='z'; end++) {
			
			for(char ch = 1; ch <= end; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
