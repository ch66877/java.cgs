package DAY16;

public class EX5 {

	public static void main(String[] args) {
		String str = "Hello world world";
        String search = "wo";
        /* - ���ڿ�.indexOf(�˻���)
         * - ��ġ�ϴ� ���ڿ��� ������ -1, ������ ���۹���
         * - ������ �־ ó�� �����ϴ� ������ ã��
         * - ���ڿ�.(�˻���, ���۹���)
         * - ���ڿ����� ���۹������� �˻�� ã�� ������ ���۹���, ������ -1 
         */
        int index = str.indexOf(search);
        if(index >= 0) {
        	System.out.println(str+" ���ڿ��� "+ search+"���ڿ���" + index + "������ �ֽ��ϴ�.");
        	index = str.indexOf(search, index+search.length());
        	if(index >= 0) {
        		System.out.println(str+" ���ڿ��� "+ search+"���ڿ���" + index + "������ 2�� �ֽ��ϴ�.");
        	}else {
        		System.out.println(str+" ���ڿ��� "+ search+"���ڿ��� 1�� �ֽ��ϴ�.");
        	}
        }else {
        	System.out.println(str+" ���ڿ��� "+ search+"���ڿ���" + "�����ϴ�.");
        }
        System.out.println(str.lastIndexOf(search));
        System.out.println(str.contains(search));
	}
 
}
