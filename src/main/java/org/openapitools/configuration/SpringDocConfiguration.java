package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Box Platform API")
                                .description("[Box Platform](https://box.dev) provides functionality to provide access to content stored within [Box](https://box.com). It provides endpoints for basic manipulation of files and folders, management of users within an enterprise, as well as more complex topics such as legal holds and retention policies.")
                                .termsOfService("https://cloud.app.box.com/s/rmwxu64h1ipr41u49w3bbuvbsa29wku9")
                                .contact(
                                        new Contact()
                                                .name("Box, Inc")
                                                .url("https://box.dev")
                                                .email("devrel@box.com")
                                )
                                .license(
                                        new License()
                                                .name("Apache-2.0")
                                                .url("http://www.apache.org/licenses/LICENSE-2.0")
                                )
                                .version("2.0.0")
                )
        ;
    }
}