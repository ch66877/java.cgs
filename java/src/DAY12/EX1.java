package DAY12;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c = new Child();
       c.x = 10;
       c.y = 20;
       //c.z = 30;
       c.setZ(30); 
	}

}

class Paraent{
	public int x;
	protected int y;
	private int z;
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
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public Paraent(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z; 
	}
	
}

class Child extends Paraent{
	public int s;
	public void print() {
		System.out.println(x);//public : ����
		System.out.println(y);//protected : �� + �ڽ� + ���� ��Ű��
		//System.out.println(z);//private : ��. �����߻�
		System.out.println(getZ());//z�� ���������� ������ �� ���� ������ getter�� �̿��Ͽ� ����
		System.out.println(s);
	}
	public Child() {
		super(0,0,0);
		//this(0,0,0,0);// this()�����ڿ� super()�����ڴ� ���� ���� ���� => this()���� �θ� �����ڸ� �̹� ȣ���߱� ������
		s = 3;
	}
	public Child(int x, int y, int z, int s) {
		super(x,y,z);
		this.s = s;
	}
}