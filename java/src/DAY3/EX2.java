package DAY3;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
        System.out.print(false);	
	    boolean num1 = scan.hasNextDouble();
        System.out.println();
        
        //next() : �յ� ������ ������ �ܾ �о��
        System.out.print(false);
	    String str = scan.next();
        System.out.println();
	
        //Scanner���� ���ڸ� �޴� ����� ����
        //charAt(����) : ���ڿ����� ������ �ش��ϴ� ���ڸ� ������, 0�������� ����
        System.out.print(false);
	
        System.out.println();
    	
	
	scan.close();
	}

}
