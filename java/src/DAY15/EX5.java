package DAY15;

public class EX5 {

	public static void main(String[] args) {
		/* ���� Ŭ���� Ÿ�� ��ȯ�� �߻��� �� ����. 
		 * �θ� ��ü�� �ڽ� ��ü�� ���� Ÿ�� ��ȯ�� �� �ȵǴ� ��� �߻� */
		//Ex5_C c = (Ex5_C)new Ex5_P();
		//c.print();
		/* �޼ҵ��� �Ű������� �������� �̿��Ϸ��� Object�� �� ��� �߻��� �� �ִ�
		 * */
		String str = "abc";
		test(str);
	}
	public static void test(Object obj) {
		Ex5_C c = (Ex5_C)obj;
		c.print();
	}
}

class Ex5_P{}

class Ex5_C extends Ex5_P{
	void print() {}
}