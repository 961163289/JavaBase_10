package try_catch异常处理;

public class TryCatchDetail02 {
    public static void main(String[] args) {

        //老韩解读
        //1.如果 try 代码块有可能有多个异常
        //2.可以使用多个 catch 分别捕获不同的异常，相应处理
        //3.要求子类异常写在前面，父类异常写在后面
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//NullPointerException

            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;

        } catch (NullPointerException e) {
            System.out.println("空指针异常: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算术异常: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 代码块...");
        }

    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}

