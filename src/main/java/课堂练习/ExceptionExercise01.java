package 课堂练习;

public class ExceptionExercise01 {
    public static void main(String[] args) {

        String friends[] = {"tom", "jack", "milan"};
        for (int i = 0; i < 4; i++) {
            System.out.println(friends[i]);
        }
        //出现 ArrayIndexOutOfBoundsException

    }
}
