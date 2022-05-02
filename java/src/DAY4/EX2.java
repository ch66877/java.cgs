package DAY4;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		/*3명의 국어 점수를 입력 받아 총점과 쳥균을 구하는 코드를 작성하세요. 반복문 이용
		 * 단, 총점과 평균만 알면 됨. => 총점과 평균을 구한 후 각 학생의 점수를 기억할 필요가 없다
		 * 반복문 활용이 잘 안되면 반복문 없이 해보기
		 * 반복횟수 3반
		 * 규칙성 성적 입력 받고 총점 누적
		 *      Scanner를 이용하여 점수를 인정받아 num에 저장한 후,
		 *      sum에 num를 더해서 sum에 저장
		 * 반복문 종료 후 : 총점을 출력하고, 총점을 이용하요 평균을 계산 한 후, 총점을 출력
		 *              sum을 출력하고, sum을 3으로 나우어서 avg에 저장한 후; avg을 출력
		 */               
	     int  i, num, sum = 0;
         double avg;
			/*3명의 국어 점수를 입력 받아 총점과 쳥균을 구하는 코드를 작성하세요
 	        */
         Scanner scan = new Scanner(System.in);
 	     for(i=1; i <= 3; i++) {
 		 // Scanner를 이용하여 점수를 인정받아 num에 저장한 후,
 		 num = scan.nextInt();
         //sum에 num를 더해서 sum에 저장
 		 sum = sum + num; //sum += num;
 	}
	     //sum을 출력하고, sum을 3으로 나우어서 avg에 저장한 후; avg을 출력
         System.out.println("3명 학생의 국어 총점 :" + sum);
         avg = sum/ (double)3;
         System.out.println("3명 학생의 국어 총점 :" + avg);
         scan.close();
   }

}
