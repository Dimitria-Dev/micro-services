package com.microservice.advisor.client;

import com.microservice.advisor.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.student-url:http://localhost:8090/api/v1/students}" )
public interface StudentClient {

    @GetMapping("/advisor/{advisor-id}")
    List<Student> findAllStudentsByAdvisor(@PathVariable("advisor-id") Integer advisorId);
}
