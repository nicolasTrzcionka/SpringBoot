package palo.it.samplegradleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 */
@SpringBootApplication
public class SampleGradleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleGradleProjectApplication.class, args);
	}

}
