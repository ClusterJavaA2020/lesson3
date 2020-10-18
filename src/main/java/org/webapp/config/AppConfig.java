package org.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.webapp.Service.UserService;
import org.webapp.controller.UserController;
import org.webapp.model.CarModel;
import org.webapp.model.UserModel;

import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {UserController.class, UserService.class})
public class AppConfig {

    @Bean(name = "userList")
    Set<UserModel> userList() {
        Set<UserModel> userList = new HashSet<>();
        userList.add(UserModel.builder()
                .id(0)
                .name("John")
                .email("john@gmail.com")
                .password("12345")
                .build());
        userList.add(UserModel.builder()
                .id(1)
                .name("Mike")
                .email("mike@gmail.com")
                .password("54321")
                .build());
        userList.add(UserModel.builder()
                .id(2)
                .name("Polly")
                .email("polly@gmail.com")
                .password("11111")
                .build());
        return userList;
    }

    @Bean(name = "carList")
    Set<CarModel> carList() {
        Set<CarModel> carList = new HashSet<>();
        carList.add(CarModel.builder()
                .id(0)
                .name("Fiat")
                .speed(200)
                .color("blue")
                .type("universal")
                .build());
        carList.add(CarModel.builder()
                .id(1)
                .name("Reno")
                .speed(240)
                .color("green")
                .type("pickup")
                .build());
        carList.add(CarModel.builder()
                .id(2)
                .name("Ford")
                .speed(180)
                .color("red")
                .type("sedan")
                .build());
        return carList;
    }
}