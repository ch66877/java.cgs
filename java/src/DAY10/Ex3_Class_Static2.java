package DAY10;

public class Ex3_Class_Static2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//t1.printX();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		Test1.printY();
		/* sum�� ��ü �޼ҵ��̱� ������ Ŭ���� �޼ҵ常 main���� ȣ���Ϸ���
		 * ��ü�� ������ ��, ��ü�� ���� ȣ���ؾ��Ѵ�.
		 */
		Ex3_Class_Static2 ex3 = new Ex3_Class_Static2();
		System.out.println(sum(1,2));
	}
    public  static int sum(int num1, int num2) {
    	return num1 + num2;
    }
}

class Test1{
	int x;
	static int count;//Test1 Ŭ������ ������� ��ü�� ��
	
	void printX() {
		System.out.println(x);
	}
	static void printY() {
		System.out.println(count);
	}
	public Test1() {count++;} 
}