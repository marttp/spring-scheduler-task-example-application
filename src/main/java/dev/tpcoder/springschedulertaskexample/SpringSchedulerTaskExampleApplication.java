package dev.tpcoder.springschedulertaskexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulerTaskExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerTaskExampleApplication.class, args);
	}

}
