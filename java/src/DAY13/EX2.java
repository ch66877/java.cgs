package DAY13;

public class EX2 {

	public static void main(String[] args) {
		Controller controller[] = new Controller[3];
		controller[0] = new TvController();
		controller[1] = new TvController();
		controller[2] = new TvController();
		
		controller[1].run();
        for(int i = 0; i < 900; i++) {
        	if(controller[1] instanceof RadioController) {
        		RadioController tmp = (RadioController)controller[1];
        		tmp.frequencyUp();
        	}
        	if(controller[1] instanceof TvController) {
        		TvController tmp = (TvController)controller[1];
        		tmp.channellUp();
            }
        }
        System.out.println("------------");
        for(Controller tmp : controller) {
        	printController(tmp);
        	 System.out.println("------------");
        }
		
	}
	//�Ű������� �������̽��̸� ȣ���ҋ� �������̽��� ������ ���� ��ü�� �;� ��
	public static void printController (Controller con) {
	con.print();
	}
	/*
	public static void printController (TvController con) {
	con.print();
	}
	public static void printController (RadioController con) {
	con.print();
	}
	*/
}
