package DAY13;

public class RemoteController implements Controller{
	
	private boolean power;

	@Override
	public void run() {
		power = true;
		
	}

	@Override
	public void stop() {
		power = false;
	}
	@Override
	public void print() {
		if(power) {
			System.out.println("�������Դϴ�.");
		}else {
			System.out.println("�������Դϴ�.");
		}
		
	}
	
}
