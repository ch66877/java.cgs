package DAY6;

public class EX3 {

	public static void main(String[] args) {
		int [] arr ;
		int [] arr2 = null;
		//5��¥�� ���� �迭�� ����� ������ �ʱ�ȭ
		int [] arr3 = new int[5];
		int size = 5;
		//5��¥�� ���� �迭�� ����� ������ �ʱ�ȭ
		int [] arr4 = new int[size];
		//5��¥�� ���� �迭�� ����� ������ �ʱ�ȭ
		int [] arr5 = new int[5];
		
		int arr6[], arr7;//arr6 : �迭 arr7 : ����
		int []arr8, arr9;//arr8 : �迭 arr9 : �迭
		//{}�� �̿��Ͽ� �ʱ�ȭ �ϴ� ����� �迭 ����� ���ÿ� �ʱ�ȭ �ϴ� ��츸 ����
        int []arr10 = {1,2,3};
        //arr10= {4,5,6};//[]�� �̿��� ����� �ʱ�ȭ ���Ŀ��� ����� �Ұ���
        int []arr11 = new int[] {1,2,3};
        arr11 =new int [] {1,2,3};
        //�迭��.length : �迭�� ���̸� ������ �˷���
        System.out.println(arr11.length);
	}

}
