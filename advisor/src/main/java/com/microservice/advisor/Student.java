package com.microservice.advisor;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String message;
    private String degreeProgram;

}
