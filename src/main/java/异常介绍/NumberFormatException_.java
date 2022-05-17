package 异常介绍;

public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "zi.peng";
        //将 String 转 int
        int num = Integer.parseInt(name);//抛出 NumberFormatException
        System.out.println(num);
    }
}
