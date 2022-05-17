package 课堂练习;

public class ExceptionExercise03 {
    int x;

    public static void main(String[] args) {

        int y;
        ExceptionExercise03 a = new ExceptionExercise03();
        y = 3 / a.x; // 3 / 0
        System.out.println("program ends ok!");
        //抛出 ArithmeticException
    }
}
