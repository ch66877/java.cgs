package DAY15;

public class EX16 {

	public static void main(String[] args) {
		try {
			//throw new UserException();
			throw new Exception("ȸ�� ���� ����");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
//����� ���� ���� Ŭ����
class UserException extends Exception{

	public UserException() {
		super("ȸ�� ���� ����");
	}
	public UserException(String message) {
		super(message);
	}
}
