package DAY13;

public class TvController implements Controller {
    private int channel;
    private int volumn;
    private boolean power;
    
	@Override
	public void run() {
		power = true;
		System.out.println("TV ������ �����ϴ�.");
		
	}

	@Override
	public void stop() {
		power = false;
		System.out.println("TV ������ �����ϴ�.");
	}

	@Override
	public void print() {
		System.out.println("���� : " + (power?"����":"����"));
		System.out.println("ü�� : " + channel);
		System.out.println("���� : " + volumn);
	}
	public void channellUp() {
		channel = power ? channel+1 : channel;		
	}
	public void frequencyDown() {
		channel = power ? channel-1 : channel;		
	}
    public void volumUp() {
    	volumn = power?volumn+1 : volumn;
    }
    public void volumDown() {
    	volumn = power?volumn-1 : volumn;
    }
}
