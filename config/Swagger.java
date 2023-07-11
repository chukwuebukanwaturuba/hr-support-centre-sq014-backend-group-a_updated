package com.hrsupportcentresq014.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class Swagger {
        @Value("v1")
        private String version;

        @Bean
        public OpenAPI api() {
            return new OpenAPI()
                    .info(new Info()
                            .title("Hr management")
                            .description("This is a HR management website")
                            .version(version));
        }

        @Bean
        public GroupedOpenApi hrEndpoint() {
            return GroupedOpenApi
                    .builder()
                    .group("HR")
                    .pathsToMatch("/api/v1/hr/**")
                    .build();
        }

        @Bean
        public GroupedOpenApi employeeEndpoint() {
            return GroupedOpenApi
                    .builder()
                    .group("employee")
                    .pathsToMatch("/api/v1/staff/**")
                    .build();
        }

        @Bean
        public GroupedOpenApi adminEndpoint() {
            return GroupedOpenApi
                    .builder()
                    .group("admin")
                    .pathsToMatch("/api/v1/admin/**")
                    .build();
        }

        @Bean
        public GroupedOpenApi authenticationEndpoint() {
            return GroupedOpenApi
                    .builder()
                    .group("authentication")
                    .pathsToMatch("/api/**")
                    .build();
        }
    }

