package DAY8;

public class EX2 {

	public static void main(String[] args) {
		int a = 1, b = 2; 
        char op = '/';
        double res = calculator(a, op, b);
        System.out.println("" + a + op + b + "=" +res);
	}
    /* ��� : �� ������ ��������ڰ� �־����� ����������� �˷��ִ� �޼ҵ�
    *    ��    
    * �Ű����� : �� ������ ���������=> int num1, char op, int num2
    * ����Ÿ�� : ������� ��� => �Ǽ� => double
    * �޼ҵ�� : calculator
    */
    public static double calculator(int num1, char op, int nm2) {
        double res = 0;
        int num2 = 0;
		switch(op) {
    	case '+': res = num1 + num2; break;
    	case '-': res = num1 - num2; break;
    	case '*': res = num1 * num2; break;
    	case '/': res = num1 / (double)num2; break;
    	case '%': res = num1 % num2; break;
    	}
    	return res;
    }

}   