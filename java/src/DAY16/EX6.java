package DAY16;

public class EX6 {

	public static void main(String[] args) {
		/* �־��� str�� search�� ��� �ִ��� ����ϴ� �ڵ带 �ۼ��Ͽ� Ȯ���ϼ���. */
		String str = "abcdbcdabcadd";
	    String search = "ab";    
	    int index = 0;
	    int count = 0;
	    do {
	    	index = str.indexOf(search, index);
	        if(index >= 0) {
	        	count++;
	        	index = index + search.length();
	        }
	    }while(index >= 0);
	    System.out.println(str+"���� " + search+"��" +count +"�� �ֽ��ϴ�.");
	}

}
