package DAY17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EX4 {

	public static void main(String[] args) {
		//new Date()�� ���� �ð��� �������� ���� ��ü�� ����
		Date date = new Date();
        System.out.println(date);
        //new Date(num)1970�� 1�� 1�� 00:00:00�� �������� num�и� �����尡 �帥 ��¥ ��ü�� ����
        Date date2 = new Date(1000);
        System.out.println(date2);
        //yyyy-mm-dd hh:mm:ss
        //DateŬ������ ��ü�� ���ϴ� ������ ���ڿ��� �ٲٴ� ����
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E����");
        String strDate = format.format(date);
        System.out.println(strDate);
        
        //���ڿ��� DateŬ������ ��ü�� �ٲٴ� ����
        Date date3;
		try {
			format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			date3 = format.parse("2022-05-13 13:22:13");
			System.out.println(date3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
