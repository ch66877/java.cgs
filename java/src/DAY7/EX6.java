package DAY7;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		/* 1~45사이의 중복되지 않은 수 7개를 배얄에 저장하는 코드를 작성하세요.
		 */
        int lotto[] = new int[7];// 6번지가 보너스 번호
	    int count = 0;//배열에 저장된 중복되지 않은 숫자의 개수
	    for( ; count < 7 ; ) {
	    	int r = (int)(Math.random()*45 + 1);
	    	int i;
	    	for(i=0 ; i<count ; i++ ) {
	    		if(r == lotto[1]) {
	    			break;
	    		}
	    	}
	    	if(i == count) {
	    		lotto[count++] = r;
	    		System.out.println(r + " ");
	    	}
	    }
	    /*사용자 번호 : 1~ 45 사이의 정수 6개를 입력받아 user배열에 저장하는 코드를 작성하세요.*/
	    int user[] = new int[6];
	    Scanner scan = new Scanner(System.in);
	    System.out.println("로또 번호 입력 : ");
	    for(int i = 0; i<user.length; i++) {
	    	user[1] = scan.nextInt();
 	    }
	    /* 로또번호와 사용자 번호를 이용하여 등수를 출력하는 코드를 작성하세요.
	    * 1등 : 6개 일지
	    * 2등 : 5개 + 보너스(6번지) 번호 일지
	    * 3등 : 5개 일지 
	    * 4등 : 4개 일지
	    * 5등 : 3개 일지  
	    * 꽝 : 그 외
	    */
	    int count2 = 0; //일치하는 번호의 갯수
	    for(int i = 0; i<user.length; i++) {
	    	for(int j = 0; j<user.length; j++) {
	    		if(lotto[i] ==user[j]) {
	    			count2++;
	    			
	    		}
	    	}
	    }
	    switch(count2) {
	    case 6:
	    	System.out.println("1등");
	    	break;
	    case 5:
	    	int k;
	    	for(k=0; k<user.length; k++) {
	    		if(user[k] == lotto[6]) {
	    			break;
	    		}
	    	}
	    	if(k == user.length) {
	    		System.out.println("3등");
	        }else {
	        	System.out.println("2등");
	        }
	    	break;
	    case 4:
	    	System.out.println("4등");
	    	break;
	    case 3:
	    	System.out.println("5등");
	    	break;
	    default:
	    	System.out.println("꽝");
	    	break;
	    }
	    scan.close();
	}
	
}
