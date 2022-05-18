package DAY17;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Ex11 {

	public static void main(String[] args) {
	    Set<Integer> set = new HashSet<Integer>();
	    for(int i = 0; i<10; i++) {
	    	int r = (int)(Math.random()*(9 - 1 + 1)+1);
	    	System.out.println(r + " : " + set.add(r));
	    }

	    System.out.println(set);
	    System.out.println("1 »èÁ¦ ? "+set.remove(1));
	    System.out.println(set);
	    
	    Iterator<Integer> it = set.iterator();
	    while(it.hasNext()) {
	    	Integer tmp = it.next();
	    	System.out.println(tmp + " ");
	    }
	    System.out.println();
	}

}
