package com.microservice.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo repository;

    public void save(Student student) {
        repository.save(student);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public List<Student> findAllStudentsByAdvisor(Integer advisorId) {
        return repository.findAllByAdvisorId(advisorId);
    }
}
