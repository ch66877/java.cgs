package DAY3;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
        System.out.println("정수와 산술연산자를 입력하세요(에 1 + 2) : ")
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        char op1  = scan.next()charAt(0);
        System.out.println(num3 + op1 + num4);        

        if(op1 == '+') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 + num4));
        }else if(op1 == '-') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 - num4));
		}else if(op1 == '*') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 * num4));
		}else if(op1 == '/') {
			System.out.println(""+num3 + op1 + num4 + "=" + ((double)num3 / num4));
		}else if(op1 == '%') {
			System.out.println(""+num3 + op1 + num4 + "=" + (num3 % num4));
		}else{
			System.out.println(op1+"는 산술 연산자가 아닙니다.");
	    int res = (int)(1 / 2.0);
	    double res2 = 1/2;
	    
	    scan.close();
		}

}
