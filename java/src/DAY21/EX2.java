package DAY21;

public class EX2 {

	public static void main(String[] args) {
		Test1 t1 = a->System.out.println("�׽�Ʈ : " + a);

		t1.test(10);

		/* 
		Test2 t2 = (int a, int b)->{
			return a+b;
		};
		*/
		Test2 t2 = (int a, int b)->	a+b;

		System.out.println(t2.sum(10, 20));
	}

}
@FunctionalInterface
interface Test1{
	void test(int a);
	//void test2();//�ּ� �����ϸ� �߻�޼ҵ尡 2���� �Ǽ� ������ �߻�
}
@FunctionalInterface
interface Test2{
	int sum(int a, int b);
}