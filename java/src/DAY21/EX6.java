package DAY21;

import java.util.function.Consumer;

import DAY21.Outer.Inner;

public class EX6 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = o.new Inner();
		i.method();
	}

}
/* ���ٽĿ��� Ŭ���� �ʵ忡 �� ���� ���� */
class Outer{
	
	public int outerField = 10;
	
	class Inner{
		int innterField = 20;
	    void method() {
	    	int localField = 10;
	    	//localField = 20;//���ٽĿ��� localField�� ������̱� ������, localField���� �ٲٸ�
	    	                  //final�� �������� �ʾ� ���ٽĿ��� ������ �߻�
	    	Consumer<Integer> co = (Integer a)->{
				System.out.println("outerField : " + outerField);
				//�ٱ� Ŭ������ �ʵ忡 �����ϴ� ��� : �ٱ�Ŭ������.this.�ʵ��
				System.out.println("outerField : " + Outer.this.outerField);

				System.out.println("innerField : " + innterField);
				//���� Ŭ������ �ʵ忡 �����ϴ� ��� : this.�ʵ��
				System.out.println("innerField : " + this.innterField);

				System.out.println("localField : " + localField);
			};
			co.accept(1);
		}
	}

}