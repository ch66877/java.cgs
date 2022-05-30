package TEST3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telephon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		ArrayList name = new ArrayList();
		// 이름을 저장할 ArrayList name 생성
		ArrayList num = new ArrayList();
		// 번호를 저장할 ArrayList num 생성
		String na, nu;
		// 이름, 번호를 입력받을 변수 선언

		int menu;
		do {
			System.out.println("메뉴");
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 확인");
			System.out.println("3. 전화번호 검색");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("추기할 이름을 입력하세요");
                na = scan.next();
                // 이름이 등록되어 있지 않다면 연락처 저장
                // indexOf는 객체가 없다면 -1 있으면 그 위치를 반환
                // -1이 반환된다는건 중복이 없다는 뜻이다.
                if(name.indexOf(na) == -1) {
                    name.add(na);
                    System.out.println("추기할 번호를 입력하세요");
                    nu = scan.next();
                    // 입력받은 번호를 ArrayList num에 추가
                    num.add(nu);
                    System.out.println("저장된 이름은 : " + na + " / 번호는 : " + nu + "입니다.");
                    // 이름이 저장되어 있다면 중복된 이름이 있다고 반환
                } else {
                    System.out.println("중복된 이름이 있습니다.");
                }
				break;
			case 2:
				 System.out.println("누구의 전화번호를 확인하시겠습니까?");
	                // 저장되어 있는 모든 이름을 확인
	                for(int i=0; i<name.size(); i++) {
	                    System.out.println("이름 : " + name.get(i));
	                }
	                na = scan.next();
	                // 확인할 이름의 인덱스 번호 확인
	                // name.indexOf(na);
	                
	                // 저장되어 있는 값이 없으면 -1이 출력
	                if(name.indexOf(na) == -1) {
	                    System.out.println("목록에 없습니다.");
	                } else {
	                    System.out.println(na + "의 번호는 " + num.get(name.indexOf(na)));
	                    
	                }
				break;
			case 3:
				System.out.print("검색어 : ");
				String search = scan.next();
				int index = 0;
				for(String tmp : list) {
					//indexOf 이용
					index = tmp.indexOf(search);
					if(index >= 0 ) {
						break;
					    }
				    }	
				    if(index >= 0) {
					System.out.println(name.get(index)+":"+ num.get(index));
				}
				break;
			case 4:
				System.out.println("4. 프로그램을 종료합니다. ");
				break;
			}
		}while(menu != 4);
		
		scan.close();
	}

}