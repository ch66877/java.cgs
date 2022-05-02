package DAY5;

public class EX2 {

	public static void main(String[] args) {
				/* 0 <= Math.random() < ½Ç¼ö
				 * 0 (max-min+1) <= Math,random() * (max-min+1) < 1 * (max-min+1)
				 */  
				 int min = 1, max = 10;
				 int r;
		         for(int i = 1; i <= 10; i++) { 
		             r = (int)Math.random() * ((max-min+1) + min);
		             System.out.print(r + " ");
		         }

			}
		}
