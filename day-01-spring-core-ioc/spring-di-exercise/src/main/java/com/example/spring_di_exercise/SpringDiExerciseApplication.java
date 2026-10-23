package com.example.spring_di_exercise;

import com.example.spring_di_exercise.namecheck.NameCheckConsumer;
import com.example.spring_di_exercise.notification.OrderProcessor;
import com.example.spring_di_exercise.scope.SingletonBean;
import com.example.spring_di_exercise.thirdparty.ThirdPartyConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringDiExerciseApplication {
	private static final Logger log =
			LoggerFactory.getLogger(SpringDiExerciseApplication.class);



	public static void main(String[] args) {
		SpringApplication.run(SpringDiExerciseApplication.class, args);
	}

	@Bean
	CommandLineRunner run(SingletonBean singletonBean, NameCheckConsumer nameCheckConsumer, ThirdPartyConsumer thirdPartyConsumer,
						  OrderProcessor orderProcessor, GreetingService greetingService, Environment environment, AppProperties appProperties
	){
		return  args -> {

//			singletonBean.test();
//			singletonBean.test();
//			singletonBean.test();
//			nameCheckConsumer.check();
//			thirdPartyConsumer.useClient();
//			orderProcessor.processOrder();
			System.out.println(greetingService.greeting());
			log.info("Greeting: {}",
					environment.getProperty("app.greeting"));

			System.out.println("App name: " + appProperties.name());
			System.out.println("Max items: " + appProperties.maxItems());



		};

	}

}
