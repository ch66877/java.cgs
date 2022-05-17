package DAY16;

import java.util.Comparator;
import java.util.Objects;

public class EX1 {

	public static void main(String[] args) {
		Integer num1 = 10, num2 = 20;
		/* Object.compare()���� ������ �Ű������� Comparator�������̽��� ��ü�� �ʷ�
		 * => Comparator �������̽��� ���� Ŭ������ �ʿ�
		 * => ���� Ŭ���� ��� �͸� ��ü�� �̿�
		 * => Objects.compare()�� ���ϰ�
		 * => 0 : ����
		 * => ���� : �տ� ���� �۴�
		 * => ��� : ���� ���� ũ��
		 */
		System.out.println(Objects.compare(num1, num2, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		}));
		System.out.println(Objects.compare(num1, num2, new EX1_A()));
	}

}
class EX1_A implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1 - o2;
	}
}