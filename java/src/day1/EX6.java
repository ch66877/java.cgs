package day1;

public class EX6 {

	public static void main(String[] args) {
		/* ���� ''�ȿ� ���� �ѱ���
		 * ���� : p.34
		 * */
		char ch1 = '\t'; //TabŰ ��ŭ ����		
		char ch2 = '\n'; //����
		char ch3 = '\r'; //Ŀ���� ������ �̵�
		char ch4 = '\"'; //"����
		char ch5 = '\''; //'����
		char ch6 = '\\'; //\����
		char ch7 = '\u0000'; //�����ڵ� 0�� �ش��ϴ� ����
		char ch8 = 'A';

		int num = 65;
		char ch9 = (char)num;
		System.out.println(ch9);
		ch9 = (char)(num+1);
		System.out.println(ch9);
	}

}