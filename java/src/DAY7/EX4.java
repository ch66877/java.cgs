package DAY7;

public class EX4 {

	public static void main(String[] args) {
		/* arr2 �迵�� �����Ͽ� arr �迭�� �����ϰ�, arr2�迭���� ����ϼ���.
		 * 
		 */

		int arr1[] = {1,4,6,8};	
		int arr2[] = new int[arr1.length];
		//arr1�� =�� ���� arr3�� ����(��Ȯ���� ���簡 �ƴ�)
		int arr3[] = arr1;
		//arr1�� ������ �ݺ����� ���� arr2�� ����
		int arr4[] = arr1;
		//arr1�� ������ �ݺ����� ���� arr2�� ����
		for(int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//arr1�� ������ ����� ���� arr4�� ����
		//arr1�迭�� �ִ� ������ 0�������� arr.length�� �����Ͽ�
		//arr4�迭�� 0�������� �ٿ��־���
		System.arraycopy(arr1, 2, arr4, 2, arr1.length);
		//arr1�� 0���� ���� 0���� ����
		arr1[0] = 0;
		
		System.out.println("arr1 : ");
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("arr2 : ");
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
		System.out.println();
		
		System.out.println("arr3 : ");
		for(int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i] + " ");
		}
        System.out.println();
		
		System.out.println("arr4 : ");
		for(int i =0; i<arr4.length; i++) {
			System.out.println(arr4[i] + " ");
		}
		System.out.println();
	}
}
