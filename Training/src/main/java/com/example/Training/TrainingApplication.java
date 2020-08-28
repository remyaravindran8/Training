package com.example.Training;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Training.Supplier;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(TrainingApplication.class, args);
		Supplier S1 = context.getBean(Supplier.class);
		S1.show();
		Supplier S2 = context.getBean(Supplier.class);
		S2.show();

		
	}

}
