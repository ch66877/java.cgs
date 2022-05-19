package DAY18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EX1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("abc123", "abc123");
		map.put("abc456", "abc123"); //��� �ߺ�, ���� ����
		map.put("abc123", "123456"); //���̵� �ߺ�, ���� �� �����
		map.put("id", "pw");
		
		//Set<Map.Entry<String, String>> entry = map.entrySet();
		//Iterator<Map.Entry<String, String>> it = entry.iterator();
		//Map�� ����� ȸ���� ���̵�� ��й�ȣ�� �ϳ��� ��ü�� ���� List�� ����
		List<User> list = new ArrayList<User>();
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			list.add(new User(entry.getKey(), entry.getValue()));
		}
		System.out.println(map);
		System.out.println(list);
		map.remove("abc456");
		System.out.println(map);
		System.out.println("abc123ȸ���� �ֽ��ϱ�? : "+map.containsKey("abc123"));
		System.out.println("��й�ȣ�� 456�� ȭ���� �ֽ��ϱ�? : " + map.containsValue("456"));
		
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			String id = it2.next();
			String pw = map.get(id);
			System.out.println(new User(id,pw));
		}
	}

}
class User{
	String id, pw;
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "[Id : " + id + ", PW : " + pw + "]";
	}
}