package DAY8;

public class EX4 {

	public static void main(String[] args) {
		/* �Ű������� �⺻ Ÿ�� ������ ���, �޼ҵ� �ȿ��� ������ �۾��ص� ������ �ȹٲ�
		 * �Ű������� ���� Ÿ�� ������ ���, �޼ҵ� �ȿ��� ������ ���� �ٲ� �� ����
		 */
		Test num1 = new Test(10), num2 =  new Test(20);
		System.out.println("main �޼ҵ� - �� num1 : "+ num1 + ", num2 : " + num2);
        swap2(num1, num2);
        System.out.println("main �޼ҵ� - �� num1 : "+ num1 + ", num2 : " + num2);
	
	}
    /* ��� : �� ������ �ٲٴ� �޼ҵ�
     * �Ű����� : �� ���� => int num1, int num2
     * ����Ÿ�� : ���� => void
     * �޼ҵ�� : swap
     */
     public static void swap(int num1, int num2) {
    	 System.out.println("swap �޼ҵ� - �� num1 : "+ num1 + ", num2 : " + num2);
         int tmp = num1;
         num1 = num2;
         num2 = tmp;
         System.out.println("swap �޼ҵ� - �� num1 : "+ num1 + ", num2 : " + num2);
     }
     public static void swap2(Test num1, Test num2) {
    	 System.out.println("swap �޼ҵ� - �� num1 : "+ num1 + ", num2 : " + num2);
         num1.num = 20;
         num2.num = 10;
         System.out.println("swap �޼ҵ� - �� num1 : "+ num1 + ", num2 : " + num2);
      }
}
class Test{
	int num;
	public Test(int num) {
		this.num = num;
	}
	public String toString() {
		return "" + num;
	}
}