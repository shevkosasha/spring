package by.shevko.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
        System.out.println("private constructor");
    }

    public static ClassicalMusic classicalMusic(){
        System.out.println("factory");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian rhapsody";
    }
}
