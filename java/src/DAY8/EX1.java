package DAY8;

public class EX1 {

	public static void main(String[] args) {
		/*�� ������ ���� �˷��ִ� �޼ҵ带 �ۼ��غ�����.*/

        int num1 = 1, num2 = 2;
        int res = sum1(num1, num2);
        System.out.println(res);
        System.out.println(sum1(1,2));
        sum2(1,2);
        //1 + 2 + 3
        int res1 = sum1(1,2);
        int res2 = sum1(res1,3);
        System.out.println(res2);
        sum2(1+2,3);
	}
    /* ��� : �� ������ �־����� �� ������ ���� �˷��ִ� �޼ҵ�
     * �Ű����� : �� ���� => int num1, int num2
     * ���� Ÿ�� : �� ������ ��=> ���� => int
     * �޼ҵ�� : sum
     */
    public static int sum1(int num1, int num2) {
       int res = num1 + num2;
       return res;
    }
    /* ��� : �� ������ �־����� �� ������ ���� �ֿܼ� ����ϴ� �޼ҵ�
     * �Ű����� : �� ���� => int num1, int num2
     * ���� Ÿ�� : ���� => void
     * �޼ҵ�� : sum2
     */
    public static void sum2(int num1, int num2) {
    	int res = num1 + num2;
    	System.out.println(res);
  }

}
