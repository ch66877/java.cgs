package DAY19;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
    private String type, title, content, writer;
    private int num, view;
    private Date registerDate;
    
    private static int count = 0;
    
	public void modify(String type, String title, String content, String writer) {
		this.type = type;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.num = ++count;
		this.registerDate = new Date();
	}
    
    public Board() {}

	public Board(String name, int num2, Object object, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public String getRegisterDate() {
		if(registerDate == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(registerDate);
	}
    
    public void modify(String title, String content) {
    	this.title = title;
    	this.content = content;
    }

    public void detailprint() {
    	System.out.println("===========================");
    	System.out.println("��ȣ : " + num);
    	System.out.println("���� : " + title);
    	System.out.println("�ۼ���:" + writer);
    	System.out.println("�ۼ���: " + getRegisterDate());
    	System.out.println("��ȸ��:" + view);
    	System.out.println("���� : " + content);
    	System.out.println("===========================");
    }
    
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat();
		return df.format(num) + "\t" + type + "\t"+ title + "\t" + 
				getRegisterDate() + "\t" + view;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (num != other.num)
			return false;
		if (registerDate == null) {
			if (other.registerDate != null)
				return false;
		} else if (!registerDate.equals(other.registerDate))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (view != other.view)
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
	
}
