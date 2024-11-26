package com.microservice.advisor;

import com.microservice.advisor.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvisorService {
    private final AdvisorRepo repository;

    private final StudentClient client;

    public void save(Advisor advisor) {
        repository.save(advisor);
    }

    public List<Advisor> findAll() {
        return repository.findAll();
    }

    public FullAdvisorResponse findAdvisorsWithStudents(Integer advisorId) {
        var advisor = repository.findById(advisorId)
                .orElse(Advisor.builder()
                        .firstName("NOT_FOUND")
                        .lastName("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build());

        var students = client.findAllStudentsByAdvisor(advisorId); //find all students from student service
        return FullAdvisorResponse.builder()
                .firstName(advisor.getFirstName())
                .lastName(advisor.getLastName())
                .email(advisor.getEmail())
                .students(students)
                .build();
    }
}
