package DAY15;

public class EX10 {

	public static void main(String[] args) {
		try {
			int num = 10;
			System.out.println("���α׷� ����");
			if(num % 2 == 0) {
				throw new ArithmeticException("����");
			}
			System.out.println("���α׷� ����");
		}catch(ArithmeticException e) {
			System.out.println("��� ���� �߻�");
		}catch(Exception e) {
			System.out.println("���� �߻�");
		}
		System.out.println("���α׷� ����");

	}

}
