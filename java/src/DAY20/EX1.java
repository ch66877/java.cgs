package DAY20;

import java.util.ArrayList;
import java.util.List;

public class EX1 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		Point pt = new Point();
		list.add(pt);
		list.add(new Point());
        list.add("123");
        list.indexOf(pt);//���������� ���� �־���� ������ ����Ʈ�� �ִ� ��ü�� pt�� ���� ��ü�� ����, �׷��� equals�� �������̵� ���ص� ���� 
        for(Object tmp : list) {
        	if(tmp instanceof Point) {
        	Point p = (Point)tmp;
        	System.out.println(p.x + ", " + p.y);
        }else {
        	System.out.println(tmp);
        }
		/* - indexOf, contains, containsAll, remove ���� �̿��� �� �ʿ��� �޼ҵ� : equals
		 *   PointŬ������ equals
		 * - equals�� �������̵��� ���ϸ� Object�� equals�� ȣ���� ��, �� �� equals�� �ּҸ� ����
		 *   (���� ��ü�� �� ���������� �����ϴ����� Ȯ��) 
		 * */
        list.indexOf(list);	
	   }
   }
}
class Point{
	int x,y;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}