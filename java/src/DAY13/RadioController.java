package DAY13;

public class RadioController implements Controller {
	  private int frequency;
	    private int volumn;
	    private boolean power;
	    
		@Override
		public void run() {
			power = true;
			System.out.println("���� ������ �����ϴ�.");
			
		}

		@Override
		public void stop() {
			power = false;
			System.out.println("���� ������ �����ϴ�.");
		}

		@Override
		public void print() {
			System.out.println("���� : " + (power?"����":"����"));
			System.out.println("���ļ� : " + frequency);
			System.out.println("���� : " + volumn);
		}
		public void frequencyUp() {
			frequency = power ? frequency+1 : frequency;		
		}
		public void frequencyDown() {
			frequency = power ? frequency-1 : frequency;		
		}
	    public void volumUp() {
	    	volumn = power?volumn+1 : volumn;
	    }
	    public void volumDown() {
	    	volumn = power?volumn-1 : volumn;
	    }
	}

