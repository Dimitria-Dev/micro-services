package com.microservice.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String message;
    private String degreeProgram;
    private Integer advisorId;

}
