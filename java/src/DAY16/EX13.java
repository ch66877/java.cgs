package DAY16;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EX13 {

	public static void main(String[] args) {
		String regex = "010(-\\d{4}){2}$";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ȭ��ȣ �Է� : ");
	    String number = scan.next();
	    if(Pattern.matches(regex, number)) {
	    	System.out.println("�ùٸ��� �Է��߽��ϴ�.");
	    }else {
	    	System.out.println("Ʋ���� �Է��߽��ϴ�.");
	    }
	    scan.close();
	}

}
