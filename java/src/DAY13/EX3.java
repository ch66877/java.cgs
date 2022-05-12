package DAY13;

public class EX3 {

	public static void main(String[] args) {
		A a1 = new A(1,2);
		A a2 = new A(1,2);

		if(a1 == a2) {
			System.out.println("���� ���Դϴ�.");
		}else {
			System.out.println("�����ϰ� ���� �ʽ��ϴ�.");
		}
		if(a1.equals(a2)) {
			System.out.println("���� �ʵ带 ���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		System.out.println(a1.toString());
	
		//=�� ���� ��ü�� �����ϸ� ����. a1�� a3�� ���� ��ü�� ����
		A a3= a1;
		//a3 num1�� ���� ���� => a1�� num1�� ���� ���� ����
	    a3.setNum(3);
	    System.out.println("-----------");
	    System.out.println(a3.toString());
	    System.out.println(a1.toString());
	   
	    //Ŭ���� ���� ��ü�� �����ϸ� ���ο� ��ü�� ������ �� �ʵ带 ������ ��ü�� ��ȯ
	  	a3= (A)a1.clone();
	  	//a3 num1�� ���� ���� => a1�� num1�� ���� ���� ����
	    a3.setNum(5);
	    System.out.println("-----------");
	    System.out.println(a3.toString());
	    System.out.println(a1.toString());
	}

}
class A implements Cloneable {
	private int num1;
	private int num2;
	
	public A(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void setNum(int i) {
		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//num = 1, num = 2
		result = prime * result + num1; //32
		result = prime * result + num2; //31 * 32 + 2 => 994
		return result;
	}
	/*@Override
	public boolean equals(Object obj) {
		//�� ��ü�� �ּҰ� ������ Ȯ�� => �� ��ü�� ���� ��ü�� �����ϴ��� Ȯ��
	 	if(this == obj) {
	 		return true;
	 	}
	 	//��� ��ü�� ������ �� �Ұ���
        if(obj == null) {
        	return false;
        }
        //obj�� A�� Ÿ�Ժ�ȯ�� �Ұ����ϸ� ���� �� ����
	    if(!(obj instanceof A)) {
	    	return false;
	    }
	    A object = (A)obj;
	    if(num1 != object.num1) {
	    	return false;
	    }
	    if(num2 != object.num2) {
	    	return false;
	    }
	    
	    return true;
	}
	*/

	public String toStrig() {
		return "A [num1 =" + num1 + ", num2= " + num2 + ")";
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	//�Ϲ����� clone�� ���� ����. ���� ������ �Ϸ��� ���� �����ؾ���.
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			    e.printStackTrace();
		}
		return obj;
	}
}
