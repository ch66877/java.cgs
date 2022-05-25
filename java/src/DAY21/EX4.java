package DAY21;

import java.util.function.Consumer;

public class EX4 {

	public static void main(String[] args) {
		Consumer<String> consumer = (String str)->System.out.println(str);
		consumer.accept("¾È³ç");

		Point pt = new Point();
		Consumer<Point> ptConsumer = (Point pt1)->System.out.println(pt1.x + ", " + pt1.y );
		ptConsumer.accept(pt);

		System.out.println(pt);
	}

}

class Point{
	int x, y;

	@Override
	public String toString() {
		return x + ", " + y;
	}


}