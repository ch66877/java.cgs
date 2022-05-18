package DAY17;

import javax.print.DocFlavor.STRING;

public class EX6 {

	public static void main(String[] args) {
		Array<Integer> array = new Array<Integer>();
		Integer nums[] = {1, 2, 3, 4, 5};
        array.setArray(nums);
        array.print();
        
        Array<String>array2 = new Array<String>();
        String strs[] = {"�ȳ�", "�п�", "����"};
        array2.setArray(strs);
        array2.print();
	}

}

class  Array<T /*extends Number // ���ڵ带 �߱��ϸ� NumberŬ���� �Ǵ� ��ӹ��� Ŭ�����鸸 T�� �ü� �ִ�.*/>{
	private T arr[];
	private int size = 0;//���� ����� ���� ����
	private int capacity = 10;//�迭 �ִ� ũ��
	
	public Array() {
		this(10);
	}
	public Array(int capacity) {
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}
    public void print() {
    	for(int i=0; i<size; i++) {
    		System.out.println(arr[i]);
    	}
    }
    public void setArray(T arr[]) {
    	//�Ű����� �迭�� �ִ�ũ�Ⱑ ū �迭���� Ȯ��
    	if(capacity < arr.length) {
    		//�迭 ũ�� Ȯ��
    		capacity = arr.length;
    		//Ȯ��� ũ���� �� �迭 ����
    		T tmp[] = (T[]) new Object[capacity];
    		System.arraycopy(this.arr, 0, tmp, 0, this.arr.length);
    		this.arr = tmp;
    	}
    	this.size = size < arr.length ? arr.length : size;
    	int count = size < arr.length ? size : arr.length;
    	for(int i=0; i<count; i++) {
    		this.arr[i] = arr[i];
    	}
    }
    /* ?(���ϵ� ī��) ���׸� Ŭ�������� �޼ҵ忡 ���׸� Ŭ������ ��ü�� ���µ�, ���׸� Ÿ���� ���� �ٸ� ���
     * �޼ҵ忡�� ȣ���� �� �ְ� ����. �� �������� Integer Ÿ������ �� array�� String Ÿ������ �� arry2��
     * �Ű������� �����ͼ� print�� ����=> ���ϵ�ī�勚���� ���� */
    public void print(Array<?> array) {
    	array.print();
    }
}