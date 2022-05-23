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
		 System.out.println("--------메뉴-------");
		 System.out.println("1. 학생정보 입력");
		 System.out.println("2. 학생정보 출력");
		 System.out.println("3. 학생정보 수정");
		 System.out.println("4. 학생정보 삭제");
		 System.out.println("5. 프로그램 종료");
		 System.out.println("메뉴를 선택하세요 : ");
		 int menu = scan.nextInt();
		 System.out.println("------------------");
		 return menu;
	}
	
	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			//학생 정보를 Scanner 입력받아 입력받은 정보로 이루어진 학생 객체를 받아오는 메소드
			Student std = inputsStudent();
			//학생정보를 추가
		    InsertStudent(std);
			break;
		case 2:
			printStudent();
			break;
		case 3:
			//학년 반 번호 => 학생 객체(A)를 생성
			Student modStd = inputsSearchStudent();
			
			int index = list.indexOf(modStd);
			//학생 객체(A)가 리스트에 있으면
			if(index >=0) {
			   //수정할 이름, 국어, 영어, 수학을 입력받아 학갱객체(A)를 수정
				inputAdditionStudent(modStd);
			   //리스트에서 학생 객체(A)로 수정
				list.set(index, modStd);
			}
			//학년, 반, 번호가 있는 객체가 주어지면 해당 객체에 이름, 국어, 영어, 수학을
			//입력받아 수정하는 메소드
			
			//없으면 학생이 없다고 알려줌
			else {
				System.out.println("------------------");
				System.out.println("등록되지 않은 학생정보입니다. 학생 정보 입력을 이요하세요.");
				System.out.println("------------------");
			}
			break;
		case 4:
		   Student delStd = inputsSearchStudent();
		   if (list.remove(delStd)) {
			   printMessage("학생 정보를 삭제했습니다.");
		   }else {
			   printMessage("등록되지 않은 학생정보입니다. 삭제할 수 없습니다.");
		   }	
			break;
		case 5:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다!!!");
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
			    printMessage("잘못된 형태의 메뉴를 입력했습니다.");
			    scan.nextInt();
		    }
		}while(menu != exitMenu);
		
	}

	private Student inputsStudent() {
		try {
		    System.out.println("학생 정보를 입력하세요");
		    System.out.println("학년 반 번호 입력 : ");
		    int grade = scan.nextInt();
		    int classNum = scan.nextInt();
		    int num = scan.nextInt();
		    String name = scan.next();
		    System.out.println("국어 영어 수학 성적 입력 : ");
		    int kor = scan.nextInt();
		    int eng = scan.nextInt();
		    int math = scan.nextInt();
		    return new Student(grade, classNum, num, name, kor, eng, math);
		}catch(Exception e) {
			System.out.println("------------------");
			System.out.println("입력에서 잘못된 값을 입력했습니다. 입력이 취소됩니다.");
			System.out.println("------------------");
			//입력을 잘못했을 떄 입력 버퍼에 있는 내용들을 문자열로 가져옴(입력버퍼를 비우는 역할)
			scan.nextLine();
			return null;
		}
	}//inputsStudent
	private void InsertStudent(Student std) {
		if(std == null) {
			return;
		}
		if(list.contains(std)) {
			printMessage("이미 추가된 학생입니다. 학생정보 수정을 이용하세요.");
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
		System.out.println("학생 정보 추가가 완료 되었습니다.");
		System.out.println("------------------");
	}//inputsStudent
	public void printStudent() {
		if(list.size() == 0) {
			System.out.println("------------------");
			System.out.println("학생 정보가 없습니다.");
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
		    System.out.println("검색할 학생 정보를 입력하세요");
		    System.out.println("학년 반 번호 입력 : ");
		    int grade = scan.nextInt();
		    int classNum = scan.nextInt();
		    int num = scan.nextInt();
		    return new Student(grade, classNum, num, null, 0, 0, 0);
		}catch(Exception e) {
			System.out.println("------------------");
			System.out.println("입력에서 잘못된 값을 입력했습니다. 입력이 취소됩니다.");
			System.out.println("------------------");
			//입력을 잘못했을 떄 입력 버퍼에 있는 내용들을 문자열로 가져옴(입력버퍼를 비우는 역할)
			scan.nextLine();
			return null;
		}
	}//inputStudent
	private void inputAdditionStudent(Student std) {
		if(std == null) {
			System.out.println("------------------");
			System.out.println("학생 정보가 없습니다.");
			System.out.println("------------------");
			return;
		}
        try {
            System.out.println("수정할 학생 정보를 입력하세요");
            System.out.println("이름 국어 영어 수학 입력 : ");
            String name = scan.next();
            int kor = scan.nextInt();
		    int eng = scan.nextInt();
		    int math = scan.nextInt();
		    std.modify(name, kor, eng, math);
	    }catch(Exception e) {
	    	System.out.println("------------------");
	    	System.out.println("입력에서 잘못된 값을 입력했습니다. 입력이 취소됩니다.");
	    	System.out.println("------------------");
	    	//입력을 잘못했을 떄 입력 버퍼에 있는 내용들을 문자열로 가져옴(입력버퍼를 비우는 역할)
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