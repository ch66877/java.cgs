package DAY8;

public class EX5 {

	public static void main(String[] args) {
		Point1 p1 = new Point1();
		p1.print();
		p1.x1 = 20;
		//p1.x2 = 20;//���� �߻�. ���������ڰ� private�̱� ������
		p1.x = 20;
		p1.print();
	}
    
}
/* class �տ� public�� Ŭ���� �̸��� ���� �̸��� ���� ��쿡�� ���� �� �ִ�. */
/* ��ǥ���(2���� ȭ��)���� �� ���� ��Ÿ���� Ŭ���� : point*/
class Point1{
     //������� => ��ǥ��鿡�� ���� ��Ÿ���� ���� �ʿ��� ���� => Ŭ������ �޼ҵ忡�� ���
	 //��� ������ �ʱ�ȭ�� ���� �ʾƵ� �� Ÿ���� �⺻������ �ʱ�ȭ�� �ڵ����� ��
	 //x��ǥ, y��ǥ
	 int x, y;
	 public int x1, y1;
	 private int x2, y2;
	 //�޼ҵ� => ���
	 /* ��� : ���� ��ǥ�� ����ϴ� �޼ҵ�
     * �Ű����� : ����
     * ����Ÿ�� : ���� => void
     * �޼ҵ�� : print
     */
     public void print() {
    	System.out.println(x + ", " + y);
    	x1 = 20;
    	x2 = 20;
     }
} 