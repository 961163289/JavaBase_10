package 本章练习;

public class Homework03 {
    public static void main(String[] args) {
        //打印结果: BCD
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void func() { //静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
}
