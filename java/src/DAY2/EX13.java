package DAY2;

public class EX13 {

	public static void main(String[] args) {
		/* num�� ����̸� ������ ����ϰ�,
		 * num�� �����̸� ������� ����ϰ�,
		 * num�� 0�̸� 0�̶�� ����ϴ� �ڵ带 if���� �̿��Ͽ� �ۼ��ϼ���.
		 * */
		/* if������ 
		 * if�� �ݵ�� 1���־�� ��.
		 * else if�� 0�� �̻� ������ ����.
		 * else�� 0�� �Ǵ� 1�� �־����.
		 * */
		int num = 5;
		if(num > 0 ) {
			System.out.println(num + "�� ���");
		}
		else if(num < 0) {
			System.out.println(num + "�� ����");
		}
		else{
			System.out.println(0);
		}
	}

}