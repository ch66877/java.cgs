package DAY16;

public class EX2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0;
		for(int i = 1; i<= 10000; i++) {
			sum += i;
		}
        long end = System.currentTimeMillis();
        
		System.out.println("1���� 10000���� �� : " + sum);
		System.out.println("�ҿ� �ð� : " + (end - start)/1000.0 + "��");
	}

}
