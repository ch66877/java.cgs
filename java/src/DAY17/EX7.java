package DAY17;

import java.util.*;

public class EX7 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
        Vector<Integer> list2 = new Vector<Integer>();
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        List<Integer> list4 = new ArrayList<Integer>();
        
        list1.add(10);//���� 10�� �ڵ� �ڽ����� Integer�� ��ü�� ��ȯ �� ����Ʈ�� �߰�
        list1.add(20);
        list1.add(0, 30);//0������ 30�� �߰�, ������ 0������ �ִ� 10�� �и�
        list1.add(20);
        list4.addAll(list1);
        
        list1.set(0, 3);
        
        System.out.println("list1 : " +list1);
        System.out.println("list1�� 0���� �� : " +list1.get(0));
        System.out.println("list1�� 30�� �ִ°� : " + list1.contains(30));
        System.out.println("list1�� 10�� �ִ°�? : " + list1.indexOf(10) + "����");
        System.out.println("list1�� �ִ� ���� ����: " + list1.size()+"��");
        System.out.println("list4 : " + list4);
        Integer num = list4.remove(0);
        System.out.println("list4���� ������ 0������ �� : " + num);
        System.out.println("list4 : " + list4);
        System.out.println("list4���� ������ 20�� ���� �ߴ°�? : " + list4.remove((Integer)20));
        System.out.println("list4 : " + list4);
        list4.clear();
        System.out.println("list4 : " + list4);
        
	}
}
