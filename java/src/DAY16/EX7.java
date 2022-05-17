package DAY16;

public class EX7 {

	public static void main(String[] args) {
		String str = "I love c";
	    System.out.println(str);
		str = str.replace("C","JAVA");
        System.out.println(str);
        str = str + ". JAVA is programing languge";
        System.out.println(str);
        str = str.replace("JAVA", "C");
        System.out.println(str);
	}

}
