package TEST1;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		
		/*1. �л� ���� �Է�
		  2. �л� ���� ���
		  3. ���α׷� ����
		  �޴��� �����ϼ��� : 1
		  �̸� : ȫ�浿
		  �г� : 1
		  ��  : 1
		  ��ȣ : 1
		  �޴�
		  1. �л� ���� �Է�
		  2. �л� ���� ���
		  3. ���α׷� ����
		  �޴��� �����ϼ��� : 2
		  1�г� 1�� 1�� ȫ�浿
		  �޴�
		  1. �л� ���� �Է�
		  2. �л� ���� ���
		  3. ���α׷� ����
		  �޴��� �����ϼ��� : 3
		  ���α׷��� �����մϴ�.
          */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		Student pt = new Student();
		for( ; menu !=3 ; ) {
			System.out.println("1. �л������Է�");
			System.out.println("2. �л��������");
			System.out.println("3. ���α׷� ����");
			System.out.println("�޴��� �����ϼ��� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("�л������Է�");
				break;
			case 2:
				pt.print();
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
	int Student;
	void printstudent1() {
		System.out.println("�̸�");
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
	void printstudent2() {
		System.out.println("�г�");
	}
	void printstudent3() {
		System.out.println("��");
	}
	void printstudent4() {
		System.out.println("��ȣ");
    }
	public void student(int student) {
		Student = student;
	}
	
}
