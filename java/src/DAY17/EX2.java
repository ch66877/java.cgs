package DAY17;

public class EX2 {

	public static void main(String[] args) {
		/* 주어진 정수를 소수점 둘쨰자리에서 반올림하는 코드를 작성하세요.*/
        int num = 2;
		double p1 = 523.141592;
		//x를 곱해서 반올림
		double p12 = p1 * Math.pow(10, num-1);
		//반올림한 값에서 x로 나눔		
		double p13 = Math.round(p12) / Math.pow(10, num-1);
		double p14 = Math.round(p1 * Math.pow(10, num-1))/Math.pow(10, num-1);
		System.out.println(p13);
		System.out.println(p14);
	}

}
