package DAY5;

public class EX8 {

	public static void main(String[] args) {
		/* 1부터 100사이의 모든 소수를 출력하는 코드를 작성하세요.
		 * 1부터 100사이의 정수를 차레대로 num에 저장하여 출력하는 코드
		 *     num가 소수인지 아닌지 판별하는 코드 
		 * 
		 */

		for(int num = 1; num <= 100; num++) {
			// num가 소수인지 아닌지 판별하는 코드
		int count = 0;
		//1부터 num사이의 num의 약수 개수
		for(int i = 1; i<=num; i++) {
			//i가 num의 약수이다 => num를 i로 나누었을 떄 나머지가 0과 같다
			if(num % i == 0) {
				count++;
			}
		}
		//약수의 개수를 이용하여 소수인지 판별
		if(count == 2) {
			System.out.println(num + " ");
		}
	}

  }
}
