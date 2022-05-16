package DAY14;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    AccountBookManager accountBookManager = new AccountBookManager(scan);
	    accountBookManager.run();
	    scan.close();
		
	}

}
