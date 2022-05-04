package DAY8;

public class EX8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = new int[] {1,2,3,4,5};
        int n = 3;
        int num = 4;
        printArray(arr);
        System.out.println(contains(arr,num));
        System.out.println(contains(arr, 7, num));
	}
	
	/* ��� : ������ �迭�� �־����� ��, �־��� �迭�� ���� �ֿܼ� ����ϴ� �޼ҵ�
     * �Ű����� : ������ �迭 => int num []
     * ����Ÿ�� : ���� => void 
     * �޼ҵ�� : printArray
     */
    public static void printArray(int num[]) {
    	if(num == null || num.length == 0) {
    		System.out.println("����� �迭�� �����ϴ�.");
    	    return;
    	}
        for(int i = 0; i < num.length; i++) {
        	System.out.println(num[i] + " ");
        }
	    System.out.println();
	 }
     /* ��� : ������ �迭�� ���� num�� �ִ��� ������ �˷��ִ� �޼ҵ�
      * {1,2,3,4,5}�� 6�� �ִ��� ������ Ȯ���Ͽ� �ִ� ���ٸ� �˷��ִ� �޼ҵ�
      * �Ű����� : ������ �迭, ���� num => int arr[], int num 
      * ����Ÿ�� : �ش� ���ڰ� �ִ��� ������ => boolean
      * �żҵ�� : cantains
      */
     public static boolean contains(int arr[], int num) {
    	 if(arr == null || arr.length == 0) {
    		 return false;
    	 }

    	 for(int tmp : arr) {
    		 if(tmp == num) {
    			return true;
    		 }
    	 }
    	 return false;  	 
     }
     /* ��� : ������ �迭���� ó������ n���߿��� ���� num�� �ִ��� ������ �˷��ִ� �޼ҵ�
      * �Ű����� : ������ �迭, Ȯ���� ���� n, ���� num => int arr[], int num 
      * ����Ÿ�� : �ش� ���ڰ� �ִ��� ������ => boolean
      * �żҵ�� : cantains
      */
     public static boolean contains(int arr[], int n, int num) {
    	 //�迭�� �߸��ǰų� �� ������ �߸��Ǽ� ���� �ʿ䰡 ���� ���
    	 if(arr == null || arr.length == 0) {
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
}