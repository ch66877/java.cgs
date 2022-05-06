package DAY9;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		/* �� �������� ����� �޼ҵ���� �ȿ��ϸ� ����ٿ��ֱ� �ؼ� �ζ� ���α׷��� �ۼ��ϼ���.
		 * �ʿ��� ����� �޼ҵ�� �߰��ص� �˴ϴ�.
		 */
		Scanner scan = new Scanner(System.in);
		int n = 6;
		int min =1, max = 45;
		//�ζ� ���� : �ζǹ�ȣ �Է�(6�ڸ�, 1~ 45)
		System.out.print("�ζ� ��ȣ �Է�("+n+"��) : ");
		int user[] = inputCreateArray(scan, n);
		//�ζ� ��÷��ȣ ����(����, 1~45, �ߺ�x, 6�ڸ�)
		int lotto[] = createRandomArray(min, max, n);
		//�ζ� ���ʽ� ��ȣ ����
		int bonus;
		for( ; ; ) {
			bonus = (int)(Math.random()*(max - min + 1) + min);
			if(!contains(lotto, lotto.length, bonus)) {
				break;
			}
		}
		System.out.print("��÷��ȣ : ");
		printArray(lotto);
		System.out.println("���ʽ� ��ȣ : " +bonus);

		//��÷ ���� Ȯ��
		int count = getCount(user, lotto);
		//��÷ ��� ���
		printResult(count, contains(user, user.length, bonus));
	}
    //�ζ� ��ȣ�� �Է��ϸ� �迭�� ���� �˷� �ִ� �޼ҵ�
	
	//min~max ������ �ߺ����� ���� n���� ���� �����Ͽ� �迭�� �����ϴ� �޼ҵ�
	
	//�迤�� ����ϴ� �޼ҵ�
	
	//�迭 n���߿� num�� �ִ��� ������ �˷��ִ� �޼ҵ�
	
	//��÷ ���� �˷��ִ� �޼ҵ�
	
	//��÷ ��� ����ϴ� �޼ҵ�
	/* ��� : �־��� Scanner�� �̿��Ͽ� �ֿܼ��� ������ n�� �Է¹޾� �迭�� ��ȯ�ϴ� �޼ҵ�
	 * �Ű����� : Scanner, �Է¹��� ������ ���� => Scanner scan, int n
	 * ����Ÿ�� : ���� �迭 => int []
	 * �޼ҵ�� : inputCreateArray 
	 * */
	public static int[] inputCreateArray(Scanner scan, int n) {
		if( n <= 0) {
			return null;
		}
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	/* ��� : ������ �迭���� ó������ n���߿��� ���� num�� �ִ��� ������ �˷��ִ� �޼ҵ�
	 * �Ű����� : ������ �迭, Ȯ���� ���� n, ���� num => int arr[], int n, int num
	 * ����Ÿ�� : �ִ��� ������ => boolean
	 * �޼ҵ�� : contains
	 * */
	public static boolean contains(int arr[], int n, int num) {
		//�迭�� �߸��ǰų� �� ������ �߸��Ǽ� ���� �ʿ䰡 ���� ���
		if(arr==null || arr.length == 0 || n <= 0) {
			return false;
		}
		if(arr.length < n) {
			n = arr.length;
		}
		for(int i = 0; i<n; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}

	/* ��� : ������ �迭�� �־����� ��, �־��� �迭�� ���� �ֿܼ� ����ϴ� �޼ҵ�
	 * �Ű����� : ������ �迭 => int num[]
	 * ����Ÿ�� : ���� => void 
	 * �޼ҵ�� : printArray
	 * */
	public static void printArray(int num[]) {
		if(num == null || num.length == 0) {
			System.out.println("����� �迭�� �����ϴ�.");
			return ;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

	/* ��� : min���� max������ �ߺ����� ���� n���� ������ ���� �迭�� ��ȯ�ϴ� �޼ҵ� 
	 * �Ű����� : �ּҰ�, �ִ밪, ���� => int min, int max, int n
	 * ����Ÿ�� : �ߺ��������� ���� ������ �迭 => int []
	 * �޼ҵ�� : createRandomArray */
	public static int[] createRandomArray(int min, int max, int n) {
		if(n <= 0) {
			return null;
		}
		//min = 45, max = 1
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		//min=1, max=5, n=6
		if(max - min + 1 < n) {
			return null;
		}
		int arr[] = new int [n];
		for(int count = 0; count < n; ) {
			int r = (int)(Math.random()*(max-min+1) + min);
			if(!contains(arr, count, r)) {
				arr[count] = r;
				count++;
			}
		}
		return arr;
	}

	/* ��� : �� ���� �迭���� ���� ������ ������ �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� �迭 => int arr1[], int arr2[]
	 * ����Ÿ�� : ���� ������ ���� => int
	 * �޼ҵ�� : getCount*/
	public static int getCount(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		for(int tmp: arr1) {
			if(contains(arr2, arr2.length, tmp)) {
				count++;
			}
		}
		return count;
	}
	/* ��� : ��ġ�ϴ� ������ ���ʽ��� �ִ��� ������ �˷��ָ� ��÷ ����� ����ϴ� �޼ҵ�
	 * �Ű����� : ��ġ�ϴ� ����, ���ʽ� ��ġ ���� => int count , boolean bonusOk
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : printResult */
	public static void printResult(int count, boolean bonusOk) {
		if(count < 0 || count > 6) {
			System.out.println("����� Ȯ���� �� �����ϴ�.");
			return ;
		}
		switch(count) {
		case 6:
			System.out.println("1��!"); break;
		case 5:
			System.out.println(bonusOk?"2��!":"3��!");	break;
		case 4:
			System.out.println("4��!");	break;
		case 3:
			System.out.println("5��!");	break;
		default:
			System.out.println("��!");
		}
	}
}
