package DAY7;

public class EX3 {

	public static void main(String[] args) {
	/* ���������� �̿��� �迭 ���� ����
	 * 
	 */
 
		int arr[] = {10, 15, 5, 18, 20, 1};
		
		for(int i=0; i<arr.length-1; i++) {
			//i�� 0�� �� j�� 4����, i�� 1�϶� j�� 3����, i�� 2�� �� j�� 2����,..
			for(int j=0; j<arr.length-1-i; j++) {
				//�� ���ڰ� ũ�� �� �� ��ȯ
				if(arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}


