package DAY6;

public class EX4 {

	public static void main(String[] args) {
		int [] arr = new int [5];
		//arr 0번지 1을 저장
		arr[0] = 1; 
		//System.out.println(arr[0]);
		arr[1] = 2; 
		//System.out.println(arr[1]);
		//5개짜리 배열은 5번지까지 접근할 수 없기 떄문에 아래 두줄은 에외가 발생하는 코드
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
