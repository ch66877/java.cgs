package DAY16;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Class c;
		try {
			c= Class.forName("java.utill.Scanner");
			System.out.println(c);
			c= Class.forName("day12.car");
			System.out.println(c);
			//newInstance() : �ڹ� 9���� ���Ŀ� ������
			//Car car = (car)c.newInstance();
			//System.out.println(car);
			c= Class.forName("java.utill.Scanner1");
			System.out.println(c);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
