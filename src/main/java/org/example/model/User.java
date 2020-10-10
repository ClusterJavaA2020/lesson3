package org.example.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class User {

    private Integer id;
    private String name;
    private Integer age;

}
