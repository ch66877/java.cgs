package DAY14;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BaseballGame implements ConsoleProgram{
	
	private Scanner scan;
    private final int exitMenu = 3;
    
	private List<Integer> com     = new ArrayList<Integer>();
	private List<Integer> user    = new ArrayList<Integer>();
	private List<Integer> records = new ArrayList<Integer>();
    
	private int min = 1;
	private int max = 9;
	private char[] formatStr;
	
	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("======�޴�======");
		System.out.println("1. �÷���");
		System.out.println("2. ���Ȯ��");
		System.out.println("3. ���α׷� ����");
		System.out.println("============");
		System.out.println("�޴� ���� : ");
		int menu = scan.nextInt();
		System.out.println("============");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			//��ǻ�� ������ ����
			createComRandom();
			System.out.println(com);

			int count = 0;
			while(true) {
				//���ڸ� 3�� �Է�
				inputNumbers(3);
				//Ƚ�� 1����
				count++;
				//��Ʈ����ũ, �� ����� �����, ���� ���� ���θ� �˷���
				if(printResult()) {
					break;
				}
			}
			record(count,5);
			break;
		case 2:
			printRecord();
			break;
		case 3:
			break;
		default:
			System.out.println("�߸��� �޴��� �����߽��ϴ�.");
			System.out.println("=============");

		}
	return;
	}
	private int random(int min2, int max2) {
		// TODO Auto-generated method stub
		return 0;
	}


	private void createComRandom() {
		// TODO Auto-generated method stub
		
	}

	public BaseballGame(Scanner scan) {
		this.scan = scan;
	}
	public void inputNumbers(int count) {
		String str = "�ߺ����� �ʰ� {0}~{1}������ {2}���� ���ڸ� �Է��ϼ���.";
		String formatStr = MessageFormat.format(str, min, max, count);
		System.out.println(formatStr);
		System.out.print("�Է� : ");

		user.clear();
		while(user.size() < count) {
			try {
				int num =scan.nextInt(); 
				//���� �Ѿ�� �����̸� ���� �߻�
				if(num < min || num > max) {
					throw new ArithmeticException();
				}
				//�ߺ��� �����̸� ���� �߻�
				if(user.contains(num)) {
					throw new ArithmeticException();
				}
				user.add(num);
			}
			//������ �ƴ� ���ڸ� �Է����� ��, �ߺ��� ��
			catch(ArithmeticException e) {
				System.out.println("�ߺ� �ǰų� ������ ������ϴ�. �ٽ� �Է��ϼ���.");
				if(scan.hasNextInt()) {
					scan.nextLine();
				}
				System.out.println(formatStr);
				System.out.print("�Է� : ");
				user.clear();
			}
			//���ڰ� �ƴ� ���ڸ� �Է����� ��, 
			catch(Exception e) {
				System.out.println("�Է��� �� ���ƽ��ϴ�. �ٽ� �Է��ϼ���.");
				scan.nextLine();
				System.out.println(formatStr);
				System.out.print("�Է� : ");
				user.clear();
			}
		}
	}
	public boolean printResult() {
		int strike = 0;
		for(int i = 0; i<com.size(); i++) {
			if(com.get(i).equals(user.get(i))) {
				strike++;
			}
		}
		int ball = 0;
		for(Integer tmp : com) {
			if(user.contains(tmp)) {
				ball++;
			}
		}
		ball = ball - strike;
		//��Ʈ����ũ, �� ������ ���� ��� ���
		if(strike !=0) {
			System.out.print(strike+"S");
		}
		if(ball != 0) {
			System.out.print(ball + "B");
		}
		if(strike == 0 && ball == 0) {
			System.out.print("O");
		}
		System.out.println();
		if(strike == 3) {
			return true;
		}
		return false;
	}
	public void record(int count, int max) {
		records.add(count);
		records.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		if(records.size() > max) {
			records.remove(max);
		}
	}
	public void printRecord() {
		if(records.size() == 0) {
			System.out.println("����� �����ϴ�. �����ϼ���.");
			return;
		}
		for(int i = 0; i<records.size(); i++) {
			System.out.println(i+1+"��. " + records.get(i) + "ȸ");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}