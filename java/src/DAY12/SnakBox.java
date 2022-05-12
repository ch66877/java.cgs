package DAY12;

public class SnakBox extends product {
	
	private int count;

	public SnakBox(String name, int price, int amount, int count) {
		super(name, price, amount);
		this.count = count;
	}
    public SnakBox(SnakBox product) {
    	this(product.getName(), product.getPrice(),
    			product.getAmount(), product.getCount());  
    }
	@Override
	public void print() {
		System.out.println(getName() + "[박스당"+count+"개 : " + getPrice()+"원- ");
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
