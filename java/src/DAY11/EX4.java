package DAY11;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
	    System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		Scanner scan;
	}

}

class Tv{
	private final static int MIN_CHANNEL = 1;
	private int channel;
	public void print() {
		System.out.println("�ּ� ä�� : " + MIN_CHANNEL);
		System.out.println("���� ä�� : " + channel);
	}
	public Tv(int channel) {
		this.channel = channel;
		//minChannel = 2;//���� �߻�.final�� ���� ������ �����Ϸ��� �߱� ������
	}
	int a;
	static int b;
	final static int c=1;
}
