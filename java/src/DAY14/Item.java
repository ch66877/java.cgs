package DAY14;

//내역
public class Item implements Cloneable {
    //날짜,구분(수입/지출), 구분(결제방식), 상세항목, 금액
	private String date;
	private boolean income;//구분(수입/지출)
	private String payment;//결제망식
	private String content;//항목
	private int price;//금액
	
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
	//수정 기능
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
		return "내역 [일시 : " + date + " | " + (income?"수입":"지출") + "|결재방식 : " + payment + "| 상세 : " + content
				+ "| 가격 : " + price + "원]";
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
