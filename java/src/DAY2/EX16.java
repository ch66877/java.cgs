package DAY2;

public class EX16 {

	public static void main(String[] args) {
		/* num1�� num2�� �־����� ��� ������ op�� �־����� �� ��� �����ڿ� �´� ����� ��µǴ� �ڵ带 �ۼ��ϼ���. 
		 * op�� '+'�̸� num1 + num2�� ����� ���
		 * op�� '-'�̸� num1 - num2�� ����� ���
		 * op�� '*'�̸� num1 * num2�� ����� ���
		 * op�� '/'�̸� num1 / num2�� ����� ���
		 * op�� '%'�̸� num1 % num2�� ����� ���
		 * op�� ��� �����ڰ� �ƴϸ� �߸��� �����ڶ�� ���
		 * */
		int num1 = 1;
		int num2 = 2;
		char op = '?';
		if(op == '+') {
			System.out.println(""+num1 + op + num2 + "=" + (num1 + num2));
		}else if(op == '-') {
			System.out.println(""+num1 + op + num2 + "=" + (num1 - num2));
		}else if(op == '*') {
			System.out.println(""+num1 + op + num2 + "=" + (num1 * num2));
		}else if(op == '/') {
			System.out.println(""+num1 + op + num2 + "=" + (num1 / (double)num2));
		}else if(op == '%') {
			System.out.println(""+num1 + op + num2 + "=" + (num1 % num2));
		}else{
			System.out.println(op+"�� ��� �����ڰ� �ƴմϴ�.");
		} 
	}

}