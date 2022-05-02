package DAY4;

public class EX1 {

	public static void main(String[] args) {
		/* 정수가 num의 약수를 출력하는 코드를 작성하세요
		 * 소수는 약수가 1과 자기자신인 수, 약수의 개수가 2개의 수
		 * 1 : 소수가 아님
		 * 2 : 소수, 1,2
		 * 3 : 소수, 1,3
		 * 4 : 소수가 아님, 1,2,4
		 * 
		 * 반복횟수 : i는 1부 num까지 1씩 증가
         * 규칙성 : I가 num의 약수이면 약수의 개수를 하나 증가
         *         num를 i로 나누었을 때 나머지가 0과 같다면 count를 1증가
         * 반복문 종료 후 : 약수의 개수가 2개이면 소수라고 출력하고, 아니면 소수가 아님이라고 출력
         *            count가 2와 같으면 소수라고 출력, 아니면 소수가 아님이라고 출력
         */
	
		int num = 1, i , count= 0;
		for (i = 1; i <= num; i++) {
			if(num % i == 0) {
				count ++;
		   }
	 }
		if(count==2) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수 아님");
		}
						
	}

}
