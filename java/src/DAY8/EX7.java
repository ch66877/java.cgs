package DAY8;

public class EX7 {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
        System.out.println(sum(1.2, 2.3));
        System.out.println(sum(1.2f, 2.3));
        System.out.println(sum(1.2, 3));
       
	}
    public static int sum(int num1, int num2) {
    	return num1 + num2;
    }
    public static double sum(double num1, double num2) {
    	return num1 + num2;
    }
}
