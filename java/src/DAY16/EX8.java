package DAY16;

public class EX8 {

	public static void main(String[] args) {
		String str = "\t\t\n\nabcefg\n\n";
        System.out.println(str);
        System.out.println("---------------");
        str = str.trim();//�յ� ���� ����
        System.out.println(str);
        str = str.substring(1);//1�������� ������ �κ� ���ڿ� ����
        System.out.println(str);
        str = str.substring(1,3);//1�������� 3��������(2��������) �κ� ���ڿ� ����
        System.out.println(str);
	}

}
