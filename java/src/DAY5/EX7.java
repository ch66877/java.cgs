package DAY5;

public class EX7 {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		int num = 5;
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        /* 아래와 같이 출력되도록 코드를 작성하세요.
         *      *    i=1 " " =4 *1
         *     **    i=2 " " =3 *2
         *    ***    i=3 " " =2 *3
         *   ****    i=4 " " =1 *4
         *  *****    i=5 " " =0 *5
         *               " " =i호환식, "=i로된 식   
         */  
		for(int i = 1; i<=5; i++) {
			//공백 출력 : 5-i
			for(int j = 1; j <=5-i; j++) {
				System.out.print(" ");
			}
			//*을 출력 : i
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			//엔터 출력
			System.out.println();										
		}
        /*     *        i=1 " " =4 *1
         *    ***       i=2 " " =3 *3
         *   *****      i-3 " " =2 *5
         *  *******     i-4 " " =1 *7
         * *********    i=5 " " =0 *9
         *                  " " =5-i *=2*i-1
         */                  
		for(int i = 1; i<=5; i++) {
			//공백 출력 : 5-i
			for(int j = 1; j <=5-i; j++) {
				//*을 출력 : 2*i - 1
				System.out.print(" ");
			}	
			for(int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			//엔터 출력
			System.out.println();										
		}	
		/*     *        i=1 " " =4 *1 *0
		 *    ** *      i=2 " " =3 *2 *1
		 *   *** **     i=3 " " =2 *3 *2
		 *  **** ***    i=4 " " =1 *4 *3
		 * ***** ****   i=5 " " =0 *5 *4
		 *                  " " =5-i *=i *=i-1 
  		 */
			for(int i = 1; i<=5; i++) {
				for(int j = 1; j <=5-i; j++) {
					System.out.print(" ");
				}	
				for(int j = 1; j <=i; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <=i-1; j++) {
					System.out.print("*");
				}
				System.out.println();	
		}
	
    }

}
