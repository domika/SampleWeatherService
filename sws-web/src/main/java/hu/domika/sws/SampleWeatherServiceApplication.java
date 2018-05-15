package hu.domika.sws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "hu.domika.sws")
public class SampleWeatherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleWeatherServiceApplication.class, args);
    }
}
