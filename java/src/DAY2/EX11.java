package DAY2;

public class EX11 {

	public static void main(String[] args) {
		/* num�� ¦���̸� ¦����� ����ϴ� �ڵ带 if���� �̿��Ͽ� �ۼ��ϼ���.
		 * ~�ϸ� ...�Ѵ�
		 * ~   : ���ǽ�
		 * ... : ���๮;
		 * 	if(���ǽ�){
		 * 		���๮;
		 * 	}
		 * 	if(num�� ¦���̴�){
		 * 		¦����� ���;
		 * 	}
		 * */
		if(true) {
			System.out.println("���Դϴ�.");
		}
		int num = 3;
		if(num % 2 == 0){
			System.out.println(num + "�� ¦��");
		}
		/* score�� 90���̻��̰�, 100�������̸� A�����̶�� ����ϴ� �ڵ带 if���� �̿��Ͽ� �ۼ��ϼ���.
		 * if(score�� 90���̻��̰� score�� 100�������̴�){
		 * 		A�����̶�� ���;
		 * }
		 * if(score�� 90������ ũ�ų� ���� && score�� 100������ �۰ų� ����){
		 * 		A�����̶�� ���;
		 * }
		 * */
		int score = 89;
		if(score >= 90 && score <= 100) {
			System.out.println(score + "�� A����");
		}
	}

}