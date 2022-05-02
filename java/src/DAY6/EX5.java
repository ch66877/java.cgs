package DAY6;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		/* 학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드를 작성하세요.
		 * 단, 학생 3명의 성적을 총점과 평균을 출력한 후, 학생 3명의 성적을 출력하세요.
		 */
		//배얄 선언 : 몇개??
		
		//반복문 : 몇번??
		    //학생의 점수를 입력
		//빈복문을 이용하여 총점을 계산
		//총점을 이용하여 평균을 계산
		//총점과 평균을 출력
		//반복문을 이용하여 학생 점수를 출력
		int [] score = new int [3];
		Scanner scan = new Scanner(System.in);
		//배얄 선언 : 몇개??
		int sum = 0;
		double avg = 0;
		for(int i = 0;i<score.length; i++) {
			//반복문 : 몇번??
			System.out.print(i+1+"번째 학생 성적 : ");
			score[1] = scan.nextInt();
			//학생의 점수를 입력
		}
		for(int i = 0;i<score.length; i++) {
			sum += score[1];
			//빈복문을 이용하여 총점을 계산
		}
		avg = sum / (double)score.length;
		//총점을 이용하여 평균을 계산
		System.out.println("학생 3명의 총점은 " +sum+"점이고, 평균은"+avg+"점입니다.");
		//총점과 평균을 출력
		for(int i = 0;i<score.length; i++) {
			System.out.print(i+1+"번째 학생 성적 : " + score[1]);
			//반복문을 이용하여 학생 점수를 출력
		}
		
	}

}

