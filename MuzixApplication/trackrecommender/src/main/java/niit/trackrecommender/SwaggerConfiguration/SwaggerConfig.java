package niit.trackrecommender.SwaggerConfiguration;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableSwagger2
public class SwaggerConfig {
//    @Bean
//    //Docket is a Builder which is intended to be primary interface into swagger -spring mvc framework , this will create an UI
//    public Docket UserTrackServiceApi(){
//        //path of base package is the name of the package all the way down to controllers location
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("niit.trackrecommender.Controller"))
//                .paths(regex("/api/v3/.*")).build();//matching controller paths of that service(regex ' . ' means "all/anything that is present" in regex )
//    }//end of function


    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("niit.trackrecommender.Controller")
                .pathsToMatch("/api/v3/**")
                .build();
    }
}
