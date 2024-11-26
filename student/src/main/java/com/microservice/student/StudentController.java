package com.microservice.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudents(@RequestBody Student student) {
        service.save(student);
    }

    @GetMapping()
    public ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(service.findAll());
    }


    @GetMapping("/advisor/{advisor-id}")
    public ResponseEntity<List<Student>> findAllStudents(@PathVariable("advisor-id") Integer advisorId) {
        return ResponseEntity.ok(service.findAllStudentsByAdvisor(advisorId));
    }

}
