package DAY19;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EX1 {

	public static void main(String[] args) {
		/* Map�� �پ��� Ÿ��(Ŭ����)�� �������� ��� ���� �� �ִٴ°� �����ִ� ���� */ 
		Map<String,Object> map = new HashMap<String,Object>();
        Point pt = new Point();
		String str =  "Hello";
		List<String> list = new ArrayList<String>();
		list.add("Ȧ�浿");
		map.put("point", pt);
		map.put("string", str);
		map.put("userList", list);
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Object obj = map.get(key);
			if(obj instanceof String) {
				System.out.println("���ڿ� : " + (String)obj);
			}else if(obj instanceof Point) {
				Point pt2 = (Point)obj;
				System.out.println(pt2.x + "," + pt2.y);
			}else if(obj instanceof ArrayList) {
				List<String> list2 = (ArrayList<String>)obj;
				System.out.println(list2);
			}
		}
	}

}