package DAY15;

public class EX14 {

	public static void main(String[] args) {
		/* �޼ҵ��� �Ű������� ������ �� ����ϴ� ���
		 * Ÿ�� ... �迭������ ��� */
		System.out.println(sum(1,2));
		System.out.println(sum(4,5,6,7,8));
		System.out.println(sum());
	}
	/* ��� : �������� ������ ���� �˷��ִ� �޼ҵ�
	 * �Ű����� : �������� ���� => int ... nums
	 * ����Ÿ�� : �� => int
	 * �޼ҵ�� : sum */
	public static int sum(int ...nums) {
		//nums�� �޼ҵ忡�� �迭ó�� ���
		if(nums.length == 0) {
			return 0;
		}
		int sum = 0;
		for(int tmp: nums) {
			sum += tmp;
		}
		return sum;
	}
}
