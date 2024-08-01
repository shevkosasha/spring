package by.shevko.springcourse.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.shevko.springcourse")
@PropertySource("classpath:player.properties")
public class SpringConfig {
}
