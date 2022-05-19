package 本章练习;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrs = new int[2];
        for (int i = 0; i < arrs.length; i++) {
            try {
                System.out.println("请输入第" + (i + 1) + "个数字: ");
                arrs[i] = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("格式不正确, " + e.getMessage());
                return;
            }
        }
        try {
            double res = cal(arrs[0], arrs[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界, " + e.getMessage());
        }
    }

    public static double cal(int n1, int n2) {
        double res = 0;
        try {
            res = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("除数为0, " + e.getMessage());
            return res;
        }
        return res;
    }
}
