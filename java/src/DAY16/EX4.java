package DAY16;

public class EX4 {

	public static void main(String[] args) {
		/* - ���ڿ��� ���ͷ� ���ڿ��� �ʱ�ȭ �ϸ� ���� ���ͷ� ���ڿ���
		 *   �ʱ�ȭ�� �ٸ� ���ڿ��� ����.
		 * - �����ڸ� �̿��ϸ� ���� ������ ���ڿ��̴��� �ٸ� �ּҿ� �Ҵ�
		 *  */
		String str1 = "abc";
        String str2 = new String("abc");
		String str3 = "abc";
		if(str1 == str2) {
			System.out.println("str1�� str2�� ���� �ּ�");
		}else {
			System.out.println("str1�� str2�� �ٸ� �ּ�");
		}
		if(str1 == str3) {
			System.out.println("str1�� str3�� ���� �ּ�");
		}else {
			System.out.println("str1�� str3�� �ٸ� �ּ�");
		}
	}

}
