package DAY22;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ScoreManager sm = new ScoreManager(scan);
		sm.run();
		scan.close();
	}
}