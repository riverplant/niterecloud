package com.nitere.cloud.commons.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    public GroupedOpenApi productionApi() {
        return GroupedOpenApi.builder().group("品牌微服務模塊").pathsToMatch("/brand/**").build();
    }


    public OpenAPI docsOpenApi() {
        return new OpenAPI()
                .info(new Info().title("niterecloud")
                        .description("RestApi")
                        .version("V1.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("Nitere")
                        .url(""));
    }
}
