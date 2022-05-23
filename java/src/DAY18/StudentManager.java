 package DAY18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import DAY14.ConsoleProgram;

public class StudentManager implements ConsoleProgram{
	
	private Scanner scan;
    private	List<Student> list;
    private int exitMenu = 5;
    
    public StudentManager(Scanner scan2) {
    	scan = new Scanner(System.in);
    	list = new ArrayList<Student>();
    }
    public StudentManager(Scanner scan, int size) {
    	this.scan = scan;
    	list = new ArrayList<Student>(size);
    }
    
	@Override
	public int selectMenu(Scanner scan) {
		 System.out.println("--------�޴�-------");
		 System.out.println("1. �л����� �Է�");
		 System.out.println("2. �л����� ���");
		 System.out.println("3. �л����� ����");
		 System.out.println("4. �л����� ����");
		 System.out.println("5. ���α׷� ����");
		 System.out.println("�޴��� �����ϼ��� : ");
		 int menu = scan.nextInt();
		 System.out.println("------------------");
		 return menu;
	}
	
	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			//�л� ������ Scanner �Է¹޾� �Է¹��� ������ �̷���� �л� ��ü�� �޾ƿ��� �޼ҵ�
			Student std = inputsStudent();
			//�л������� �߰�
		    InsertStudent(std);
			break;
		case 2:
			printStudent();
			break;
		case 3:
			//�г� �� ��ȣ => �л� ��ü(A)�� ����
			Student modStd = inputsSearchStudent();
			
			int index = list.indexOf(modStd);
			//�л� ��ü(A)�� ����Ʈ�� ������
			if(index >=0) {
			   //������ �̸�, ����, ����, ������ �Է¹޾� �а���ü(A)�� ����
				inputAdditionStudent(modStd);
			   //����Ʈ���� �л� ��ü(A)�� ����
				list.set(index, modStd);
			}
			//�г�, ��, ��ȣ�� �ִ� ��ü�� �־����� �ش� ��ü�� �̸�, ����, ����, ������
			//�Է¹޾� �����ϴ� �޼ҵ�
			
			//������ �л��� ���ٰ� �˷���
			else {
				System.out.println("------------------");
				System.out.println("��ϵ��� ���� �л������Դϴ�. �л� ���� �Է��� �̿��ϼ���.");
				System.out.println("------------------");
			}
			break;
		case 4:
		   Student delStd = inputsSearchStudent();
		   if (list.remove(delStd)) {
			   printMessage("�л� ������ �����߽��ϴ�.");
		   }else {
			   printMessage("��ϵ��� ���� �л������Դϴ�. ������ �� �����ϴ�.");
		   }	
			break;
		case 5:
			break;
		default:
			System.out.println("�߸��� �޴��� �����߽��ϴ�!!!");
		}
	}
	
	@Override
	public void run() {
		int menu;
		do {
			try {
			    menu = selectMenu(scan);
			    excute(menu);
		    }catch(Exception e) {
			    menu = 0;
			    printMessage("�߸��� ������ �޴��� �Է��߽��ϴ�.");
			    scan.nextInt();
		    }
		}while(menu != exitMenu);
		
	}

	private Student inputsStudent() {
		try {
		    System.out.println("�л� ������ �Է��ϼ���");
		    System.out.println("�г� �� ��ȣ �Է� : ");
		    int grade = scan.nextInt();
		    int classNum = scan.nextInt();
		    int num = scan.nextInt();
		    String name = scan.next();
		    System.out.println("���� ���� ���� ���� �Է� : ");
		    int kor = scan.nextInt();
		    int eng = scan.nextInt();
		    int math = scan.nextInt();
		    return new Student(grade, classNum, num, name, kor, eng, math);
		}catch(Exception e) {
			System.out.println("------------------");
			System.out.println("�Է¿��� �߸��� ���� �Է��߽��ϴ�. �Է��� ��ҵ˴ϴ�.");
			System.out.println("------------------");
			//�Է��� �߸����� �� �Է� ���ۿ� �ִ� ������� ���ڿ��� ������(�Է¹��۸� ���� ����)
			scan.nextLine();
			return null;
		}
	}//inputsStudent
	private void InsertStudent(Student std) {
		if(std == null) {
			return;
		}
		if(list.contains(std)) {
			printMessage("�̹� �߰��� �л��Դϴ�. �л����� ������ �̿��ϼ���.");
			return;
		}
		list.add(std);
		list.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getGrade() != o2.getGrade()) {
					return o1.getGrade() - o2.getGrade();
				}
				if(o1.getClassNum() != o2.getClassNum()) {
			        return o1.getClassNum() - o2.getClassNum();
		        }
				if(o1.getNum() != o2.getNum()) {
			        return o1.getNum() - o2.getNum();
		        }
				return 0;
			}
		});
		System.out.println("------------------");
		System.out.println("�л� ���� �߰��� �Ϸ� �Ǿ����ϴ�.");
		System.out.println("------------------");
	}//inputsStudent
	public void printStudent() {
		if(list.size() == 0) {
			System.out.println("------------------");
			System.out.println("�л� ������ �����ϴ�.");
			System.out.println("------------------");
			return;
		}
		System.out.println("------------------");
		for(Student tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("------------------");
	}//printStudent
	private Student inputsSearchStudent() {
		try {
		    System.out.println("�˻��� �л� ������ �Է��ϼ���");
		    System.out.println("�г� �� ��ȣ �Է� : ");
		    int grade = scan.nextInt();
		    int classNum = scan.nextInt();
		    int num = scan.nextInt();
		    return new Student(grade, classNum, num, null, 0, 0, 0);
		}catch(Exception e) {
			System.out.println("------------------");
			System.out.println("�Է¿��� �߸��� ���� �Է��߽��ϴ�. �Է��� ��ҵ˴ϴ�.");
			System.out.println("------------------");
			//�Է��� �߸����� �� �Է� ���ۿ� �ִ� ������� ���ڿ��� ������(�Է¹��۸� ���� ����)
			scan.nextLine();
			return null;
		}
	}//inputStudent
	private void inputAdditionStudent(Student std) {
		if(std == null) {
			System.out.println("------------------");
			System.out.println("�л� ������ �����ϴ�.");
			System.out.println("------------------");
			return;
		}
        try {
            System.out.println("������ �л� ������ �Է��ϼ���");
            System.out.println("�̸� ���� ���� ���� �Է� : ");
            String name = scan.next();
            int kor = scan.nextInt();
		    int eng = scan.nextInt();
		    int math = scan.nextInt();
		    std.modify(name, kor, eng, math);
	    }catch(Exception e) {
	    	System.out.println("------------------");
	    	System.out.println("�Է¿��� �߸��� ���� �Է��߽��ϴ�. �Է��� ��ҵ˴ϴ�.");
	    	System.out.println("------------------");
	    	//�Է��� �߸����� �� �Է� ���ۿ� �ִ� ������� ���ڿ��� ������(�Է¹��۸� ���� ����)
	    	scan.nextInt();
	    	return;
	    }
    }//inputAdditionStudent
	private void printMessage(String message) {
		System.out.println("------------------");
    	System.out.println(message);
    	System.out.println("------------------");
	}
}