package com.kuu.MyPlates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MyPlatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPlatesApplication.class, args);
	}

}
