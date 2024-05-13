package dio.web.myfirstwebapi.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    @Bean
    public OpenAPI swaggerApiConfig() {
        var info = new Info()
                .title("MyFirst API")
                .description("Just my first API")
                .version("1.0");
        return new OpenAPI().info(info);
    }
}
