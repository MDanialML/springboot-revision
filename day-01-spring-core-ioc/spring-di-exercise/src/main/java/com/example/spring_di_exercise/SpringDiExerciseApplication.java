package com.example.spring_di_exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;


@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringDiExerciseApplication {
	private static final Logger log =
			LoggerFactory.getLogger(SpringDiExerciseApplication.class);
	@Value("${app.greeting}")
	private String greeting;



	public static void main(String[] args) {
		SpringApplication.run(SpringDiExerciseApplication.class, args);
	}

	@Bean
	CommandLineRunner run(
						  ){
		return  args -> {

			System.out.println("I am in enviroment: " + greeting);


		};

	}

}
