package DAY16;

public class EX12 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("Hello world");
        System.out.println(sb2);
        sb2.append("!");//�������� !�� �߰�
        System.out.println(sb2);
        sb2.insert(0, "Hi. ");//0������ Hi. �� �߰�
        System.out.println(sb2);
        sb2.insert(sb2.length(), "?");//insert�� �̿��Ͽ� append ��� ����
        System.out.println(sb2);
        sb2.delete(0, 2);//0�������� 2���� ��(1����)���� ����
        System.out.println(sb2);
        sb2.replace(0, 0, "Hello");//replace�� �̿��Ͽ� 0������ insert�� ��� ����
        System.out.println(sb2);
        System.out.println(sb2.reverse());
	}

}
