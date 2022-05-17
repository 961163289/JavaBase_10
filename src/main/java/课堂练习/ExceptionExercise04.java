package 课堂练习;

import java.util.Date;

public class ExceptionExercise04 {
    public static void main(String[] args) {

        Object obj = new Date();
        ExceptionExercise04 exception;
        exception = (ExceptionExercise04)obj;
        System.out.println(exception);
        //抛出 ClassCastException

    }
}
