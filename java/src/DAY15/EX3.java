package DAY15;

public class EX3 {
	
	public static void main(String[] args) {
		String str1 = "abc";
		System.out.println(str1.charAt(0));
		String str2 = null;
		//System.out.println(str2.charAt(0));//��� ǥ��, ���� �߻�
		/* ���ܰ� ���� �߻��ϴ� ��� 1 : �޼ҵ带 ȣ�� �ϴ� ��� �޼ҵ忡�� null ó���� ���ϸ� �߻��� �� ���� */
		//charAt(str2, 0);//��� ǥ�� x, ���� �߻�
		/* ���ܰ� ���� �߻��ϴ� ��� 2 : Ŭ������ �̿��Ͽ� �迭�� ����� ���. �� ���� ��ü�� ������ ���/��������� ȣ���ؾ� �ϴµ�
		 * ��ü ������ �ذ� ���/��������� ȣ���ϴ� ���*/
		String arr[] = new String[10];
		for(String tmp : arr) {
			System.out.println(tmp.charAt(0));
		}

	}
	public static void charAt(String str, int index) {
		System.out.println(str.charAt(index));
	}
}
