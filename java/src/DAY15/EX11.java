package DAY15;

public class EX11 {

	public static void main(String[] args) {
		try {
			thorwException2();
		}catch(RuntimeException e) {
			System.out.println("��Ÿ�� ����");
		}catch(Exception e) {
			System.out.println("����");
		}

	}
	public static void thorwException1() throws Exception {
		/* ����(Exception)Ŭ������ ��Ÿ�ӿ��� Ŭ������ �θ� Ŭ�������� �ڽ� Ŭ������ �ƴϱ� ������
		 * ��Ÿ�� ���� Ŭ������ �ƴϴ�.
		 * => ���ܴ� ��Ÿ�ӿ��ܰ� �ƴϱ� ������ throws�� ��������Ѵ�. */
		throw new Exception();
	}

	public static void thorwException2(){
		/* ��Ÿ�� �����̱� ������ throws�� ��� �ǰ� ����� �ȴ�. */
		throw new RuntimeException();
	}
}
