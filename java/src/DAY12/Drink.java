package DAY12;

public class Drink extends product {

	private int capacity;//�뷮 ml
	
	public Drink(String name, int price, int amount, int capacity) {
		super(name, price, amount);
		this.capacity = capacity;
	}
	public Drink(Drink product) {
    	this(product.getName(), product.getPrice(),
    			product.getAmount(), product.getCapacity());  
    }

	@Override
	public void print() {
		if(capacity<1000) {
			System.out.println(getName() + "[" + capacity + "m1] :"  + getPrice()+"��- ");
		}
		else {
		System.out.println(getName() + "[" + capacity + "1] : "  + getPrice()+"��- ");
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
