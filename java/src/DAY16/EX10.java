package DAY16;

public class EX10 {

	public static void main(String[] args) {
		/* - ���ڿ�.split(����ǥ����) : ���ڿ��� ����ǥ���İ� ��ġ�ϴ� �͵��� ������ �߶� �迭��
		 *   ����
		 * - String arr[] = "abc,def,fgh".split(",")�� �ϸ�
		 *   String arr[] = {"abc", "def", "fgh"};�� �����Ѱſ� ����.
		 */

		String hobby = "����, ���� ���� - ��ȭ ����-�";
		String hobbies[] = hobby.split("[,-]");
		System.out.println("��� : ");
		if(hobbies != null) {
			for(String tmp : hobbies) {
				System.out.println(tmp + " ");				
			}
			System.out.println();
		}else {
			System.out.println("����");
		}
	}

}
