package DAY14;

import java.util.Scanner;

public class BaseballGame implements ConsoleProgram{
	
	private Scanner scan;
    private final int exitMenu = 3;
    private int com[] = new int[3];
    private int user[] = new int[3];
    private int record[] = new int[10];//��Ͽ� ��ϵ� ����
    private int min = 1;
    private int max = 9;
    
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
			//�ݺ�
			     //����� ���� �Է�
			     //S,B,O �Ǻ�
			//��� ����	
			break;
		case 2:
			break;
		case 3: break;
		default:
			System.out.println("�߸��� �޴��� �����߽��ϴ�.");
			System.out.println("============");
	
	@Override
	public void run() {
		int menu;
	    do {
	    	menu = selectMenu(scan);
	    }while(menu != exitMenu);
	    System.out.println("������ �����մϴ�.");
	    System.out.println("============");
	}
	
	public 	void creatRandom() {
		int count = 0;
		while (count < com.length) {
			//������ ����
			int r = random(min, max);
			//�ߺ��� �ƴϸ� ����
			if(indexof(com, count, r) == -1) {
				com[count++] = r;
				System.out.print(r + " ");
			}
			
		}
	}
	
	
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1) + min);
	}
	public static int indexof(int arr[], int size, int num) {
		if(size == 0) {
			return -1;
			if(arr.length< size) {
				size = arr.length;
			}
			for(int i = 0; i < size; i++) {
				if(arr[i] == num) {
					return i;
				}
			}
			return -1;
		}
	}
	public BaseballGame(Scanner scan) {
		this.scan = scan;
	
	}
}