package DAY19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import DAY18.Student;
import DAY19.Board;

public class BoardManager {

	private static final Board Bd = null;
	private Scanner scan;
    private	List<Board> list;
    private int exitMenu = 4;
    
	public BoardManager(Scanner scan) {
		scan = new Scanner(System.in);
    	list = new ArrayList<Board>();
	}

	public BoardManager(Scanner scan, int size) {
    	this.scan = scan;
    	list = new ArrayList<Board>(size);
    }
	
	public int selectMenu(Scanner scan) {
		 System.out.println("--------�޴�-------");
		 System.out.println("1. �Խñ� ���� �Է�");
		 System.out.println("2. �Խñ� ���� ���");
		 System.out.println("3. �Խñ� ���� ����");
		 System.out.println("4. ���α׷� ����");
		 System.out.println("�޴��� �����ϼ��� : ");
		 int menu = scan.nextInt();
		 System.out.println("------------------");
		 return menu;
	}
	
	public void excute(int menu) {
		Object modBd = null;
		switch(menu) {
		case 1:
			Board Bd = inputsBoard();
		    InsertBoard();
			break;
		case 2:
			printBoard();
			break;
		case 3:
			Board modBd1 = inputsBoard();
			
			int index = list.indexOf(modBd1);
			
			if(index >=0) {
			   
				inputAdditionBoard(modBd);
			   
				list.set(index, (Board) modBd);
			}
			
			
			else {
				System.out.println("------------------");
				System.out.println("��ϵ��� ���� �Խ��� �����Դϴ�. �Խ��� ���� �Է��� �̿��ϼ���.");
				System.out.println("------------------");
			}
			break;
		case 4:
			Board delStd = inputsBoard();
			Object delBod = null;
			if (list.remove(delBod)) {
			   printMessage("�Խ��� ������ �����߽��ϴ�.");
		   }else {
			   printMessage("��ϵ��� ���� �Խ��� �����Դϴ�. ������ �� �����ϴ�.");
		   }	
			break;
		case 5:
			break;
		default:
			System.out.println("�߸��� �޴��� �����߽��ϴ�!!!");
		}
	}
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
	
	private void inputAdditionBoard(Object modBod) {
		if(Bd == null) {
			System.out.println("------------------");
			System.out.println("�Խ��� ������ �����ϴ�.");
			System.out.println("------------------");
			return;
		}
        try {
            System.out.println("������ �Խ��� ������ �Է��ϼ���");
            System.out.println("�̸� : ");
            String name = scan.next();
            String num = scan.next();
            
		    Bd.modify(name, num);
	    }catch(Exception e) {
	    	System.out.println("------------------");
	    	System.out.println("�Է¿��� �߸��� ���� �Է��߽��ϴ�. �Է��� ��ҵ˴ϴ�.");
	    	System.out.println("------------------");
	    	
	    	scan.nextInt();
	    	return;
		
	     }
	}
	private void printBoard() {
		if(list.size() == 0) {
			System.out.println("------------------");
			System.out.println("�Խ��� ������ �����ϴ�.");
			System.out.println("------------------");
			return;
		}
		System.out.println("------------------");
		for( Board tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("------------------");
	}

	private void InsertBoard() {
		if(Bd == null) {
			return;
		}
		if(list.contains(Bd)) {
			printMessage("�̹� �߰��� �Խ����Դϴ�. �Խ��� ���� ������ �̿��ϼ���.");
			return;
		}
		list.add(Bd);
		list.sort(new<Board>) {
			
				return 0;
		}
		System.out.println("------------------");
		System.out.println("�Խ��� ���� �߰��� �Ϸ� �Ǿ����ϴ�.");
		System.out.println("------------------");
	}
	public void printBoard1() {
		if(list.size() == 0) {
			System.out.println("------------------");
			System.out.println("�Խ��� ������ �����ϴ�.");
			System.out.println("------------------");
			return;
		}
		System.out.println("------------------");
		for(Board tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("------------------");
		
	}

	private Board inputsBoard() {
		try {
		    System.out.println("�˻��� �Խ��� ������ �Է��ϼ���");
		    System.out.println("�̸� ��ȣ �Է� : ");
		    int num = scan.nextInt();
		    String name = null;
		    return new Board(name, num, null, 0, 0, 0);
		}catch(Exception e) {
			System.out.println("------------------");
			System.out.println("�Է¿��� �߸��� ���� �Է��߽��ϴ�. �Է��� ��ҵ˴ϴ�.");
			System.out.println("------------------");
			
			scan.nextLine();
		    return null;
	    }
	}
	private void printMessage(String message) {
		System.out.println("------------------");
    	System.out.println(message);
    	System.out.println("------------------");
	}
}
