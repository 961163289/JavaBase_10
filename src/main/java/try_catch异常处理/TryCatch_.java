package try_catch异常处理;

public class TryCatch_ {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
