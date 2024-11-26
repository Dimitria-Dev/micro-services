package com.microservice.advisor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/advisors")
@RequiredArgsConstructor
public class AdvisorController {

    private final AdvisorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Advisor advisor) {
        service.save(advisor);
    }

    @GetMapping
    public ResponseEntity<List<Advisor>> findAllAdvisors() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/with-students/{advisor-id}")
    public ResponseEntity<FullAdvisorResponse> findAllAdvisors(@PathVariable ("advisor-id") Integer advisorId) {
        return ResponseEntity.ok(service.findAdvisorsWithStudents(advisorId));
    }

}
