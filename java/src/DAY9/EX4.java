package DAY9;

public class EX4 {

	public static void main(String[] args) {
		HighSchoolStudent std = new HighSchoolStudent("��ȣ", "���ϱ�", 1, 10, 23);
		std.print();

	}

}
/* ����л� Ŭ������ �ʿ��� �ʵ带 �ּ����� �� ���� �����غ�����. */
class HighSchoolStudent{
	//�б��̸�, �̸�, �г�, ��, ��ȣ, ����, ����, ����
	String schoolName;
	String name;
	int grade;
	int classNumber;
	int number;
	int kor;
	int eng;
	int math;

	void print() {
		System.out.println("����б� : " + schoolName );
		System.out.println("�̸�    : " + name);
		System.out.println("�г�    : " + grade);
		System.out.println("�й�    : " + classNumber);
		System.out.println("��ȣ    : " + number);
	}

	public HighSchoolStudent(String schoolName, String name, int grade, int classNumber, int number) {
		this.schoolName = schoolName;
		this.name = name;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}

}
