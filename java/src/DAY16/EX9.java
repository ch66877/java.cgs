package DAY16;

public class EX9 {

	public static void main(String[] args) {
		/* ������ ���� �����̸��� �־����� �� ���� �̹������� �ƴ��� �����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ���� Ȯ���ڰ� jpg, png, bmp�� ��� �̹����� ����
		 */
		
		String fileName = "test.jpg.txt";
		//���������� .�� ã�Ƽ� 
		int index = fileName.lastIndexOf(".");
		//switch���� �̿��Ͽ� �̹��� ã��
		if(index != -1) {
			//.�ڿ��ִ� ���ڿ��� ������
			String endwith = fileName.substring(index+1);
			//������ ���ڿ��� jpg, png, bmp�� üũ
			//���߿� ������ ������ �̹���, ������ �̹��� �ƴ�
			switch(endwith) {
			case "jpg",  "bmp", "png":
				System.out.println(fileName +"�� �̹����Դϴ�.");
				break;
			default:
				System.out.println(fileName +"�� �̹����� �ƴմϴ�.");
			}
		}else {
			System.out.println(fileName +"�� �̹����� �ƴմϴ�.");
		}

		//�ݺ����� �̿��Ͽ� �̹��� ã��
		String img[] = {"jpg", "bmp", "png"};

		if(index != -1) {
			//.�ڿ��ִ� ���ڿ��� ������
			String endwith = fileName.substring(index+1);
			//������ ���ڿ��� jpg, png, bmp�� üũ
			//���߿� ������ ������ �̹���, ������ �̹��� �ƴ�
			int i;
			for(i = 0; i<img.length; i++) {
				if(img[i].equals(endwith)) {
					break;
				}
			}
			if(i < img.length) {
				System.out.println(fileName +"�� �̹����Դϴ�.");
			}else {
				System.out.println(fileName +"�� �̹����� �ƴմϴ�.");
			}
		}else {
			System.out.println(fileName +"�� �̹����� �ƴմϴ�.");
		}
		//endWith�� �̿��Ͽ� �̹��� ã��
		String img2[] = {".jpg", ".bmp", ".png"};
		int i;
		/* ���ڿ�1.endWith(���ڿ�2) : ���ڿ�1�� ���ڿ�2�� �������� �˷���(��/����)*/
		for(i=0; i<img2.length; i++) {
			if(fileName.endsWith(img2[i])) {
				break;
			}
		}
		if(i < img2.length) {
			System.out.println(fileName +"�� �̹����Դϴ�.");
		}else {
			System.out.println(fileName +"�� �̹����� �ƴմϴ�.");
		}
		//substring�� �̿����� �ʰ� �̹��� ã��
		int length = fileName.length();

		for(i = 0; i < img2.length; i++) {
			index = fileName.lastIndexOf(img2[i]);
			if(index == length - img2[i].length()) {
				break;
			}
		}
		if(i < img2.length) {
			System.out.println(fileName +"�� �̹����Դϴ�.");
		}else {
			System.out.println(fileName +"�� �̹����� �ƴմϴ�.");
		}
	}

}