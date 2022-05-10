package TEST1;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		
		/*1. 학생 정보 입력
		  2. 학생 정보 출력
		  3. 프로그램 종료
		  메뉴를 선택하세요 : 1
		  이름 : 홍길동
		  학년 : 1
		  반  : 1
		  번호 : 1
		  메뉴
		  1. 학생 정보 입력
		  2. 학생 정보 출력
		  3. 프로그램 종료
		  메뉴를 선택하세요 : 2
		  1학년 1반 1번 홍길동
		  메뉴
		  1. 학생 정보 입력
		  2. 학생 정보 출력
		  3. 프로그램 종료
		  메뉴를 선택하세요 : 3
		  프로그램을 종료합니다.
          */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		Student pt = new Student();
		for( ; menu !=3 ; ) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("학생정보입력");
				break;
			case 2:
				pt.print();
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			default: 
	            System.out.println("잘못된 메뉴입니다.");
			}
		}
		scan.close();
	}

}

class Student{
	int Student;
	void printstudent1() {
		System.out.println("이름");
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
	void printstudent2() {
		System.out.println("학년");
	}
	void printstudent3() {
		System.out.println("반");
	}
	void printstudent4() {
		System.out.println("번호");
    }
	public void student(int student) {
		Student = student;
	}
	
}
