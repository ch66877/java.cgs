package DAY11;

/*- �л� Ŭ������ �ۼ��ϼ���. 
 * - �ʵ� : �̸�, �г�, ��, ��ȣ, ����, ����, ���� ����
 * - ��� : 
 *    - �л� ������ ����ϴ� ���
 *    - �г�, ��, ��ȣ�� �־����� �� ��ġ�ϴ��� Ȯ���ϴ� ���
 *    - �־��� �̸�, ����, ����, ���������� �����ϴ� ���
 *    - ������ : �̸�, �г�, ��, ��ȣ, ����, ����, ���� ������ �־����� �� �ʱ�ȭ�ϴ� ������*/
public class EX6_Stundent {
	private String name;
	private int grade, classNum, num;
	private double kor, eng, math;
	
	public EX6_Stundent(String name2, int grade2, int calssNum, int num2, double kor2, double eng2, double math2) {
		
	}
	public void print() {
		System.out.println("===========================");
		System.out.println(grade + " �г� " + classNum + "�� " + num + "��" + name);
		System.out.println("���� : " + kor + " ���� : " + eng + " ���� : " + math);
		System.out.println("===========================");
	}
	/* ��� : �г�, ��, ��ȣ�� �־����� �� ��ġ�ϴ��� Ȯ���ϴ� �޼ҵ�
	 * �Ű����� : �г�, ��, ��ȣ => int grade, int calssNum, int num
	 * ����Ÿ�� : ��ġ ���� => boolean
	 * �޼ҵ�� : equal
	 */
	public boolean equal(int grade, int classNum, int num) {
		if(this.grade != grade) {
			return false;
		}
		if(this.classNum != classNum) {
			return false;
		}
		if(this.num != num) {
			return false;
		}
		return false;
	}	
	/* ��� : �־��� �̸�, ����, ����, ������������ �����ϴ� �޼ҵ�
	 * �Ű�����: �̸�, ����, ����, ���� => double kor, dounble eng, double math
	 * ����Ÿ�� : ���� => void
	 * �żҵ�� : modify
	 */
	public void modify(String name, double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}
	//��Ŭ�� > source > generate constructor using fieldes
	public void EX6_Student(String name, int grade, int classNum, int num, double kor, double eng, double math) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}