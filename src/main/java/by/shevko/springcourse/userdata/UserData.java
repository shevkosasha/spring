package by.shevko.springcourse.userdata;

import org.springframework.stereotype.Component;

@Component
public class UserData {
    private String name = "Alex";
    private int age = 36;

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //    public void data(){
//        System.out.println(" some user data ");
//    }
}
