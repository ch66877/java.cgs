package DAY12;

public class EX4 {

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.print();
	}

}
//String�� final Ŭ�����̱� ������ ����� �Ұ���
//class KoreanString extends String{}

class FinalTest{
	private final int max = 30;
	public final void print() {
		//max = 20;//������ �� ����. max�� final�� �پ��ֱ� ����
		System.out.println(max);
	}
}
class FinalTestChild extends FinalTest{
	//print()�� �������̵� �Ҽ� ���� => print()�� final�� �پ��ֱ� ����
	//public final void print() {}
}