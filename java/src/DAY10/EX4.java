package DAY10;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		/* �Ʒ��� ���� ��µǵ��� �ڵ带 �ۼ��ϼ���.
		 * �޴�
		 * 1. ��ǥ����
		 * 2. ��ǥ���
		 * 3. ����
		 * �޴� ���� : 1
		 * ��ǥ�� �Է��ϼ��� (�� : 1 2 3) : 1 2 3
		 * �޴�
		 * 1. ��ǥ����
		 * 2. ��ǥ���
		 * 3. ����
		 * �޴� ���� : 2
		 * (1,2,3)
		 * �޴�
		 * 1. ��ǥ����
		 * 2. ��ǥ���
		 * 3. ����
		 * �޴� ���� : 3
		 * ���α׷� ����
		 */
		 Scanner scan = new Scanner(System.in);
		 int menu = 0;
		 Point3D1 pt = new Point3D1(0,0,0);
		 for( ; menu !=3 ; ) {
			 System.out.println("1.��ǥ����");
			 System.out.println("2.��ǥ���");
			 System.out.println("3.����");
			 System.out.println("�޴��� �����ϼ��� : ");
			 menu = scan.nextInt();
			 switch(menu) {
			 case 1:
				 System.out.println("��ǥ�� �Է��ϼ���(��: 1 2 3 : ");
				 int x = scan.nextInt();
				 int y = scan.nextInt();
				 int z = scan.nextInt();
				 pt = new Point3D1(x , y, z);
				 break;
			 case 2: 
				 pt.printX();
				 break;
			 case 3: 
				 System.out.println("���α׷� ����");
				 break;
			 default: 
               System.out.println("�߸��� �޴��Դϴ�.");
				 
			 }
		 }
         scan.close();			 
	}

}

/* ���� ������ ������ 3�������� ���� ��Ÿ���� Ŭ������ �����ϼ���.
 * ���� : �� x, �� y, �� z 
 * ��� : ��ǥ�� ����ϴ� ���
 */
class Point3D1{
	int x, y, z;
	void printX() {
		System.out.println(x);
	}
    void printY() {
		System.out.println(y);
	}
	void printZ() {
		System.out.println(z);
	}
	public Point3D1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}