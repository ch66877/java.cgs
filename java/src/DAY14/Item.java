package DAY14;

//����
public class Item implements Cloneable {
    //��¥,����(����/����), ����(�������), ���׸�, �ݾ�
	private String date;
	private boolean income;//����(����/����)
	private String payment;//��������
	private String content;//�׸�
	private int price;//�ݾ�
	
	@Override
	public Item clone() {
	    Item obj = null;
	    
	    try {
	        obj = (Item) super.clone();
	    } catch (CloneNotSupportedException e) {
	    	
	    	e.printStackTrace();
	    }
	    return obj;
	}   
	//���� ���
	public void modify(String date, boolean income, String payment, String content, int parice, int price) {
        if(date != null) {
        	this.date = date;
        }
	    if(payment != null) {
    	    this.payment = payment;
	    }
	    if(content != null) {
    	    this.content = content;
	    }
	    if(price >= 0) {
	    	this.price = price;
	    }
    	this.income = income;
	   }    

	@Override
	public String toString() {
		return "���� [�Ͻ� : " + date + " | " + (income?"����":"����") + "|������ : " + payment + "| �� : " + content
				+ "| ���� : " + price + "��]";
	}

	public Item(String date, boolean income, String payment, String content, int parice) {
		this.date = date;
		this.income = income;
		this.payment = payment;
		this.content = content;
		this.price = parice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isIncome() {
		return income;
	}
	public void setIncome(boolean income) {
		this.income = income;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getParice() {
		return price;
	}
	public void setParice(int parice) {
		this.price = parice;
	}
	
	
	
}
