package DAY6;

public class EX2 {

	public static void main(String[] args) {
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1;j<=5; j++) {
				System.out.println(i + "," +j);
				if(j==3) {
					break;
				}
			}
			//break�� ������ �� ��ġ�� �̵�
		}
		System.out.println("------------------");
			out:for(i=1; i<=5; i++) {
				for(j=1;j<=5; j++) {
					System.out.println(i + "," +j);
					if(j==3) {
						break out;
					}
				}
				//break�� ������ out�ݺ����� ���� �� ��ġ�� �̵�
		}

	}

}
