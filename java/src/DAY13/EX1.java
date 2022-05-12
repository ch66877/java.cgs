package DAY13;

public class EX1 {

	public static void main(String[] args) {
		//Controller con = new Controller();//에러 발생 : 인터페이스로 객체를를 생성할 수 없다
		RemoteController rc = new RemoteController();
		rc.print();
		rc.run();
		rc.print();
		rc.stop();
		rc.print();
		//익명 구현 객체 : 익명 클래스를 이용하여 객체를 생성 => 인터페이스를 이용하요 같은 종류의 객체를 1개만 만들면 될떄 사용
		Controller rc2 = new Controller() {
			@Override
			public void stop() {
				System.out.println("중지");
		}
		@Override
		public void run() {
			System.out.println("시작");
		}
		@Override
		public void print() {
			System.out.println("출력");
		}
	};
	rc.print();
	rc.run();
	rc.print();
	rc.stop();
	rc.print();
  }
}