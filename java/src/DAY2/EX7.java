package DAY2;

public class EX7 {

	public static void main(String[] args) {
		/* ���� ���� ������ ����
		 * (���ǽ�) ? ���϶��� : ������ �� �� 
		 * ������ A�����̸� A�������� ����ϰ�, �ƴϸ� A������ �ƴ����� ����ϴ� ����
		 * */
		int score = 50;
		String isA = (score >= 90 && score <= 100)?"A����" : "A������ �ƴ�";
		System.out.println(score + "���� " + isA);
	}

}