package DAY7;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		/* �� ������ ��� ������ ���� ���ڿ��� �Է����� �� ��� ���� ����� ����ϴ� ���� */
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ������ �Է��ϼ��� : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("ADD : ���ϱ� ");
		System.out.println("SUB : ���� ");
		System.out.println("MUL : ���ϱ� ");
		System.out.println("DIV : ������ ");
		System.out.println("MOD : ������ ");
		System.out.println("��� �����ڸ� �Է��ϼ��� (��: ADD) : ");
		String op = scan.next();
		Operator operator = Operator.valueOf(op);
		switch(operator) {
		case ADD:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
			break;
		case SUB:
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
			break;
		case MUL:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
			break;
		case DIV:
			System.out.println(num1 + " / " + num2 + " = " + (num1 / (double)num2) );
			break;
		case MOD:
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2) );
			break;
		}
	}
}
enum Operator{
	ADD, SUB, MUL, DIV, MOD
}