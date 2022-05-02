package DAY5;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		/* 메뉴 출력 예제를 do while문으로 작성하세요.*/
       
		int menu;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("메뉴");
			System.out.print("1.학생정보입력");
			System.out.print("2.학생정보출력");
			System.out.print("3.학생정보수정");
			System.out.print("4.학생정보삭제");
			System.out.print("5.프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
            menu = scan.nextInt();
		}while(menu != 5);
        scan.close();

	}

}
