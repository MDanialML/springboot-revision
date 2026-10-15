package com.example.spring_di_exercise;

import com.example.spring_di_exercise.namecheck.NameCheckConsumer;
import com.example.spring_di_exercise.notification.OrderProcessor;
import com.example.spring_di_exercise.scope.SingletonBean;
import com.example.spring_di_exercise.thirdparty.ThirdPartyConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDiExerciseApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringDiExerciseApplication.class, args);
	}

	@Bean
	CommandLineRunner run(SingletonBean singletonBean, NameCheckConsumer nameCheckConsumer, ThirdPartyConsumer thirdPartyConsumer, OrderProcessor orderProcessor){
		return  args -> {

			singletonBean.test();
			singletonBean.test();
			singletonBean.test();
			nameCheckConsumer.check();
			thirdPartyConsumer.useClient();
			orderProcessor.processOrder();




		};
	}

}
