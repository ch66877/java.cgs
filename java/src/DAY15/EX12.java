package DAY15;

public class EX12 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 0;
		char op = '?';
		double res;

		try {
			res = calculator(num1, op, num2);
			System.out.println(""+ num1 + op + num2 +"=" + res);
		}catch(ArithmeticException e) {
			/* getMessage() : ���� Ŭ������ ����� �޼����� �������� �޼ҵ�
			 * printStackTrace() : ���ܰ� �߻��� �޼ҵ���� ��ġ�� ã�Ƽ� �ֿܼ� ����ϴ� �޼ҵ� */
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
	/* ��� : �� ������ ��� �����ڰ� �־����� ������� ����� �˷��ִ� �޼ҵ�
	 * 		 ��, �����ڰ� ��������ڰ� �ƴϸ� ���ܰ� �߻�
	 * �Ű����� : �������� ��� ������ => int num1, char op, int num2
	 * ����Ÿ�� : ��������� => �Ǽ� => double
	 * �޼ҵ�� : calculator
	 * */
	public static double calculator(int num1, char op, int num2) throws Exception{
		switch(op) {
		case '+':	return num1 + num2;
		case '-':	return num1 - num2;
		case '*':	return num1 * num2;
		case '/':
			if(num2 == 0) {
				throw new ArithmeticException("0���� ���� �� �����ϴ�.");
			}
			return num1 / (double)num2;
		case '%':	return num1 % num2;
		default:	throw new Exception("��������ڰ� �ƴմϴ�.");
		}
	}
}
