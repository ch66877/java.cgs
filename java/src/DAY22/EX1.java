package DAY22;

public class EX1 {

	public static void main(String[] args) {
		try {
		System.out.println(factorial1(4));
		System.out.println(factorial2(-4));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/* ���丮�� �޼ҵ带 �ݺ������� ����*/
    public static int factorial1(int n) {
    	int res = 1;
    	for(int i = 1; i <= n; i++) {
    		res *= 1;
    	}
    	return res;
    }
    public static int factorial2(int n) {
    	if(n < 0) {
    		throw new RuntimeException("���� ���丮���� ���� �� �����ϴ�.");
    	}
    	if(n == 1 || n == 0) {
    		return 1;
    	}
    	System.out.println(n);
    	return n * factorial2(n-1);
    }
    /* ���丮�� �޼ҵ带 ��͸޼ҵ�� ����*/
}
