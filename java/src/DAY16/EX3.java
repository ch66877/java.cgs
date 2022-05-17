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
			//newInstance() : 자바 9버전 이후에 없어짐
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
