package try_catch异常处理.课堂练习;

public class Exception02 {
    public static void main(String[] args) {
        System.out.println(method());//输出4
    }

    public static int method() {
        int i = 1;
        try {
            i++;//i=2
            String[] names = new String[3];//String[] 数组
            if (names[1].equals("tom")) {  //NullPointerException
                System.out.println(names[1]);
            } else {
                names[3] = "zi.peng";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;//i=3
        } finally {//必须执行
            return ++i;//i=4
        }
    }
}
