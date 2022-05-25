package DAY22;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import DAY14.ConsoleProgram;

public class ScoreManager implements DAY14.ConsoleProgram {

	private Scanner scan;
	private int exitMenu = 4;
	private List<Score> list = new ArrayList<Score>();

	public ScoreManager(Scanner scan) {
		if(scan == null)
			scan = new Scanner(System.in);
		this.scan = scan;
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("-----------------------");
		System.out.println("1. ���� �߰�");
		System.out.println("2. ���� Ȯ��");
		System.out.println("3. ���� ����");
		System.out.println("4. ���α׷� ����");
		System.out.println("-----------------------");
		System.out.print("�޴� ���� : ");
		return scan.nextInt();
	}

	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			if(addScore()) 
				printMessage("������ �߰��߽��ϴ�.");
			else
				printMessage("�̹� ��ϵ� ���� �����Դϴ�.");
			break;
		case 2:
			printScore();
			break;
		case 3:
			break;
		case 4:
			break;
		default:
		}
	}

	private void printScore() {
		System.out.println("-----------------------");
		System.out.println("���� Ȯ�� �޴�");
		System.out.println("1. ��� ���� Ȯ��");
		System.out.println("2. �б� ���� Ȯ��");
		System.out.println("3. ���� ���� Ȯ��");
		System.out.println("-----------------------");
		System.out.print("�޴� ���� : ");
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			printScoreList(s->true);
			break;
		case 2:
			System.out.print("�г� : ");
			int grade = scan.nextInt();
			System.out.print("�б� : ");
			int term = scan.nextInt();
			printScoreList(s->s.getGrade() == grade && s.getTerm() == term);
			break;
		case 3:
			System.out.print("���� : ");
			String name = scan.next();
			printScoreList(s->s.getName().equals(name));
			break;
		default:
			printMessage("�߸��� �޴��� �����߽��ϴ�.");
		}
	}
	private void printScoreList(Predicate<Score> p) {
		List<Score> tmpList = new ArrayList<Score>();

		for(Score tmp : list) {
			if(p.test(tmp)) {
				tmpList.add(tmp);
			}
		}

		if(tmpList.size() == 0) {
			printMessage("����� ������ �����ϴ�.");
		}else {
			System.out.println("-----------------------");
			for(Score tmp : tmpList) {
				System.out.println(tmp);
			}
			System.out.println("-----------------------");
		}
	}

	private boolean addScore() {
		System.out.println("-----------------------");
		System.out.println("�߰��� �л� ������ �Է��ϼ���.");
		//�г�, �б�, ������ �Է�
		System.out.print("�г� : ");
		int grade = scan.nextInt();
		System.out.print("�б� : ");
		int term = scan.nextInt();
		System.out.print("���� : ");
		String name = scan.next();

		//�г�, �б�, ������ ���� ������ ���� ����Ʈ�� ������ �ִٰ� �˸�
		Score tmp = new Score(grade, term, name);
		if(list.contains(tmp)) {
			System.out.println("-----------------------");
			return false;
		}
		//�߰�,�⸻,�������� �Է�
		System.out.print("�߰� : ");
		int midterm = scan.nextInt();
		System.out.print("�⸻ : ");
		int finals = scan.nextInt();
		System.out.print("���� : ");
		int pa = scan.nextInt();

		//���� ������ ���� ����Ʈ�� �߰�
		tmp = new Score(grade, term, name, midterm, finals, pa);
		list.add(tmp);
		return true;
	}

	@Override
	public void run() {
		//���� �����͸� �߰�
		list.add(new Score(1, 1, "����", 100, 100, 90));
		list.add(new Score(1, 2, "����", 90, 100, 90));
		list.add(new Score(1, 1, "����", 100, 80, 90));
		list.add(new Score(1, 1, "����", 70, 100, 90));

		int menu = -1;
		do {
			try {
				menu = selectMenu(scan);
				excute(menu);
			}catch(InputMismatchException e) {
				printMessage("�ùٸ� ���� �Է��ϼ���.");
				scan.nextLine();
			}catch(RuntimeException e) {
				printMessage(e.getMessage());
			}catch(Exception e) {
				printMessage("���� �߻� : " + e.getMessage());
			}
		}while(menu != exitMenu);
	}
	private void printMessage(String str) {
		System.out.println("-----------------------");
		System.out.println(str);
		System.out.println("-----------------------");
	}
}