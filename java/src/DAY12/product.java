package DAY12;

public abstract class product {
    //��ǰ��
    private String name;
    //����
    private int price;
    //����
    private int amount;
    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}


	public void sumAmount(int amount) {
		this.amount = amount;
	}
    /* ��� : ������ �־����� ���� ������ �����ϴ� �޼ҵ�
     */
    public void sumAmaount(int amount) {
    	this.amount = amount;
    }
    public void setAmount(int amount) {
		this.amount = amount;
	}
    
	public product(String name) {
		this(name, 0, 0);
	}
	public product(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public abstract void print();
}
