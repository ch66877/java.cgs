package DAY15;

public class EX1 {

	public static void main(String[] args) {
		//A.num = 10;//x �ν��Ͻ� �����̾ Ŭ������ ���� ȣ���� �� ����
				A a = new A();//A������ ȣ��
				A.B b = a.new B();//B������ ȣ��

				A.num2 = 10;
				A.C c = new A.C();//C������ ȣ��. A��ü ���� ���� ȣ�� ����. static

				a.method(1);
			}

		}

		class A{
			public int num=1;
			public static int num2;

			B b1 = new B();
			C c1 = new C();
			//static B b2 = new B();
			static C c2 = new C();

			//�ν��Ͻ�(��ü) ��� Ŭ����
			class B{
				int num=2;
				public B() {	
					System.out.println("B������");
					System.out.println(this.num);//B��ü�� num�� ȣ��
					System.out.println(A.this.num);//�ٱ� Ŭ���� A ��ü�� num�� ȣ��
				}
			}
			//����(Ŭ����) ��� Ŭ����
			static class C{
				public C() {	System.out.println("C������");	}
			}
			public void method(int num) {
				char ch='a';
				//���� Ŭ����
				//���� Ŭ�������� �޼ҵ��� �Ű������� ���������� ����� �� �ִµ�
				//�̶� �ڵ����� final�� �ٴ´�(ó������ �ٴ°� �ƴ϶� ���ÿ��� ȣ���� �� 
				//final�� ����). �׷��� �Ű������� ���������� ����Ŭ��������
				//������ �� ����
				class D{
					public D() {	
						System.out.println("D������"); 	
						//ch = 'b';	//X
						//num = 2;	//X
					}
				}
				D d = new D();
				ch = 'c';
			}

			public A() {	System.out.println("A������");	}

}
