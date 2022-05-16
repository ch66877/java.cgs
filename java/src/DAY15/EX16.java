package DAY15;

public class EX16 {

	public static void main(String[] args) {
		try {
			//throw new UserException();
			throw new Exception("회원 관리 예외");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
//사용자 정의 예외 클래스
class UserException extends Exception{

	public UserException() {
		super("회원 관리 예외");
	}
	public UserException(String message) {
		super(message);
	}
}
