package DAY12;

public class EX3 {

	public static void main(String[] args) {
		Animal a = new Animal();
        a.bark();
        Dog d = new Dog();
        d.bark();
        Cat c = new Cat();
        c.bark();

	}

}
class Animal{
	public void bark() {
		System.out.println("¢��");
	}
}
class Dog extends Animal{
	@Override
	public void bark() {
		System.out.println("----------");
		//super.�޼ҵ�()�� ù������ �ƴϾ �ȴ�
		super.bark();//�θ� Ŭ������ �޼ҵ� �ڿ� ���ο� ����� �߰�
		System.out.println("�۸�");
		System.out.println("----------");
	}
}
class Cat extends Animal{
	@Override
	public void bark() {
		//�θ� Ŭ������ �޼ҵ带 ��������ʰ� ������
		System.out.println("�߿�");
	}
}

