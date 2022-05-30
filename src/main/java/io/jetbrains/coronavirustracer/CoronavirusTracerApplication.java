package io.jetbrains.coronavirustracer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTracerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTracerApplication.class, args);
	}

}
