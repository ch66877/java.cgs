package DAY2;

public class EX4 {

	public static void main(String[] args) {
		/* ���ڿ� + ���ڿ� => ���ڿ�
		 * ���ڿ� + ���� => ���ڿ�
		 * ���ڿ� + ���� => ���ڿ�
		 * ���ڿ� + �Ǽ� => ���ڿ�
		 * ���ڿ� + ���� => ���ڿ�
		 * */
		String str = "Hello";
		str = str + " world";
		System.out.println(str);
		str = str + '!';
		System.out.println(str);
		str = str + 123;
		System.out.println(str);
		str = str + 3.45;
		System.out.println(str);
		str = str + true;
		System.out.println(str);
}