package DAY5;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		/* 랜덤으로 생성한 수(1~100)륾 맞추는 게임을 작성하세요.
		 * 정수를 입력했을 떄 입력한 정수보다 랜덤으로 생성된 수가 크면 UP, 적으면 DOWN을 표시.
		 * 맞으면 맞퀐습니다라고 표시
		 * 렌덤으로 생성한 수 : 40
		 * 입력 : 100
		 * DOWN
		 * 입력 : 50
		 * DOWN
		 * 입력 : 25 
		 * DOWN
		 * 입력 : 40
		 * 정답입니다.
		 * 반복횟수 : 
		 * 규칙성 : 
		 *        입력받은 정수num가 랜덤한수 r과 같으면 정답입니다.라고 출력한 후 반복문을 빠져나가고,
		 *        입력받은 정수num가 랜덤한수 r과 같지 않고 r보다 크면 DOWN이라고 출력하고,
		 *        입력받은 정수num가 랜덤한수 r과 같거나 크지 않으면 UP이라고 출력
         */
		 int min = 1, max = 100;
		 int r = (int)(Math.random() * (max-min+1) + min);
		 Scanner scan = new Scanner(System.in);
		 int num ;
		 System.out.println(r + " 랜덤으로 생성한 수(1~100) : ");
	          do {	
	        	  System.out.println("1~100사이의 정수를 입력하세요 :");
	        	   num = scan.nextInt();
	        	 if(num < 1 || num > 100) {
	        		 continue;
	        	 }
	        	   if(num > r) {
	        		  System.out.println("DOWN");
	        	 }
	        	  else if(num < r) {
	        		  System.out.println("UP");
	        	 }

	      }while(num != r);
	          System.out.println("정답입니다.");
	          scan.close();
	}
	
}