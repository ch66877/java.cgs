package DAY13;

public interface Controller {
    int MIN = 1;//public static final�� �տ� �ڵ����� �ٴ´�.
    void run();//public abstract �տ� �ڵ����� �ٴ´�
    void stop();
    void print();
    default void test() {}
}
