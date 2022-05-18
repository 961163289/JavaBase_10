package try_catch异常处理.课堂练习;

public class Exception03 {
    public static void main(String[] args) {
        System.out.println(method());//i=4,3
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
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;//i=3 => 保存临时变量 temp=3
        } finally {//必须执行
            ++i;
            System.out.println("i = " + i);//i=4
        }
    }
}
