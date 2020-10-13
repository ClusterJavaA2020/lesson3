package org.iryna97.lesson3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("org.iryna97.lesson3")
@EnableWebMvc
public class AppConfig {
}
