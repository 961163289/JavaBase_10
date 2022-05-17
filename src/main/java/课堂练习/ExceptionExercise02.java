package 课堂练习;

public class ExceptionExercise02 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat = null;
        System.out.println(cat.name);
        //出现 NullPointerException

    }
}

class Cat {
    public String name;
}
