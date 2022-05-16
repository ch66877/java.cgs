package DAY14;

import java.util.Scanner;

public class AccountBookManager implements ConsoleProgram {

	private Scanner scan;
	private AccountBook abook;
	private final int exitMenu = 5;//���� �޴� ��ȣ
	
	public AccountBookManager(Scanner scan) {
		this.scan = scan;
		abook = new AccountBook();
		//���� ������(�׽�Ʈ��)
		Item item = new Item("2022-05-13", false, "�ſ�ī��", "����", 7000);
		abook.insertItem(item);
	}
	
	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("=========�޴�=========");
		System.out.println("1. ����� Ȯ��");
		System.out.println("2. ����� �߰�");
		System.out.println("3. ����� ����");
		System.out.println("4. ����� ����");
		System.out.println("5. ���α׷� ����");
		System.out.println("�޴� ���� : ");
		int menu = scan.nextInt();
		System.out.println("=====================");
		return menu;
	}
	
	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			readAccountBook();
			break;
		case 2:
		    if(insertAccountBook()) {
		    	System.out.println("������ �߰��߽��ϴ�.");
		    }else {
		    	System.out.println("���� �߰��� �����߽��ϴ�.");
		    }
		    System.out.println("====================");
		    break;
		case 3:
			if(modifyAccountBook()) {
		    	System.out.println("������ �����߽��ϴ�.");
		    }else {
		    	System.out.println("������ �����߽��ϴ�.");
		    }
		    System.out.println("====================");
			break;
		case 4:
			abook.readItems();
			System.out.print("������ �׸�(����) : ");
			int delIndex = scan.nextInt();
			System.out.println("=====================");
			Item delItem = abook.deleteItem(delIndex-1);
			if(delItem != null) {
				System.out.println(delItem);
				System.out.println("�� �׸��� �����Ǿ����ϴ�.");
				System.out.println("==================");
			}else {
				System.out.println("������ �����߽��ϴ�.");
				System.out.println("==================");
			}
			break;
		case 5: break;
		default:
			System.out.println("�߸��� �޴��Դϴ�.");
			System.out.println("==================");
		}
	}
	
	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != exitMenu);
		System.out.println("����ΰ� ����Ǿ����ϴ�.");
		System.out.println("=====================");
	}
	
	public void readAccountBook() {
		System.out.println("��ü[1, ��¥[2] ���� : ");
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1:
			abook.readItems();
			break;
		case 2:
			System.out.println("��¥ �Է�(yyyy-MM-dd) : ");
			String date = scan.next();
			abook.readItems("date",date);
			break;
		default:	
		}

		System.out.println("====================");
	}
	public boolean insertAccountBook() {
		System.out.print("��¥ : ");
		String date = scan.next();
		System.out.print("����(true)/����(false) : ");
		boolean income = scan.nextBoolean();
		System.out.print("���� ��� : ");
		String payment = scan.next();
		System.out.print("�׸� : ");
		String content = scan.next();
		System.out.print("�ݾ� : ");
		int price = scan.nextInt();
		Item item = new Item(date, income, payment, content, price);
		return abook.insertItem(item);
	}	
	public boolean modifyAccountBook() {
		abook.readItems();
		System.out.print("������ �׸�(����) : ");
		int modIndex = scan.nextInt();
		System.out.println("=====================");
		//����ο��� �����Ϸ��� �� ������ ���
		Item tmp = abook.getItem(modIndex-1);
		if(tmp != null) {
			System.out.println(modIndex+"," + tmp);
		}else {
			return false;
		}
		System.out.println("=====================");
		System.out.println("������ �׸� ������ �� �����Դϴ�, �����Ͻðڽ��ϱ�>[��:true/�ƴϿ�:false]");
		boolean ok = scan.nextBoolean();
		if(!ok) {
			return false;
		}
		System.out.print("����(true)/����(false)[�ʼ�] : ");
		boolean income2 = scan.nextBoolean();
		System.out.print("��¥�� �����ϰڽ��ϱ�?[��:true/�ƴϿ�:false] : ");
		ok = scan.nextBoolean();
		String date2 = null;
		if(ok) {
			System.out.print("��¥ : ");
			date2 = scan.next();
		}
	    System.out.println("��������� �����ϰڽ��ϱ�?(��:true/�ƴϿ�:false) : ");			
	    ok = scan.nextBoolean();
	    String payment2 =null;
	    if(ok) {
	    	System.out.print("������� : ");
	    	payment2 = scan.next();
	    }
	    System.out.println("�׸��� �����ϰڽ��ϱ�?(��:true/�ƴϿ�:false) : ");			
	    ok = scan.nextBoolean();
	    String content2 = null;
	    if(ok) {
	    	System.out.print("�׸� : ");
	    	 content2 = scan.next();
	    }
	    System.out.println("�ݾ��� �����ϰڽ��ϱ�?(��:true/�ƴϿ�:false) : ");			
	    ok = scan.nextBoolean();
	    int price2 = -1;
	    if(ok) {
	    	System.out.print("�ݾ� : ");
	    	price2 = scan.nextInt();
	    }
		return abook.modifyItem(modIndex-1, date2, income2, payment2, content2, price2);
			
	
	}
    public Item deletetAccountBook() {
    	abook.readItems();
		System.out.println("������ �׸�(����) : ");
		int delIndex = scan.nextInt();
		//����ο��� �����Ϸ��� �� ������ ���
		Item tmp = abook.getItem(delIndex-1);
		if(tmp != null) {
		System.out.println(delIndex+"," + tmp);
		}else {
			return null;
		}
		System.out.println("=====================");
	    System.out.println("������ �׸� ������ �� �����Դϴ�, �����Ͻðڽ��ϱ�>[��:true/�ƴϿ�:false]");
		boolean ok = scan.nextBoolean();
		if(!ok) {
			return null;
		}
		return abook.deleteItem(delIndex-1);
	}
    
}
