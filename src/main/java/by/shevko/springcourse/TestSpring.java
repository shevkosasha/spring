package by.shevko.springcourse;

import not_imp.Music;
import not_imp.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        System.out.println(context.getBean("testBean", TestBean.class).getName());
        context.close();
    }
}
