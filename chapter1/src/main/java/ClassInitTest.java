/**
 * @author 李浩淼
 */
public class ClassInitTest {

    private static int num = 1;

    static {
        num = 2;
        System.out.println(num);

        // 在下面定义 上面可以赋值，但是不能被调用
        number = 20;

        // error：非法的前向引用
//        System.out.println(number);
    }

    public static int number = 10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(number);
    }



}
