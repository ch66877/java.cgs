package DAY15;

public class EX17 {

		/* �ߺ����� ���� 1~9������ �� ������ �������� �����Ͽ� �迭�� �����ϰ� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, �ߺ����� ���� 1~9������ �� ������ �������� �����Ͽ� �迭�� �����ϴ� �޼ҵ带 ���� Ȱ��
		 * ���� ó���� �ؾ��� */
		public static void main(String[] args) {
			int arr[];
			int min = 1, max = 9;
			int n = 3;
			try {
				arr = createRandomArray(min, max, n);
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		/* �迭 arr�� n�� ��� �߿��� num�� ��ġ�ϴ� ���� ������ true,���� Ȯ������ �� ������ false�� ��ȯ */
		public static boolean contains(int arr[],int n, int num) throws Exception{
			if(arr == null) {
				throw new Exception("�迭�� ����ֽ��ϴ�.");
			}
			if(arr.length < n) {
				n = arr.length;
			}

			for(int i=0; i<n; i++) {
				if(arr[i] == num) {
					return true;
				}
			}

			return false;
		}
		/* �ּҰ��� �ִ밪�� �������� ������ �־����� �ߺ����� ���� ������ ���� ����ִ� �迭�� ���� ��ȯ */
		public static int [] createRandomArray(int min, int max, int n) throws Exception {
			if(min > max) {
				int tmp = min;
				min = max;
				max = tmp;
			}
			if(max - min + 1 < n) {
				throw new Exception(min +"�� " + max+" ���̿��� " + n + "���� �ߺ����� ���� �迭�� ����� �����ϴ�");
			}
			if(n <= 0) {
				throw new Exception(n+"���� �迭�� ���� �� �����ϴ�.");
			}
			int arr[] = new int [n];
			int count = 0;
			while(count < n) {
				int r = (int)(Math.random()*(max - min + 1) + min);
				if(!contains(arr, count, r)) {
					arr[count] = r;
					count++;
				}
			}
			return arr;
		}
	}
