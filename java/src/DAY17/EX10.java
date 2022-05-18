package DAY17;

import java.util.HashSet;
import java.util.Set;

public class EX10 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<10; i++) {
        	set.add((int)(Math.random()*(15- 10 + 1)+10));
        }
        
        System.out.println(set);
	}

}
