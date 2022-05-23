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
		 System.out.println("--------메뉴-------");
		 System.out.println("1. 게시글 정보 입력");
		 System.out.println("2. 게시글 정보 출력");
		 System.out.println("3. 게시글 정보 수정");
		 System.out.println("4. 프로그램 종료");
		 System.out.println("메뉴를 선택하세요 : ");
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
				System.out.println("등록되지 않은 게시판 정보입니다. 게시판 정보 입력을 이용하세요.");
				System.out.println("------------------");
			}
			break;
		case 4:
			Board delStd = inputsBoard();
			Object delBod = null;
			if (list.remove(delBod)) {
			   printMessage("게시판 정보를 삭제했습니다.");
		   }else {
			   printMessage("등록되지 않은 게시판 정보입니다. 삭제할 수 없습니다.");
		   }	
			break;
		case 5:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다!!!");
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
			    printMessage("잘못된 형태의 메뉴를 입력했습니다.");
			    scan.nextInt();
		    }
		}while(menu != exitMenu);
		
	}
	
	private void inputAdditionBoard(Object modBod) {
		if(Bd == null) {
			System.out.println("------------------");
			System.out.println("게시판 정보가 없습니다.");
			System.out.println("------------------");
			return;
		}
        try {
            System.out.println("수정할 게시판 정보를 입력하세요");
            System.out.println("이름 : ");
            String name = scan.next();
            String num = scan.next();
            
		    Bd.modify(name, num);
	    }catch(Exception e) {
	    	System.out.println("------------------");
	    	System.out.println("입력에서 잘못된 값을 입력했습니다. 입력이 취소됩니다.");
	    	System.out.println("------------------");
	    	
	    	scan.nextInt();
	    	return;
		
	     }
	}
	private void printBoard() {
		if(list.size() == 0) {
			System.out.println("------------------");
			System.out.println("게시판 정보가 없습니다.");
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
			printMessage("이미 추가된 게시판입니다. 게시판 정보 수정을 이용하세요.");
			return;
		}
		list.add(Bd);
		list.sort(new<Board>) {
			
				return 0;
		}
		System.out.println("------------------");
		System.out.println("게시판 정보 추가가 완료 되었습니다.");
		System.out.println("------------------");
	}
	public void printBoard1() {
		if(list.size() == 0) {
			System.out.println("------------------");
			System.out.println("게시판 정보가 없습니다.");
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
		    System.out.println("검색할 게시판 정보를 입력하세요");
		    System.out.println("이름 번호 입력 : ");
		    int num = scan.nextInt();
		    String name = null;
		    return new Board(name, num, null, 0, 0, 0);
		}catch(Exception e) {
			System.out.println("------------------");
			System.out.println("입력에서 잘못된 값을 입력했습니다. 입력이 취소됩니다.");
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
