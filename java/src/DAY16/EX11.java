package DAY16;

import java.util.StringTokenizer;

public class EX11 {

	public static void main(String[] args) {
		/* - ���ڿ�.split(����ǥ����)�� �����ϸ� ���ڿ� �迭�� ��������
		 * - StringTokenizer�� �ݺ����� �̿��Ͽ� ���ڿ��� �ϳ��� �����ٰ� Ȱ���ؾ���.
		 * - split�� StringTokenlizer�� ���̴� ����ǥ���İ� ������
		 * */

		String hobby = "�,����,�״Ͻ�,����,��ȭ";
		StringTokenizer st = new StringTokenizer(hobby, ",");
		System.out.println("��� : ");
		//hasMoreTokens : ���� �׸� �ִ��� Ȯ��
		while(st.hasMoreElements()) {
			String tmp = st.nextToken();//���� �׸��� ������
			System.out.println(tmp + " ");
		}
	}

}
