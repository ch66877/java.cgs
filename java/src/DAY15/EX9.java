package DAY15;

public class EX9 {

	public static void main(String[] args) {
		/* ���ڿ��� �־����� �־��� ���ڿ��� a�� � �ִ��� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���. 
		 * abca => 2
		 * abc => 1
		 * bc => 0*/
		String str = null;
		int count = 0;
		try {
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i) == 'a') {
					count++;
				}
			}
		}catch(NullPointerException e) {
			System.out.println("��ü�� ����ֽ��ϴ�.");
		}
		System.out.println("���ڿ����� a�� " + count+"�� �ֽ��ϴ�.");
	}

}
