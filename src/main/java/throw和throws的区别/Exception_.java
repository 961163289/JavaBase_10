package throw和throws的区别;

public class Exception_ {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}

class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("调用B方法的finally");
        }
    }
}
/**
 * 输出内容:
 * <p>
 * 进入方法A
 * 用A方法的finally
 * 制造异常
 * 进入方法B
 * 调用B方法的finally
 * Exception in thread "main" java.lang.RuntimeException: 制造异常
 * at throw和throws的区别.ReturnExceptionDemo.methodB(Exception_.java:27)
 * at throw和throws的区别.Exception_.main(Exception_.java:10)
 */