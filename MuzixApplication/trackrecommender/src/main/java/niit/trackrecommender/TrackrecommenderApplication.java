package niit.trackrecommender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TrackrecommenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackrecommenderApplication.class, args);
	}

}
