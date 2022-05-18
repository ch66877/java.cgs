package DAY17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EX12 {

	public static void main(String[] args) {
		/* Set�� �̿��Ͽ� 1~45������ �ߺ����� ���� ���� 6���� �����ϰ�, ����ϴ� �ڵ带 �ۼ��ϼ���. */

		Set<Integer> lotto = new HashSet<Integer>();
		int min = 1, max = 45;
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*(max - min + 1) + min));
		}
		System.out.println(lotto);
		for(Integer tmp : lotto) {
			System.out.println(tmp + " ");
		}
		System.out.println();
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.println(tmp + " ");
		}
		System.out.println();
		//������ �ζ�
		Set<Integer> user = new HashSet<Integer>();
		/* ��ĳ�ʸ� �̿��Ͽ� ������ 6�� �Է¹���. �ߺ����� ���� ���� 6���� �Է��ҋ�����. ������ �ζǿ� ����*/
		Scanner scan = new Scanner(System.in);
        while(user.size() < 6) {
		
		   int num = scan.nextInt();
		   if(num >= min && num <= max) {
			   user.add(num);
		   }
	    }
        System.out.println(user);
        /* lotto�� user���� ��ġ�ϴ� ������ ������ ���� ����ϼ���. */
        int count = 0;
        for(Integer tmp : lotto) {
        	if(user.contains(tmp)) {
        		count++;
        	}
        }
        System.out.println(count+"�� �ֽ��ϴ�.");
   }
}