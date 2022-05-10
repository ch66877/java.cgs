package DAY10;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		/* 아래과 같이 출력되도록 코드를 작성하세요.
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 좌표를 입력하세요 (예 : 1 2 3) : 1 2 3
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * (1,2,3)
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴 선택 : 3
		 * 프로그램 종료
		 */
		 Scanner scan = new Scanner(System.in);
		 int menu = 0;
		 Point3D1 pt = new Point3D1(0,0,0);
		 for( ; menu !=3 ; ) {
			 System.out.println("1.좌표설정");
			 System.out.println("2.좌표출력");
			 System.out.println("3.종료");
			 System.out.println("메뉴를 선택하세요 : ");
			 menu = scan.nextInt();
			 switch(menu) {
			 case 1:
				 System.out.println("좌표룰 입력하세요(예: 1 2 3 : ");
				 int x = scan.nextInt();
				 int y = scan.nextInt();
				 int z = scan.nextInt();
				 pt = new Point3D1(x , y, z);
				 break;
			 case 2: 
				 pt.printX();
				 break;
			 case 3: 
				 System.out.println("프로그램 종료");
				 break;
			 default: 
               System.out.println("잘못된 메뉴입니다.");
				 
			 }
		 }
         scan.close();			 
	}

}

/* 다음 정보를 가지는 3차원에서 점을 나타내는 클래스를 생성하세요.
 * 정보 : 점 x, 점 y, 점 z 
 * 기능 : 좌표를 출력하는 기능
 */
class Point3D1{
	int x, y, z;
	void printX() {
		System.out.println(x);
	}
    void printY() {
		System.out.println(y);
	}
	void printZ() {
		System.out.println(z);
	}
	public Point3D1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}