package DAY3;

public class EX14 {

	public static void main(String[] args) {
		/* num의 약수를 출략하는 코드를 작성하세요.
		 * A의 약수 : A를 어떤 수로 나누었을 때 나머지가 0과 같은 수
		 * 12의 약수 : 1 2 3 4 6 12
		 */
		
		int i;
		int num = 12;
		for(i=1; i<=num;i++) {
			if(num % i == 0 ) {
				System.out.print(i + "");
			}
		}
			
	}

}
