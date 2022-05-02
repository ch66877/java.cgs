package DAY4;

public class EX3 {

	public static void main(String[] args) {
	/* 반복문을 이용하여 a부터 z까지 출력하는 코드를 작성하세요.
	 * 반복횟수 : 26번
	 * 실행문 : (char) ('a'+1)을 출력	 
	 * 반복문 종료 후 : 없음
	 */
	 int  i;	
     
	 for(i =0; i <26; i++) {
     
    	 System.out.println((char)('a'+1));
     }
	 System.out.println();
	 char j;
     
     for(j= 'a'; j <= 'z' ; i++) {
	     System.out.print(j);
     } 
     int num1 = 1;
     char ch1 = 'a' + 1;//리터럴상수 1은 char타입이어서 타입변환이 발생하지 않음
     char ch2 = (char) ('a' + num1 );//num1의 1은 int타입이어서 타입변환이 발생하고, 자율타입 변환이 되지 않는 상황이어서 예외
    }

}	