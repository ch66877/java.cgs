package DAY11;

import DAY11_1.EX5B;

public class EX5 {

	public static void main(String[] args) {
		EX5A t1 = new EX5A();
		//public�� ��� ��� ����
        System.out.println(t1.num1);
        //default�� ���� ��Ű�������� ��� ����
        System.out.println(t1.num2);
        //private�� �� Ŭ���������� ��� ����
        //System.out.println(t1.num3);//���� �߻�
        
        EX5B t2 = new EX5B();
		//public�� ��� ��� ����
        System.out.println(t2.num1);
        //default�� ���� ��Ű�������� ��� ����
        //System.out.println(t2.num2);//���� �߻�. �ٸ� ��Ű���� �ִ� Ŭ�����̱� ����
        //private�� �� Ŭ���������� ��� ����
        //System.out.println(t1.num3);//���� �߻�
        //public int num = 2;//���� ������ ���������ڸ� ���� �� ����
	}
    public int num = 1;
	
}
