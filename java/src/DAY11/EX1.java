package DAY11;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		Student st = new Student("",1,1,1);
		for( ; menu !=3 ; ) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("학생정보입력 : ");
				int grade = scan.nextInt();
				int classNum = scan.nextInt();
				int number = scan.nextInt();
				String name = scan.next();
				st = new Student(name, grade, classNum, number);
				break;
			case 2:
				st.print();
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
	//이름, 학견, 반, 번호
	String name;
	int grade, calssNumber, number;
	
	void print() {
		System.out.println(grade + "학년" + calssNumber + "반" + number + "번" + name);
	}

	public Student(String name, int grade, int calssNumber, int number) {
		this.name = name;
		this.grade = grade;
		this.calssNumber = calssNumber;
		this.number = number;
	}
	
}
