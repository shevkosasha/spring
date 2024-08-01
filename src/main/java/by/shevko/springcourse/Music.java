package by.shevko.springcourse;

public interface Music {

    String getSong();
    default void init(){
        System.out.println("do init");
    };
    default void destroy(){
        System.out.println("do destroy");
    };
}
