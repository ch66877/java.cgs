package DAY7;

public class EX7 {

	public static void main(String[] args) {
		int score[] = {100, 90, 30};
		int sum = 0;
		double avg;
		
		for(int tmp : score) {
			sum += tmp;
			tmp = 10;
		}
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
        avg = sum / (double)score.length;
        System.out.println("ÃÑÁ¡ : " + sum + ", Æò±Õ" + avg);
        
	}

}
