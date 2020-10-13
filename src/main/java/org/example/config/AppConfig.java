package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {UserController.class})
public class AppConfig {
    @Bean
    ObjectMapper objectMapper(){
        return  new ObjectMapper();
    };
}
