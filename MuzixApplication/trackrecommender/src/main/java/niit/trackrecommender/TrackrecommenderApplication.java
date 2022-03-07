package niit.trackrecommender;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info= @Info(title="TRACK RECOMMENDER SERVICE",version="${springdoc.version}",description="TRACK RECOMMENDER SERVICE API V1.0"))
public class TrackrecommenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackrecommenderApplication.class, args);
	}

}
