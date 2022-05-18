package DAY17;

import java.util.*;

public class EX8 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		//list.add(new Student(1,1,1, "ȫ�浿"));
		Student std = new Student(1,1,1, "ȫ�浿");
		list.add(std);
		/* - Student Ŭ������ equals�� �������̵� ���� ������ indexOf, contains, remove�޼ҵ尡 ���ϴ´�� �������� ���� */
		System.out.println(list);
		int index = list.indexOf(new Student(1,1,1, "ȫ�浿"));
		System.out.println("list���� �л� ������ �ֽ��ϱ�? " + index + "����");
		System.out.println("list���� �л� ������ �ֽ��ϱ�? " + list.contains(new Student(1,1,1, "ȫ�浿")));
		list.remove("list���� �л� ������ �����߽��ϴٱ�? " +list.remove(new Student(1,1,1, "�Ӳ���")));
		//list.remove(std);
		System.out.println(list);

	}

}
class Student{
	private int grade, clazz, num;
	private String name;
	public Student(int grade, int clazz, int num, String name) {
		this.grade = grade;
		this.clazz = clazz;
		this.num = num;
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClazz() {
		return clazz;
	}
	public void setClazz(int clazz) {
		this.clazz = clazz;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [grade=" + grade + ", clazz=" + clazz + ", num=" + num + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clazz;
		result = prime * result + grade;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (clazz != other.clazz)
			return false;
		if (grade != other.grade)
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	public Student(Student std){
		this.num = std.num;
		this.clazz = std.clazz;
		this.grade = std.grade;
		this.name = new String(std.name);
	}
	
}