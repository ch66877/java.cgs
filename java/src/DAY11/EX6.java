package DAY11;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		/* �л� ����(�̸�, �г�, ��, ��ȣ, ����, ����, ���� ����)�� �����ϴ� ���α׷��� �ۼ��ϼ���.
		* 1. ����� ���� => �ּ�
		*  - �л����� �Է�
		*   - �г�, ��, ��ȣ, �̸�, ����, ����, ���� ������ �ѹ��� �Է¹���
		*   - �Է��� �л������� ���� 
		*   - �л����� ���
		*    - ��ü �л��� ����, ��, ��ȣ, �̸�, ����, ����, ���� ������ ���
		*   - �л����� ����
		*    - �г�, ��, ��ȣ�� �Է¹���
		*    - �Է¹��� ������ ��ġ�ϴ� �л��� ������, �̸�, ����, ����, ���� ������ ���� ����
		*   - �л� ���� ����
		*    - �г�, ��, ��ȣ�� �Է¹���
		*    - �Է¹��� ������ ��ġ�Ѵ� �л��� ������, ����
		*   - ���α׷� ����
		* 2. �ʿ��� Ŭ������ �ִ��� Ȯ���ϰ�, ������ ����
		*  - �л� Ŭ���� : �̸�, �г�, ��, ��ȣ, ����, ����, ���� ����
		*  - ��� : 
		*    - �л� ������ ����ϴ� ���
		*    - �г�, ��, ��ȣ�� �־����� �� ��ġ�ϴ��� Ȯ���ϴ� ���
		*    - �־��� �̸�, ����, ����, ���������� �����ϴ� ���
		*    - ������ : �̸�, �г�, ��, ��ȣ, ����, ����, ���� ������ �־����� �� �ʱ�ȭ�ϴ� ������
		* 3. ����� ����
		*  - Ŭ���� ���� �� ����
		*  - �ݺ����� �̿��Ͽ� �޴� ��� �� �޴� ����
		*  - ������ �޴��� ���� ���ǹ� ����
		*  */
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		final int max = 30;
		EX6_Stundent std[] = new EX6_Stundent[max];
		int index = 0;
		for( ; menu !=5 ; ) {
             //�޴��� ����ϰ�, �޴��� ����
			 menu = selectMenu(scan);
			 int grade, calssNum, num;
			 double kor, eng, math;
			 String name;
			 switch(menu) {
			 case 1 :
				 //�г�, ��, ��ȣ, �̸�, ����, ����, ���� ������ �Է�
				 System.out.println("�л� ������ �Է��ϼ���(�г�, ��, ��ȣ, �̸���) : ");
				 grade = scan.nextInt();
				 calssNum = scan.nextInt();
				 num = scan.nextInt();
				 name = scan.next();
				 System.out.println("�л� ������ �Է��ϼ���(����, ����, ���м�) : ");
				 kor = scan.nextDouble();
				 eng = scan.nextDouble();
				 math = scan.nextDouble();
				 //EX6_Student�� �����ڸ� �̿��Ͽ� ��ü�� ������ �� index ������ ����
				 std[index] = new EX6_Stundent(name, grade, calssNum, num, kor, eng, math);
				 //index�� 1����
				 index++;
				 break;
			 case 2 :
				 //�ݺ����� �̿��Ͽ� 0�������� index��ŭ �л� ������ ���
				 for(int i = 0 ; i < index; i++) {
					 std[i].print();
				 }
				 break;
			 case 3 : 
				 //�г�, ��, ��ȣ�� �Է�
				 System.out.println("������ �л� ������ �Է��ϼ���(�г�, ��, ��ȣ, �̸���) : ");
				 grade = scan.nextInt();
				 calssNum = scan.nextInt();
				 num = scan.nextInt();
				 name = scan.next();
				 //�󺹹��� ���� 0�������� index��ŭ �л� ������ �ϳ��� �����ͼ�
				 for(int i = 0; i<index; i++) {
				     //�Է¹��� �г�, ��, ��ȣ�� ��ġ�ϴ� �л��� �ִ��� Ȯ���ذ� ������ �̸�, ����, ����, ���� ������ �Է¹��� ��
					 if(std[i].equal(grade, calssNum, num) ) {
						 //�̸�, ����, ����, ���� ������ �Է� ���� ��
						 System.out.println("������ �л� �̸��� ������ �Է��ϼ���(����, ����, ���м�) : ");
						 name = scan.next();
						 kor = scan.nextDouble();
						 eng = scan.nextDouble();
						 math = scan.nextDouble();
						 //�л� ������ �����ϰ�, �ݺ����� ����
						 std[i].modify(name, kor, eng, math);
						 break;
				  }
				 //��ϵ� �л� ��ü�� Ȯ���ؼ� ��ġ�ϴ� �л��� ������ ��ϵ� �л��� �ƴմϴٶ�� ���
				 if(i+1 == index) {
					 System.out.println("��ϵ� �л��� �ƴմϴ�.");
				 }
			 }	 
				 break;
			 case 4 :
				 //�г�, ��, ��ȣ�� �Է�
				 System.out.println("������ �л� ������ �Է��ϼ���(�г�, ��, ��ȣ)");
				 grade = scan.nextInt();
				 calssNum = scan.nextInt();
				 num = scan.nextInt();
				 int dellIndex = -1;
				 //�ݺ����� �̿��Ͽ� 0�������� index���� �л��� ���Ͽ� ��ġ�ϴ� �л� ������ ������ dellIndex�������� ����ϰ� �ݺ����� ����
				 for(int i = 0 ; i<index; i++) {
					//dellIndex�� 0�̻��̸� �ݺ����� �̿��Ͽ� dellIndex�������� index-1�������� ���������� �ִ� ������ ���� ������ ��â
					 if(std[i].equal(grade, calssNum, num)) {
						 dellIndex = 1;
						 break;
					 }
				 }
				 //dellIndex�� 0�̻��̸� => ��ġ�ϴ� �л��� ������
				 if(dellIndex >= 0) {
					 //�ݺ����� �̿��Ͽ� dellIndex �������� index-2�������� ���������� �ִ� ������ ���� ������ ����
					 for(int i = dellIndex; i < index-1; i++) {
						 std[i] = std[i+1];
					 }
					 //index�� 1 ����
					 index--;
				 }
				 //dellIndex�� 0 �̸��̸� ��ϵ� �л��� �ƴմϴٸ� ���
				 else {
					 System.out.println("��ϵ� �л��� �ƴմϴ�.");
				 }
				 break;
			 case 5 :
				 System.out.println("���α׷��� �����մϴ�.");
				 break;
			 default:
				 System.out.println("�޴��� �߸� �����߽��ϴ�.");
			 }
		 }
	}
	/* ��� : �޴��� ����ϰ� �޴��� �Է��ϸ� �Է��� �޴��� �����ִ� �޼ҵ�
	 * �Ű����� : �Է¹ޱ� ���� Scanner => Scanner scan
	 * ����Ÿ�� : �Է��� �޴� => ���� => int
	 * �޼ҵ�� : selectMenu */
    public static int selectMenu(Scanner scan) {
    	 System.out.println("--------�޴�-------");
		 System.out.println("1. �л����� �Է�");
		 System.out.println("2. �л����� ���");
		 System.out.println("3. �л����� ����");
		 System.out.println("4. �л����� �Է�");
		 System.out.println("5. ���α׷� ����");
		 System.out.println("�޴��� �����ϼ��� : ");
		 int menu = scan.nextInt();
		 System.out.println("------------------");
		 return menu;
    }
}