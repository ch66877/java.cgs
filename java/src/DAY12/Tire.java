package DAY12;

public class Tire {

	private int state;     //Ÿ�̾��� ����(100: ����, 0:��ü)
	private int pressure;  //Ÿ�̾��
	private String position;//Ÿ�̾� ��ġ
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public Tire(int state, int pressure, String position) {
		this.state = state;
		this.pressure = pressure;
		this.position = position;
	}
	public Tire() {
		this(100,0,null);
	}
	public String getPosition() {
		
		return null;
	}
	
 }
