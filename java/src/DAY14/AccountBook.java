package DAY14;
//�����
public class AccountBook {
	//������ �ִ� ����
	public static final int MAX = 100;
	//����ο��� ������ �ִ� 100�� ����� �� �ִ�
	private Item items[] = new Item[MAX];
	private int count;//���� ��ϵ� ������ ����
	private int modifyItem;
	
    /* ��� : ������� ��ϵ� ������ Ȯ���ϴ� �޼ҵ�
     *       items�� �ִ� �������� count�� ����ϴ� �޼ҵ�
     * �Ű����� : ����
     * ����Ÿ�� : ���� => void
     * �޼ҵ�� : readItems
     * */
	public void readItems() {
		if(count == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		for(int i = 0; i<count; i++) {
			System.out.println(i+1+", "+items[i]);//items[i]�� items[i].toString()�� ȣ��
		}
	}
	/* ��� : ����ο� �� ������ �߰��Ͽ� �߰��ƴ����� �˷��ִ� �޼ҵ�
	 *       �� ����(Item)�� �־����� items�� �߰��ϴ� �޼ҵ�
	 * �Ű����� : �� ���� => Item item
	 * ����Ÿ�� : �߰� ���� => ����/���� => boolean
	 * �޼ҵ�� : insertItem
	 */
	public boolean insertItem(Item item) {
		//����ο� �� ������ ���� ���
		if(count == MAX) {
			return false;
		}
		//�߰��ؾ��ϴ� ������ ����� ��
        if(item == null) {
        	return false;
        }
		items[count] = item;
		return true;
	}
	/* ��� : ����ο� ���� ������ �����Ͽ� ������ ������ �˷��ִ� �޼ҵ�
	 *       ������ ������ �־����� �־��� ������ �����ϰ� �˷��ִ� �޼ҵ�
	 * �Ű����� : ������ ���� => int delIndex
	 * ����Ÿ�� : ������ ���� => Item
	 * �޼ҵ�� : deleteItem
	 */
	public Item deleteItem(int delIndex) {
		if(delIndex >= count ||delIndex <0) {
			return null;
		}
		//������ ������ �ӽ�����(���߿� �˷���� �ϱ� ������)
		Item delItem = items[delIndex];
		//������ ��ġ���� �ϳ��� �о���
		for(int i=delIndex; i<count-1; i++) {
			items[i] = items[i+1];
		}
		//������ ����� ������ ����
		count--;
		//������ ������ �˷���
		return delItem;
	}
	/* ��� : ����ο��� ���� ������ �����Ͽ� ���� ���θ� �˷��ִ� �޼ҵ�
	 * 
	 * �Ű����� : ������ ����, ������ ����� => int modIndex(String date, boolean income, String payment, String content, int parice, int price)
	 * ����Ÿ�� : ���� ���� => boolean
	 * �޼ҵ�� : modifyItem
	 */
	public boolean modifyItem(String date, boolean income, String payment, String content, int parice, int price) {
		//�߸��� ������ ���
		if(modifyItem >= count ||modifyItem <0) {
			return false;
		}
	    items[modifyItem].modify(date, income, payment, content, parice, price);
	    return true;
    }
	public Item getItem(int index) {
    	if(index < 0 || index >= count) {
    		return null;
    	}
    	return items[index].clone();
    }
	public void readItems(String type, String date) {
		switch(type) {
		case "date":
			for(int i = 0; i<count; i++) {
				if(items[i].getDate().equals(date)) {
					System.out.println(i+1+", " + items[i]);
				}
			}
			break;
		}
		
	}
	public boolean modifyItem(int i, String date2, boolean income2, String payment2, String content2, int price2) {
		
		return false;
	}
}