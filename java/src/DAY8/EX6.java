package DAY8;

public class EX6 {

	public static void main(String[] args) {

		point2 p1 = new point2();
		p1.print();
        System.out.println(p1.getX());
	}

}

class point2{
	private int x,y;
	
	 public void print() {
	    	System.out.println(x + ", " + y);
      }
	 /* ��� : �� x��ǥ�� ���� �־��� x1���� �����ϴ� �޼ҵ�
	  * �Ű����� : ������ ��ǥ x1 => int x1
	  * ����Ÿ�� : ���� => void
	  * �޼ҵ�� : setX*/
	 public void setx(int x1) {
		 x = x1;
	 }
	 public void sety(int y1) {
		 x = y1;
	 }
	 /* ��� : �� x��ǥ�� ���� �˷��ִ� �޼ҵ�
	  * �Ű����� : ����
	  * ����Ÿ�� : �� x��ǥ => ���� => int
	  * �޼ҵ�� : getX*/
	  public int getX() {
		  return x;
	  }
	  public int getY() {
		  return y;
	  }
}
class point3{
	private int x,y;
	
	 public void print() {
	    	System.out.println(x + ", " + y);
      }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}	 