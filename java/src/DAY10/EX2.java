package DAY10;

public class EX2 {

	public static void main(String[] args) {
		//���� �߻� : print()�޼ҵ�� ��ü �޼ҵ��̱� ������ Ŭ���� �̸����� ȣ���� �� ����
		//Point.print();
		//print()��ȣ��� ��ü �޼ҵ��̱� ������ ��ü�� ���� �� ȣ���ؾ� �Ѵ�.
        Point1 p1 = new Point1(10,20);
        p1.print();
        //printdimensional() �޼ҵ�� Ŭ���� �޼ҵ��̱� ������ Ŭ���� �̸����� ȣ���� �� �ִ�
        Point1.printDimensional();
        //Ŭ���� �޼ҵ�� ��ü�� �̿��Ͽ� ȣ���� �� ������ ��� ���.
        p1.printDimensional();
        
        System.out.println();
	}

}

class Point1{
	static String dimensional="������";//Ŭ���� ����
	int x, y;//��ü����
	
	public Point1(int x, int y) {
		//�� �ʵ� x,y�� �Ű����� x,y�� ���� ����
		this.x = y;
		this.y = y;
	}
	public Point1() {
		this(0,0);
	}
	public void print() {
		System.out.println("���� : " + dimensional);
		System.out.println("��ǥ : " + x + "," + y);
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void printDimensional() {
		System.out.println("���� : " + dimensional);
	}
}