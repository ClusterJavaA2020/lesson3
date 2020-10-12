package org.webapp.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class UserModel {
    private int id;
    private String name;
    private String email;
    private String password;
}
