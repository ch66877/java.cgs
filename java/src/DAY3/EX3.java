package DAY3;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
        /* 두 점수와 산술 연산자(+-*/%)를 입력받아 출력하는 코드를 작성하세요
         *Scanner scan = new Scanner(System.in);
         System.out.println("정수1을 입력하세요 : ")
         int num1 = scan.nextInt();
         System.out.println("정수2을 입력하세요 : ")
         int num2 = scan.nextInt();
         System.out.println("산술연산자을 입력하세요 : ")
         char op  = scan.next()charAt(0);
         //정수 + 정수 => 정수
         //+는 유니코드표에서 십진수 43에 해당
         //문자열 + 정수 => 문자열
         System.out.println(num1 + op + num2);
         //방법2
         Scanner scan = new Scanner(System.in);
         System.out.println("정수와 산술연산자를 입력하세요(에 1 + 2) : ")
         int num3 = scan.nextInt();
         int num4 = scan.nextInt();
         char op1  = scan.next()charAt(0);
         System.out.println(num3 + op1 + num4);        
         scan.close();
	}
	
}