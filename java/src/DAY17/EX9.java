package DAY17;

import java.util.ArrayList;
import java.util.List;

public class EX9 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
        Student std = new Student(1, 1, 1, "ȫ�浿");
        list.add(new Student(std));
        
        System.out.println(list);
        /* �л� ��ü std�� �����Ͽ�, ����Ʈ�� �߰��� ��, �л� ��ü�� �������� �� ������ ���� �� �ִ�.
         * => ���� �����ڸ� �̿��Ͽ� ��ü�� �����ؼ� ����Ʈ�� �߰��ؾ� �Ѵ�.
         * => �Ǵ� �л� Ŭ������ clone()�� �������̵��ؼ� �����ؼ� ����Ʈü �߰��ϸ� �ȴ�. */
		std.setName("�Ӳ���");
		System.out.println(list);
	}

}
