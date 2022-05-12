package DAY12;

public class Car {
    private Tire tire[];

	public Car(Tire[] tire) {
		this.tire = tire;
	}
    public void print() {
    	if(tire == null) {
    		return;
    	}
    	for(Tire tmp : tire) {
    		if(tmp instanceof HankookTire) {
    			System.out.println(HankookTire.COMPANY + " : ");
    			
    		}
    		System.out.println(tmp.getPosition() + ", �з� : " + tmp.getPressure() + ", ���� : " + tmp.getState());
    	}
    }
    public void repare(int index, Tire tire ) {
    	if(this.tire == null || this.tire.length <= index) {
    		return;
    	}
    	this.tire[index] = tire;
    }
}
