package org.webapp.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarModel {
    private int id;
    private String name;
    private int speed;
    private String color;
    private String type;

}
