package DAY11;

public class EX2 {

	public static void main(String[] args) {
		Test t = new Test(4);
		t.print();
		System.out.println("------");
        Test2.print();
	}

}

class Test{
	//1.Ÿ���� �⺻������ �ʱ�ȭ
	int num1;
	//2.����� �ʱ�ȭ
	int num2 = 2;
	int num3 = -1;
	//3. �ʱ�ȭ ����� �̿��� �ʱ�ȭ
	{
		num3 = 3;
	}
	int num4 = -1;
	void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);	
	}
	//4. �����ڸ� �̿��� �ʱ�ȭ
	public Test(int num4) {
		this.num4 = num4;
	}
}
class Test2{
	//1. Ÿ���� �⺻���� ���� �ʱ�ȭ
	static int num1;
	//2. ����� �ʱ�ȭ
	static int num2 = 2;
	static int num3 = -1;
	//3. �ʱ�ȭ ��Ͽ� ���� �ʱ�ȭ
	static {
		num3 = 3;
	}
	public static void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}