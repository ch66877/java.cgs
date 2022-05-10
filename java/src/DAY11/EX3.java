package DAY11;

import java.util.Calendar;

public class EX3 {

	public static void main(String[] args) {
		Test3 t1 = Test3.getInstance();
		Test3 t2 = Test3.getInstance();
        if(t1 == t2) {
        	System.out.println("���� ��ü");
        }else {
        	System.out.println("�ٸ� ��ü");
        }
	}

}

class Test3{
	//�ڽ��� Ŭ������ �̿��Ͽ� ����(�𷡽�) ����� �����ϰ� ��ü�� ���� 
	private static Test3 t = new Test3(5);
	private int num;
	//�ܺο��� �����ڸ� ȣ������ ���ϵ��� ���������ڸ� private���� ����
	private Test3(int num) {
		this.num = num;
	}
	//������ ��ü�� �ܺο��� ����� �� �ֵ��� getInstance�� ����
	public static Test3 getInstance() {
		return t;
	}
}