package DAY15;

public class EX7 {

	public static void main(String[] args) {
    int num1 = 1, num2 = 0;
	int res = 0;
	try {
		/* - ���ܰ� �߻����� �� ���� ó���� ���ϸ� ���α׷��� �ߴܵ�����
		 * 	 ����ó���� �ϸ� ���α׷��� �ߴܵ��� �ʰ� ����ó���� �� �� �̾ ���� 
		 * - ���ܰ� �߻��ϸ� �ؿ� �ڵ尡 �ִ� ���� ������� ���ܸ� ó���� �� �ִ� catch�� �̵��� �ؼ�
		 * 	 (���ܸ� ó���� �� �ִ� catch ���� ��� ó���� �� ��� ���α׷� �ߴ�) ����ó���� ��
		 * - catch�� �������� �� �� �ְ�(1���̻�), Exception�� ó���Ѵٸ� Exception �� ������ ������ catch�� ��ġ�ؾ���
		 * - catch�� �ۼ��� �� �θ� ���ܵ��� �ڽ� �Ʒ��� ��ġ*/
		res = num1 % num2;
		System.out.println(res);
	}
	//RuntimeException�� ArrayIndexOutOfBoundsException ���� �߰��ϸ� ���� �߻�
	//ArrayIndexOutOfBoundsException�� �߻��ص� RuntimeException���� �ɸ��� ������
	//ArrayIndexOutOfBoundsException�� ������ ���� ����
	//catch (RuntimeException e) {}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("0���� ���� �� �����ϴ�.");
	}catch(Exception e) {
		System.out.println("���� �߻�");
		return ;
	}finally {
		/* ���� ó���� �޼ҵ尡 ����ǵ� ������ finally�� ���� */
		System.out.println("finally�Դϴ�.");
	}
	//���� �߻�. ���� Exception e ������ ArithmeticException ���� �� ���� ���� ���� ����
	//catch(ArithmeticException e) { }
	System.out.println("���α׷� ����");

}

}
