package org.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.webapp.model.UserModel;

import java.util.Set;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.webapp.controller")
public class AppConfig {

    @Bean(name = "userList")
    Set<UserModel> userList() {
        return Set.of(
                UserModel.builder()
                        .id(0)
                        .name("John")
                        .email("john@gmail.com")
                        .password("12345")
                        .build(),
                UserModel.builder()
                        .id(1)
                        .name("Mike")
                        .email("mike@gmail.com")
                        .password("54321")
                        .build(),
                UserModel.builder()
                        .id(2)
                        .name("Polly")
                        .email("polly@gmail.com")
                        .password("11111")
                        .build()
        );
    }
}