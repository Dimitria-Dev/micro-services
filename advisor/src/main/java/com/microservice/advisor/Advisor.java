package com.microservice.advisor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Advisor {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
