package DAY15;

public class EX2 {

	public static void main(String[] args) {
		//���� Ŭ���� ���� �� ��ü�� ����
				Test test = new TestA();
				test.test();
				//���� Ŭ���� ���� ���� �̸� ���� Ŭ������ �ٷ� ���� ��ü�� ����
				Test test2 = new Test() {

					@Override
					public void test() {
						System.out.println("�׽�Ʈ2");
					}
				};
				test2.test();
			}

		}

		interface Test{
			void test();
		}

		class TestA implements Test{

			@Override
			public void test() {
				System.out.println("�׽�Ʈ");
			}
}
