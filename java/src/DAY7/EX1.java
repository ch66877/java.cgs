package DAY7;

public class EX1 {

	public static void main(String[] args) {
		/* 5��¥�� �迭�� �����, 0������ 1, 1������ 2, .. 4������ 5�� �����ϰ�, ����ϴ� �ڵ帤 �ۼ��ϼ���.
		 * 
		 */

		int arr [] = new int [5];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[1]);
		}
	}
	
}

