package DAY8;

public class EX3 {

	public static void main(String[] args) {
		int num1 = 3, num2 = 7;
	    int gcd = gcd(num1,num2);
	    System.out.println(num1 + "��" + num2 + "�� ���� ����� : " + gcd);

	}
    /* ��� : �� ������ �־����� �� ������ �ִ� ������� �˷��ִ� �޼ҵ�
     * �Ű����� : �� ���� => int num1, int num2
     * ����Ÿ�� : �� ������ �ִ� ����� => ���� => int
     * �޼ҵ�� : gcd
     */
	public static int gcd(int num1, int num2) {
		int gcd = 1;
		for(int i = 1; i<=num1; i++) {
		    if(num1 % i == 0 && num2 % i == 0) {
		    	gcd = i;
		    }
		}
		return gcd;
	}
	/* ��� : �� ������ �ּ� ������� �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �� ������ �ּ� ����� => ���� => int
	 * �޼ҵ�� : 1cm
	 */
     public static int lcm(int num1, int num2) {
    	 return num1 * num2 / gcd(num1,num2);
     }
}