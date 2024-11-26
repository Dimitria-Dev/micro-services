package com.microservice.advisor;

import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullAdvisorResponse {

    private String firstName;
    private String lastName;
    private String email;

    List<Student> students;
}
