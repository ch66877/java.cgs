package DAY15;

public class EX15 {

	public static void main(String[] args) {
		System.out.println(sum1(5));
		System.out.println(sum1(5,1,2,3));
		System.out.println(sum1(5,1,2,3,4,5));
		System.out.println(sum1(5,1,2,3,4,5,6));

	}
	public static int sum1(int max, int ... nums) {
		if(nums.length == 0 || max == 0) {
			return 0;
		}
		if(max > nums.length) {
			max = nums.length;
		}
		int sum = 0;
		for(int i = 0; i<max; i++) {
			sum += nums[i];
		}
		return sum;
	}
	//�������ڴ� ���� �ڿ� �;� ��. �Ʒ� �ڵ�� �������ڰ� �տ� �ֱ� ������ ���� �߻�
	/*public static int sum2(int ... nums, int max) {
		if(nums.length == 0 || max == 0) {
			return 0;
		}
		if(max > nums.length) {
			max = nums.length;
		}
		int sum = 0;
		for(int i = 0; i<max; i++) {
			sum += nums[i];
		}
		return sum;
	}*/
}
