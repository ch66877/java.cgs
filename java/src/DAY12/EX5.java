package DAY12;

public class EX5 {

	public static void main(String[] args) {
	Tire tire[] = new Tire[4];
	tire[0] = new HankookTire(100, 100, "�տ���");
	tire[1] = new HankookTire(100, 100, "�տ�����");
    tire[2] = new KumhoTire(100, 100, "�ڿ���");
    tire[3] = new KumhoTire(100, 100, "�ڿ�����");
	Car car1 = new Car(tire);
	car1.print();
	Tire tire2[] = {
			new HankookTire(90, 100, "�տ���"),
		    new HankookTire(90, 100, "�տ�����"),
		    new KumhoTire(90, 100, "�ڿ���"),
		    new KumhoTire(90, 100, "�ڿ�����")
	};
	Car car2 = new Car(tire2);
	car2.print();
	System.out.println("---------------");
	car2.repare(3, new HankookTire(80, 70, "�ڿ�����"));
	car2.print();
	System.out.println("---------------");
	car2.repare(3, new KumhoTire(80, 100, "�ڿ�����"));
	car2.print();
	}

}
