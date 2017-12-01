package siendev.corp.courses.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
public class SpringBootCourseApplication {

    public static void main(String[] arg) {
        SpringApplication application = new SpringApplication(SpringBootCourseApplication.class);
        application.run(arg);
    }

}
