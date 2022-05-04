package DAY7;

public class EX4 {

	public static void main(String[] args) {
		/* arr2 배영을 생성하여 arr 배열을 복사하고, arr2배열갑을 출력하세요.
		 * 
		 */

		int arr1[] = {1,4,6,8};	
		int arr2[] = new int[arr1.length];
		//arr1을 =을 통해 arr3에 복사(정확히는 복사가 아님)
		int arr3[] = arr1;
		//arr1의 갑들을 반복문을 통해 arr2에 복사
		int arr4[] = arr1;
		//arr1의 갑들을 반복문을 통해 arr2에 복사
		for(int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//arr1의 값들을 기능을 통해 arr4에 복사
		//arr1배열의 있는 값들을 0번지부터 arr.length개 복사하여
		//arr4배열의 0번지부터 붙여넣어줌
		System.arraycopy(arr1, 2, arr4, 2, arr1.length);
		//arr1의 0번지 값을 0으로 수정
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
