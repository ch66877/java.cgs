package DAY17;

public class EX2 {

	public static void main(String[] args) {
		/* �־��� ������ �Ҽ��� �Ѥ��ڸ����� �ݿø��ϴ� �ڵ带 �ۼ��ϼ���.*/
        int num = 2;
		double p1 = 523.141592;
		//x�� ���ؼ� �ݿø�
		double p12 = p1 * Math.pow(10, num-1);
		//�ݿø��� ������ x�� ����		
		double p13 = Math.round(p12) / Math.pow(10, num-1);
		double p14 = Math.round(p1 * Math.pow(10, num-1))/Math.pow(10, num-1);
		System.out.println(p13);
		System.out.println(p14);
	}

}
