package DAY15;

public class EX8 {

	public static void main(String[] args) {
		/* �� ������ ��� �����ڰ� �־����� �� ��� �������� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �� ����ó���� �ʼ�.*/
		int num1 = 1, num2 = 2;
		char op = '/';
		try {
			switch(op) {
			case '+':	System.out.println(num1+num2);	break;
			case '-':	System.out.println(num1-num2);	break;
			case '*':	System.out.println(num1*num2);	break;
			case '/':	
				int res = num1 / num2;//0���� ������ ���ܸ� �߻���Ű�� ���� �ʿ��� �ڵ�
				System.out.println((double)num1/num2);	break;
			case '%':	System.out.println(num1%num2);	break;
			default:	System.out.println("�߸��� �������Դϴ�."); break;
			}
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}

}
