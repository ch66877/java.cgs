package DAY17;

import java.util.Random;

public class EX3 {

	public static void main(String[] args) {
		/* Random �����ڿ� �õ尪�� �Է� ���ϸ� ����ð��� �õ������ ������ ���� ���� 
		 * Random �����ڿ� �õ尪�� �Է� �ϸ� �Է��� ���� �̿��Ͽ� ������ ���� �����ϱ� ������ �׻� ����
		 * ������ ������ ���� ����*/
		Random r = new Random();
		int num = 5;
		for(int i = 0; i<10; i++) {
			//0�̻� 1�̸��� ����
			System.out.println(r.nextDouble());
		}
	    System.out.println("----------------");
	    for(int i = 0; i<num; i++) {
			//int�� �ּҰ����� �ִ밪 ������ ����
			System.out.println(r.nextInt());
		}
	    System.out.println("----------------");
	    int min = 1, max = 9;
	    for(int i = 0; i<num; i++) {
			//int�� �ּҰ����� �ִ밪 ������ ����
			System.out.println(r.nextInt(max - min + 1) + min);
		}
	    /* Math.random()�� ��ü�� ���� ���ϰ� ȣ���� �� ������ ���� ()�� ���Ƽ� ����
	     * RandomŬ������ nextInt(num)�� ��ü�� ���� �ϰ� ȣ���ؾ� ������ ���� ����
	     * ���⿡ �°� ���� */
	}

}
