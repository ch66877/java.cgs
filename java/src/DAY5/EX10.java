package DAY5;

public class EX10 {

	public static void main(String[] args) {
		/* a              'a'부터 'a'까지
		 *                'a'부터 'b'까지
		 * ab
		 * abc
		 * ...
		 * abcdfg...xyz   'a부터 'z'까지
		 * 반복횟수 : end는 'a'부터 'z'까지 1씩 증가
		 * 규칙성 : ch는 'a'부터 end까지 1식 증가하며 ch를 출력
		 */

		for(char end = 'a'; end <='z'; end++) {
			
			for(char ch = 1; ch <= end; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
