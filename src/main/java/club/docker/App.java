package club.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 念梓  on 2017/8/9.
 * Email:sunmch@163.com
 * author: 念梓
 * des:
 */

@SpringBootApplication
public class App {


    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(App.class);
        springApplication.run(args);

    }
}
