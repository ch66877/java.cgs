package DAY2;

public class EX14 {

	public static void main(String[] args) {
		/* ������ �´� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.(if�� �̿�)
		 * A : 90�̻� ~ 100����
		 * B : 80�̻� ~ 90�̸�
		 * C : 70�̻� ~ 80�̸�
		 * D : 60�̻� ~ 70�̸�
		 * F : 0�̻�  ~ 60�̸�
		 * ������ 0�̸��̰ų� 100�ʰ��� ��� �߸��� �����̶�� ����ϵ��� �����ϼ���.
		 * */
		int score = 75;
		if(score < 0 || score > 100) {
			System.out.println(score+"���� �߸��� ����");
		}else if(score >= 90) {
			System.out.println(score+"���� A����");
		}else if(score >= 80) {
			System.out.println(score+"���� B����");
		}else if(score >= 70) {
			System.out.println(score+"���� C����");
		}else if(score >= 60) {
			System.out.println(score+"���� D����");
		}else {
			System.out.println(score+"���� F����");
		}

	}

}