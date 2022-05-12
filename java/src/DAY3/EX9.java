package DAY3;

import java.util.Scanner;

public class EX9 {

	public static void main(String[] args) {
        /* 두 정수의 산술 연사자를 입력받아 산술 연산 결과를 출력하는 코드를 switch문으로 작성하세요.
         * 산술 연산자가 아닌 경우 ??은 산술연산자가 아닙니다로 출력
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("두 정수와 산술연산자를 입력하세요(에 : 1 / 2) : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        char op  = scan.next().charAt(0);
        System.out.println(num1 + op + num2);
        
        switch(op) {
        case '+':
        	System.out.println(
           break;
        case '-':
        	System.out.println(
           break;
        case '/':
        	System.out.println(
           break;
        case '*':
        	System.out.println(
           break;
        case '%':
        	System.out.println(
           break;
        default:
        	System.out.println(op+"는 산술 연산자가 아닙니다.")
        }
	}

}