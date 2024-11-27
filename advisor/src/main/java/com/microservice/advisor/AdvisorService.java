package com.microservice.advisor;

import com.microservice.advisor.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvisorService {
    private final AdvisorRepo repository;
    private final StudentClient client;

    Logger logger = LoggerFactory.getLogger(AdvisorService.class);

    public void save(Advisor advisor) {
        logger.info("A new advisor has been created ");
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
