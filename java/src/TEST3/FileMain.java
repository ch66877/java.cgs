package TEST3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) {
		//���ϵ��� ������ ����Ʈ
		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int menu;
		do {
			System.out.println("�޴�");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� Ȯ��");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���α׷� ����");
			System.out.print("�޴��� �����ϼ��� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("���ϸ� : ");
				String inpuString = scan.next();
				list.add(inpuString);
				System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case 2:
				for(String tmp:list) {
					System.out.println(tmp);
				}
				break;
			case 3:
				System.out.print("�˻��� : ");
				String search = scan.next();
				for(String tmp : list) {
					//indexOf �̿�
					int index = tmp.indexOf(search);
					if(index >=0 ) {
						System.out.println(tmp);
					}
					//contains �̿�
					if(tmp.contains(search)) {
						System.out.println(tmp);
					}
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�. ");
				break;
			}
		}while(menu != 4);

		scan.close();
	}

}