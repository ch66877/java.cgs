package DAY4;

public class EX13 {

	public static void main(String[] args) {
		/* 1���� 10������ ¦���� ����ϴ� �ڵ带 continue�� �̿��Ͽ� �ۼ��غ�����
         * �ݺ�Ƚ�� : i�� 1���� 10���� 1�� ����
         * ��Ģ�� : ���� Ȧ���̸� contunue. �ƴϸ� i�� ���
         * �ݺ��� ���� �� : ����
         * */
		
		//for������ conrinue�� ��������ġ�� �̵�
		for(int i = 1; i <= 10; i++) {
			if(i % 2 !=0) {
				continue;
			}
			System.out.println(1);
		}
		
		int i = 1;
		while(i<=10) {
			if(i % 2 !=0) {
				i++;
				continue;
			}
			System.out.println(1);
			i++;
			}
		}
	}
