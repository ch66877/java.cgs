package DAY11;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		Student st = new Student("",1,1,1);
		for( ; menu !=3 ; ) {
			System.out.println("1. �л������Է�");
			System.out.println("2. �л��������");
			System.out.println("3. ���α׷� ����");
			System.out.println("�޴��� �����ϼ��� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("�л������Է� : ");
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
				System.out.println("���α׷� ����");
				break;
			default: 
	            System.out.println("�߸��� �޴��Դϴ�.");
			}
		}
		scan.close();
		}
	}


class Student{
	//�̸�, �а�, ��, ��ȣ
	String name;
	int grade, calssNumber, number;
	
	void print() {
		System.out.println(grade + "�г�" + calssNumber + "��" + number + "��" + name);
	}

	public Student(String name, int grade, int calssNumber, int number) {
		this.name = name;
		this.grade = grade;
		this.calssNumber = calssNumber;
		this.number = number;
	}
	
}
