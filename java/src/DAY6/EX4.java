package DAY6;

public class EX4 {

	public static void main(String[] args) {
		int [] arr = new int [5];
		//arr 0���� 1�� ����
		arr[0] = 1; 
		//System.out.println(arr[0]);
		arr[1] = 2; 
		//System.out.println(arr[1]);
		//5��¥�� �迭�� 5�������� ������ �� ���� ������ �Ʒ� ������ ���ܰ� �߻��ϴ� �ڵ�
		//arr[5] = 6; 
		//System.out.println(arr[5]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("--------------");
		for(int i = 0; i<=4; i++) {
			System.out.println(arr[1]);
		}
		System.out.println("--------------");
		for(int i = 0; i<5; i++ ) {
			System.out.println(arr[1]);
		}
		System.out.println("--------------");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[1]);
		}
	}

}
