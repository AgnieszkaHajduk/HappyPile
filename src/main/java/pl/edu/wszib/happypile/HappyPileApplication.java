package pl.edu.wszib.happypile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class HappyPileApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyPileApplication.class, args);
    }

}
