package DAY12;

public class Ex6 {

	public static void main(String[] args) {
		//�߻� Ŭ������ �̿��Ͽ� ��ü�� ���� �� ����.
		//Ex6_Animal animal = new Ex6_Animal();
		Ex6_Dog dog = new Ex6_Dog();
		dog.bark();
		Ex6_Animal animal = new Ex6_Dog();
		animal.bark();
	}
}

/* �߻� Ŭ������ �߻� �޼ҵ�� �Ϲ� �޼ҵ� ��� ������ �� �ִ�. 
 * �߻� �޼ҵ忡�� �ʵ尡 ���� �� �ִ�.*/
abstract class Ex6_Animal{
	public String type;//��
	public abstract void bark();
	public void print() {
		System.out.println("�����Դϴ�.");
	}
}
/* �߻� Ŭ������ ��� ���� �ϸ� Ŭ������ �ݵ�� �߻�޼ҵ带 �������̵��ؾ��Ѵ�. */
class Ex6_Dog extends Ex6_Animal{

	@Override
	public void bark() {
		System.out.println("�۸�");
	}

} 