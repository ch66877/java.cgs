package DAY17;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EX10_List_Iterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
        //���� for�� : �迭�� ����Ʈ�� ����
		for(Integer tmp : list) {
			System.out.println(tmp + " ");
		}
		System.out.println();
		
		//Iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.println(tmp + " ");
		}
		System.out.println();
	}

}
