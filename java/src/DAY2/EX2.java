package DAY2;

public class EX2 {

	public static void main(String[] args) {
		/* ���� ������ : ���������� 1���� �Ǵ� 1����
		 * ������ : ++������, ���� �Ŀ� ����
		 * ������ : ������++, ���� �Ŀ� ����
		 * */
		int num1 = 10, num2 = 10;
		//num1 : ������, num2 : ������
		System.out.println(num1 + " , " + num2);
		System.out.println(++num1 + " , " + num2++);
		System.out.println(num1 + " , " + num2);

		int num3 = 10, num4 = 10;
		//num3 : ������, num4 : ������
		System.out.println(num3 + " , " + num4);
		num3++;//++num3; //num3 = num3 + 1;
		System.out.println(num3 + " , " + num4);
		num4++;//++num4; //num4 = num4 + 1;
		System.out.println(num3 + " , " + num4);
	}

}