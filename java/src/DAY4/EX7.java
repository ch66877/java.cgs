package DAY4;

public class EX7 {

	public static void main(String[] args) {
		/* 오버플로우, 언더플로우는 정수에서 표현범위를 넘어가는 경우 발생*/
		byte num = 127;
		//byte로 표련가능한 가장 큰 정수 127에 1을 더하면 128이 아닌 -128이 저장
		//byte는 128을 표현 못하기 때문
        //이러한 현상을 오버플로우라고 함
		num = (byte)(num +1);
		System.out.println(num);
		//byte로 표현 가능한 가장 작은 적은 정수 =128에 1을 빼면 -129가 아닌 127이 됨
		//언더플러오라고 함
		num = (byte)(num - 1);
		System.out.println(num);
	}

}
