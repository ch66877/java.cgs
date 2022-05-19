package DAY14;

import java.util.Scanner;

public class BaseballGameMain {

	private static final BaseballGame game = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BaseballGame BaseballGame = new BaseballGame(scan);
        game.run();
        scan.close();
	}

}
